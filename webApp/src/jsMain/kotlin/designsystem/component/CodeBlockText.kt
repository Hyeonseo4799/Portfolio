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
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import designsystem.theme.PortfolioTheme

@Composable
fun CodeBlockText(
    text: String,
) {
    val widthTextUnits = remember { mutableStateListOf<TextUnit>() }

    val annotatedString = buildAnnotatedString {
        appendCodeBlockText(text = text) { value ->
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
                color = PortfolioTheme.color.red
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
    onTextMeasure: @Composable (TextLayoutResult) -> Unit,
) {
    val codeBlockRegex = "`(.+?)`".toRegex()
    val textMeasurer = rememberTextMeasurer()

    var currentIndex = 0

    codeBlockRegex.findAll(text).forEachIndexed { index, result ->
        val codeBlock = result.groupValues[1]
        val startIndex = result.range.first
        val endIndex = result.range.last + 1
        val textLayoutResult = textMeasurer.measure(
            text = codeBlock,
            style = MaterialTheme.typography.body1,
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
        val paddingPx = 13.dp.toPx()
        val textPx = width.toDp().toPx()
        (paddingPx + textPx).toSp()
    }
}
