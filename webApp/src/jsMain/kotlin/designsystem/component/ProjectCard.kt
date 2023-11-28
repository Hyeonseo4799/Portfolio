package designsystem.component

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import designsystem.theme.PortfolioTheme
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun ProjectCard(
    project: Project,
    onClick: () -> Unit,
) {
    Card(
        modifier = Modifier
            .height(270.dp)
            .clickable(onClick = onClick),
        border = BorderStroke(
            width = 1.dp,
            color = PortfolioTheme.color.subtleGray
        ),
        elevation = 0.dp,
        shape = RoundedCornerShape(3.dp)
    ) {
        Box {
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = painterResource(res = project.imageRes),
                contentDescription = null,
                contentScale = ContentScale.Crop,
            )

            val subtleGray = PortfolioTheme.color.subtleGray

            Column(
                modifier = Modifier
                    .background(Color.White)
                    .drawBehind {
                        val strokeWidth = 1.dp.toPx()

                        drawLine(
                            color = subtleGray,
                            start = Offset(0f, 0f),
                            end = Offset(size.width, 0f),
                            strokeWidth = strokeWidth
                        )
                    }
                    .padding(horizontal = 10.dp)
                    .align(Alignment.BottomCenter)
            ) {
                Text(
                    modifier = Modifier.padding(top = 8.dp),
                    text = project.title,
                    style = MaterialTheme.typography.body1
                )
                Text(
                    modifier = Modifier.padding(top = 6.dp),
                    text = project.date,
                    style = MaterialTheme.typography.body1,
                    fontSize = 12.sp,
                    lineHeight = 12.sp
                )
                StatusChip(
                    modifier = Modifier.padding(top = 6.dp),
                    status = project.status
                )
                LazyRow(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 6.dp, bottom = 10.dp),
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    items(project.techStack) {
                        TechStackItem(techStack = it)
                    }
                }
            }
        }
    }
}

data class Project(
    val imageRes: String,
    val title: String,
    val date: String,
    val status: Status,
    val techStack: List<String>,
)
