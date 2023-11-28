package view.section

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import designsystem.component.Project
import designsystem.component.ProjectCard
import designsystem.component.SectionTitle
import designsystem.component.Status
import kotlinx.browser.window

@Composable
fun ProjectSection() {
    Column {
        val projects = listOf(
            Project(
                imageRes = "ic_dotori.webp",
                title = "Dotori",
                techStack = listOf("DataStore", "Glide", "Hilt", "Jetpack Compose", "OkHttp", "Pager", "Retrofit", "buildSrc"),
                date = "2023년 3월 19일",
                status = Status.IN_PROGRESS
            ),
            Project(
                imageRes = "ic_gkr.webp",
                title = "GKR",
                techStack = listOf("Coil", "DataStore", "Hilt", "Jetpack Compose", "Livedata", "OkHttp", "Retrofit", "buildSrc"),
                date = "2023년 5월 29일",
                status = Status.IN_PROGRESS
            ),
            Project(
                imageRes = "ic_solorecipe.webp",
                title = "혼시피",
                techStack = listOf("DataStore", "Glide", "Hilt", "Jetpack Compose", "OkHttp", "Paging", "Retrofit", "buildSrc"),
                date = "2023년 5월 17일 ~ 2023년 6월 14일",
                status = Status.DONE
            ),
            Project(
                imageRes = "ic_show.webp",
                title = "보여주Show",
                techStack = listOf("Glide", "Hilt", "Jetpack Compose", "Jsoup", "Retrofit"),
                date = "2023년 5월 17일 ~ 2023년 6월 14일",
                status = Status.DONE
            ),
        )

        SectionTitle(text = "Projects.")

        LazyVerticalGrid(
            modifier = Modifier
                .heightIn(max = 575.dp)
                .padding(top = 16.dp),
            columns = GridCells.Fixed(2),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            items(projects) {
                ProjectCard(
                    project = it
                ) {
                    // TODO: Dialog 방식으로 마이그레이션 하기
                    window.location.href = when (it.title) {
                        "Dotori" -> "https://hyeonseo4799.notion.site/Dotori-d2964127cd5c4c81bfe7c2ac9a1d9946?pvs=4"
                        "GKR" -> "https://hyeonseo4799.notion.site/GKR-31794af169d345c1a7ac7830264965cf?pvs=4"
                        "혼시피" -> "https://hyeonseo4799.notion.site/21c219f66e944484861285a0b9dc0bcc?pvs=4"
                        "보여주Show" -> "https://hyeonseo4799.notion.site/Show-6982885be8164905b379a17cb721d583?pvs=4"
                        else -> ""
                    }
                }
            }
        }
    }
}
