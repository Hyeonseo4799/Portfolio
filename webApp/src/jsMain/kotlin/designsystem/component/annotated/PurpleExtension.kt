package designsystem.component.annotated

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.AnnotatedString.Builder
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.withStyle
import designsystem.theme.PortfolioTheme

@Composable
fun Builder.appendPurple(text: String) {
    withStyle(
        style = SpanStyle(background = PortfolioTheme.color.blockPurple)
    ) {
        append(text = text)
    }
}
