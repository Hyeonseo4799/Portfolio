package designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.ui.text.AnnotatedString.Builder
import androidx.compose.foundation.text.appendInlineContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import designsystem.theme.PortfolioTheme

@Composable
fun CodeBlockText(
    text: String,
    useBoldCodeBlock: Boolean = false,
) {
    val widthTextUnits = remember { mutableStateListOf<TextUnit>() }

    val annotatedString = buildAnnotatedString {
        appendCodeBlockText(
            text = text,
            useBoldCodeBlock = useBoldCodeBlock
        ) { value ->
            widthTextUnits.add(calculatePaddedWidth(value.size.width))
        }
    }

    val placeholders = widthTextUnits.map {
        Placeholder(
            width = it,
            height = 1.5.em,
            placeholderVerticalAlign = PlaceholderVerticalAlign.TextCenter
        )
    }

    val inlineTextContent = placeholders.mapIndexed { index, placeholder ->
        "code$index" to InlineTextContent(placeholder = placeholder) {
            Text(
                modifier = Modifier
                    .background(
                        color = PortfolioTheme.color.blockBrown,
                        shape = RoundedCornerShape(3.dp)
                    )
                    .padding(horizontal = 6.4.dp),
                text = it,
                fontSize = 13.6.sp,
                textAlign = TextAlign.Justify,
                color = PortfolioTheme.color.red,
                fontWeight = if (useBoldCodeBlock) FontWeight.Bold else FontWeight.Normal,
            )
        }
    }.toMap()

    Text(
        text = annotatedString,
        inlineContent = inlineTextContent,
        style = MaterialTheme.typography.body1
    )
}

@Composable
private fun Builder.appendCodeBlockText(
    text: String,
    useBoldCodeBlock: Boolean,
    onTextMeasure: @Composable (TextLayoutResult) -> Unit,
) {
    val codeBlockRegex = "`(.+?)`".toRegex()
    val textMeasurer = rememberTextMeasurer()

    var currentIndex = 0

    codeBlockRegex.findAll(text).forEachIndexed { index, result ->
        val codeBlock = result.groupValues[1]
        val startIndex = result.range.first
        val endIndex = result.range.last + 1
        // FIXME: 특정 문자(ex: 아키텍처)에서 글자가 잘리는 문제
        val textStyle = MaterialTheme.typography.body1.copy(
            fontWeight = if (useBoldCodeBlock) FontWeight.Bold else FontWeight.Normal,
            fontSize = 13.6.sp
        )
        val textLayoutResult = textMeasurer.measure(
            text = codeBlock,
            style = textStyle,
        )

        onTextMeasure(textLayoutResult)

        if (currentIndex < startIndex) {
            append(text.substring(currentIndex, startIndex))
        }

        appendInlineContent("code$index", codeBlock)

        currentIndex = endIndex
    }

    if (currentIndex < text.length) {
        append(text.substring(currentIndex))
    }
}

@Composable
private fun calculatePaddedWidth(width: Int): TextUnit {
    return with(LocalDensity.current) {
        // horizontal padding(6.4.dp)을 반올림 한 값으로 설정
        // HACK: 특정 문자(ex: 아키텍처)에서 글자가 잘려 1.dp 추가
        val paddingPx = 14.dp.toPx()
        val textPx = width.toDp().toPx()
        (paddingPx + textPx).toSp()
    }
}
