import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import designsystem.Typography

@Composable
fun PortfolioTheme(
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        typography = Typography,
        content = content,
    )
}
