package designsystem.component.annotated

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.withStyle
import designsystem.theme.PortfolioTheme

@Composable
fun AnnotatedString.Builder.appendGray(text: String) {
    withStyle(
        style = SpanStyle(color = PortfolioTheme.color.gray)
    ) {
        append(text = text)
    }
}
