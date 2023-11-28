package view.section

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
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import designsystem.component.SectionTitle
import designsystem.icon.ArrowDown
import designsystem.icon.Pencil
import kotlinx.browser.window

@Composable
fun StudySection(
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier) {
        SectionTitle(text = "Study.")
        Row(
            modifier = Modifier.padding(top = 20.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                modifier = Modifier.size(24.dp),
                imageVector = ArrowDown,
                contentDescription = null
            )
            Text(
                text = "아래 링크를 통해 정리한 내용을 확인할 수 있습니다.",
                style = MaterialTheme.typography.h3
            )
        }
        Row(
            modifier = Modifier.padding(top = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            val noteUrl = "https://hyeonseo4799.notion.site/2abb6c1977e34242b315179b746e0d3f?pvs=4"

            Image(
                modifier = Modifier.size(24.dp),
                imageVector = Pencil,
                contentDescription = null
            )
            Text(
                modifier = Modifier.clickable {
                    window.location.href = noteUrl
                },
                text = "공부한거 끄적이기",
                style = MaterialTheme.typography.body1,
                textDecoration = TextDecoration.Underline
            )
        }
    }
}
