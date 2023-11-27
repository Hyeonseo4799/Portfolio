package designsystem.component.annotated

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.*
import androidx.compose.ui.text.style.TextDecoration

@OptIn(ExperimentalTextApi::class)
@Composable
fun AnnotatedString.Builder.appendLink(
    tag: String,
    text: String,
    deeplink: String,
) {
    val startIndex = text.indexOf(tag)
    val endIndex = startIndex + tag.length

    append(text)
    addStyle(
        style = SpanStyle(textDecoration = TextDecoration.Underline),
        start = startIndex,
        end = endIndex
    )
    addUrlAnnotation(
        urlAnnotation = UrlAnnotation(deeplink),
        start = startIndex,
        end = endIndex
    )
}
