import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.platform.Font
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.CanvasBasedWindow
import designsystem.theme.PortfolioTheme
import designsystem.theme.Pretendard
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.resource
import org.jetbrains.skiko.wasm.onWasmReady
import view.PortfolioWeb

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    onWasmReady {
        CanvasBasedWindow("Hyeonseo") {
            var loading by remember { mutableStateOf(true) }

            LaunchedEffect(Unit) {
                loadPretendardFont()
                loading = false
            }

            if (!loading) {
                PortfolioTheme {
                    Surface(
                        modifier = Modifier
                            .fillMaxSize()
                            .wrapContentWidth(align = Alignment.CenterHorizontally)
                            .widthIn(max = 900.dp),
                    ) {
                        PortfolioWeb()
                    }
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
