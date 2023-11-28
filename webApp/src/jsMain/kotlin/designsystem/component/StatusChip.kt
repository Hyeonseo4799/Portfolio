package designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import designsystem.component.Status.*
import designsystem.theme.PortfolioTheme

@Composable
fun StatusChip(
    modifier: Modifier = Modifier,
    status: Status,
    fontSize: TextUnit = 12.sp
) {
    Row(
        modifier = modifier
            .background(
                color = backgroundColor(status),
                shape = RoundedCornerShape(9.dp)
            )
            .padding(horizontal = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(5.dp)
    ) {
        Box(
            modifier = Modifier
                .size(8.dp)
                .background(
                    color = circleColor(status),
                    shape = CircleShape
                )
        )
        Text(
            modifier = Modifier.padding(vertical = 3.dp),
            color = Color.Black,
            text = status.text,
            style = MaterialTheme.typography.body1,
            fontSize = fontSize,
            lineHeight = fontSize,
        )
    }
}

@Composable
private fun backgroundColor(status: Status): Color {
    return when (status) {
        IN_PROGRESS -> PortfolioTheme.color.lightBlue
        DONE -> PortfolioTheme.color.lightGreen
    }
}

@Composable
private fun circleColor(status: Status): Color {
    return when (status) {
        IN_PROGRESS -> PortfolioTheme.color.darkBlue
        DONE -> PortfolioTheme.color.darkGreen
    }
}

enum class Status {
    IN_PROGRESS, DONE
}

val Status.text: String
    get() = when (this) {
        IN_PROGRESS -> "In progress"
        DONE -> "Done"
    }

