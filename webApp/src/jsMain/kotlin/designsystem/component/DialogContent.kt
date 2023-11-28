package designsystem.component

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import designsystem.theme.PortfolioTheme

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun DialogContent(
    project: Project,
    content: @Composable () -> Unit,
) {
    Column(
        modifier = Modifier.padding(horizontal = 125.dp)
    ) {
        Text(
            modifier = Modifier.padding(top = 80.dp),
            text = project.title,
            style = MaterialTheme.typography.h1,
        )
        Column(
            modifier = Modifier.padding(top = 11.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            InfoItem(
                title = "날짜",
                content = {
                    Text(
                        modifier = Modifier,
                        text = project.date,
                        style = MaterialTheme.typography.body1,
                        fontSize = 14.sp,
                        lineHeight = 14.sp
                    )
                }
            )
            InfoItem(
                title = "Tech Stack",
                content = {
                    FlowRow(
                        horizontalArrangement = Arrangement.spacedBy(6.dp),
                        verticalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        project.techStack.forEach {
                            TechStackItem(techStack = it, fontSize = 14.sp)
                        }
                    }
                }
            )
            InfoItem(
                title = "상태",
                content = {
                    StatusChip(status = project.status, fontSize = 14.sp)
                }
            )
            content()
        }
    }
}

@Composable
private fun InfoItem(
    title: String,
    content: @Composable () -> Unit,
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            modifier = Modifier
                .width(148.dp)
                .padding(vertical = 8.5.dp),
            text = title,
            style = MaterialTheme.typography.body1,
            fontSize = 14.sp,
            lineHeight = 14.sp,
            color = PortfolioTheme.color.darkBrown,
        )
        content()
    }
}
