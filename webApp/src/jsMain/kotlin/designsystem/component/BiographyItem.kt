package designsystem.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp

@Composable
fun BiographyItem(
    title: AnnotatedString,
    content: AnnotatedString,
) {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Text(
            modifier = Modifier.padding(top = 20.dp),
            text = title,
            style = MaterialTheme.typography.h3
        )
        Text(
            text = content,
            style = MaterialTheme.typography.body1
        )
    }
}
