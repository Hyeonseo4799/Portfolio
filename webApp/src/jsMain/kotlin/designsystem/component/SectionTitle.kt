package designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import designsystem.theme.PortfolioTheme

@Composable
fun SectionTitle(text: String) {
    Text(
        modifier = Modifier
            .background(PortfolioTheme.color.blockPurple)
            .fillMaxWidth(),
        text = text,
        style = MaterialTheme.typography.h1,
    )
}
