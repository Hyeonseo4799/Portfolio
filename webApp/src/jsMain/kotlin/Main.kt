import androidx.compose.runtime.*
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.platform.Font
import androidx.compose.ui.window.CanvasBasedWindow
import designsystem.theme.PortfolioTheme
import designsystem.theme.Pretendard
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.resource
import org.jetbrains.skiko.wasm.onWasmReady

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    onWasmReady {
        CanvasBasedWindow("Portfolio") {
            var loading by remember { mutableStateOf(true) }

            LaunchedEffect(Unit) {
                loadPretendardFont()
                loading = false
            }

            if (!loading) {
                PortfolioTheme {

                }
            }
        }
    }
}

private suspend fun loadPretendardFont() {
    val bold = loadResource("font/pretendard_bold.otf")
    val semiBold = loadResource("font/pretendard_semibold.otf")
    val regular = loadResource("font/pretendard_regular.otf")

    Pretendard = FontFamily(
        Font(identity = "PretendardBold", data = bold, weight = FontWeight.Bold),
        Font(identity = "PretendardSemiBold", data = semiBold, weight = FontWeight.SemiBold),
        Font(identity = "PretendardRegular", data = regular, weight = FontWeight.Normal),
    )
}

@OptIn(ExperimentalResourceApi::class)
internal suspend fun loadResource(resourcePath: String): ByteArray {
    return resource(resourcePath).readBytes()
}
