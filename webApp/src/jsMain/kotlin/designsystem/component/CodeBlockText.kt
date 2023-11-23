package designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import designsystem.theme.PortfolioTheme

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun CodeBlockText(
    fullText: String,
    highlightedWords: List<String>,
    boldCodeBlock: Boolean = false,
) {
    val words = fullText.split(" ")

    // TODO: Lazy 하게 표시되도록 변경하기
    FlowRow {
        words.forEach { word ->
            val isCodeBlock = word in highlightedWords

            Text(
                modifier = Modifier
                    .background(
                        color = if (isCodeBlock) PortfolioTheme.color.blockBrown else Color.Transparent,
                        shape = RoundedCornerShape(3.dp)
                    )
                    .padding(
                        horizontal = if (isCodeBlock) 6.4.dp else 0.dp,
                        vertical = if (isCodeBlock) 3.2.dp else 0.dp
                    )
                    .align(Alignment.CenterVertically),
                text = " $word ",
                fontSize = if (isCodeBlock) 13.6.sp else 16.sp,
                style = MaterialTheme.typography.body1,
                fontWeight = if (isCodeBlock && boldCodeBlock) FontWeight.Bold else FontWeight.Normal,
                color = if (isCodeBlock) PortfolioTheme.color.red else Color.Black
            )
        }
    }
}
