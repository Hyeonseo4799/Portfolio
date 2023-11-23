package designsystem.component.annotated

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.AnnotatedString.Builder
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle

@Composable
fun Builder.appendBold(text: String) {
    withStyle(
        style = SpanStyle(fontWeight = FontWeight.Bold)
    ) {
        append(text = text)
    }
}
