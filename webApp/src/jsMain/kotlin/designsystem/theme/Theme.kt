package designsystem.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val Colors = PortfolioColor(
    red = Red,
    gray = Gray,
    blockPurple = LightPurple,
    blockBrown = LightBrown,
    blockGray = LightGray,
    subtleGray = SubtleGray,
    darkGreen = DarkGreen,
    lightGreen = LightGreen,
    darkBlue = DarkBlue,
    lightBlue = LightBlue,
    palePeach = PalePeach,
    lightWine = LightWine,
    lightOrange = LightOrange,
    terraCotta = TerraCotta,
    lightPink = LightPink,
    lightBeige = LightBeige,
    silver = Silver,
    darkBrown = DarkBrown
)

@Immutable
data class PortfolioColor(
    val red: Color,
    val gray: Color,
    val blockPurple: Color,
    val blockBrown: Color,
    val blockGray: Color,
    val subtleGray: Color,
    val darkGreen: Color,
    val lightGreen: Color,
    val darkBlue: Color,
    val lightBlue: Color,
    val palePeach: Color,
    val lightWine: Color,
    val lightOrange: Color,
    val terraCotta: Color,
    val lightPink: Color,
    val lightBeige: Color,
    val silver: Color,
    val darkBrown: Color,
)

val LocalColor = staticCompositionLocalOf { Colors }

@Composable
fun PortfolioTheme(
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        LocalColor provides Colors,
    ) {
        MaterialTheme(
            typography = Typography,
            content = content,
        )
    }
}

object PortfolioTheme {
    val color: PortfolioColor
        @Composable
        get() = LocalColor.current
}
