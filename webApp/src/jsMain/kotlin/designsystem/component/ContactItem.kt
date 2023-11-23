package designsystem.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp

@Composable
fun ContactItem(
    imageVector: ImageVector,
    title: String,
    content: String,
    contentDecoration: TextDecoration? = null,
    clickEnabled: Boolean = false,
    onContentClick: () -> Unit = {},
) {
    Column {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                modifier = Modifier.size(24.dp),
                imageVector = imageVector,
                contentDescription = null,
            )
            Text(
                text = title,
                style = MaterialTheme.typography.h3,
            )
        }
        Text(
            modifier = Modifier
                .padding(vertical = 8.dp)
                .clickable(
                    enabled = clickEnabled,
                    onClick = onContentClick
                ),
            text = content,
            style = MaterialTheme.typography.body1,
            textDecoration = contentDecoration,
        )
    }
}
