package designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import designsystem.theme.PortfolioTheme

@Composable
fun TechStackItem(
    techStack: String,
    fontSize: TextUnit = 12.sp,
) {
    Text(
        modifier = Modifier
            .background(
                color = techStackColor(techStack = techStack),
                shape = RoundedCornerShape(3.dp)
            )
            .padding(horizontal = 6.dp, vertical = 3.dp),
        text = techStack,
        style = MaterialTheme.typography.body1,
        fontSize = fontSize,
        lineHeight = fontSize
    )
}

@Composable
fun techStackColor(techStack: String): Color {
    return when (techStack) {
        "buildSrc" -> PortfolioTheme.color.lightOrange
        "Retrofit", "OkHttp" -> PortfolioTheme.color.lightBlue
        "Paging" -> PortfolioTheme.color.lightBeige
        "DataStore", "Jetpack Compose" -> PortfolioTheme.color.terraCotta
        "Hilt", "Coil" -> PortfolioTheme.color.palePeach
        "Glide" -> PortfolioTheme.color.lightGreen
        "Pager" -> PortfolioTheme.color.lightWine
        "Livedata" -> PortfolioTheme.color.lightPink
        else -> PortfolioTheme.color.silver
    }
}
