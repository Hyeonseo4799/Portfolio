package view.section

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import designsystem.component.CodeBlockText
import designsystem.component.SectionTitle

@Composable
fun SkillSection(
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier) {
        SectionTitle(text = "Skills.")
        Row(
            modifier = Modifier.padding(top = 20.dp),
            horizontalArrangement = Arrangement.spacedBy(32.dp)
        ) {
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                SkillItem(
                    title = "Coroutine",
                    content = "안드로이드의 비동기 처리에 대해 이해하고 있으며 `Coroutine`과 `Flow`를 통한 비동기 처리를 할 수 있습니다.",
                )
                SkillItem(
                    title = "Dagger Hilt",
                    content = "DI를 구현했을 때 얻을 수 있는 이점에 대해 알고 있으며, `Dagger Hilt` 로 구현할 수 있습니다.",
                )
                SkillItem(
                    title = "MVVM & MVI",
                    content = "`MVVM 패턴`에 대해 이해도가 있으며, 프로젝트에서 적용해 본 경험이 있습니다. 최근에는 `MVI 패턴`을 공부하고 있습니다.",
                )
                SkillItem(
                    title = "AAC & Jetpack",
                    content = "`AAC`를 포함한 `Jetpack Library` 들을 여러 프로젝트에서 사용해 본 경험이 있습니다.",
                )
            }
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                SkillItem(
                    title = "Retrofit & OkHttp",
                    content = "`Retrofit`과 `OkHttp`를 사용하여 REST API 통신을 구현할 수 있으며 여러 프로젝트에서 사용해 본 경험이 있습니다.",
                )
                SkillItem(
                    title = "Clean Architecture, Multi Module",
                    content = "유지보수성이 높고 테스트가 용이한 `아키텍처` 에 대해 이해하고 있습니다.",
                )
                SkillItem(
                    title = "Jetpack Compose & XML",
                    content = "`Jetpack Compose` 와 `XML`을 사용하여 UI를 구성할 수 있습니다. 최근에는 `Jetpack Compose` 를 주로 사용하고 있습니다.",
                )
                SkillItem(
                    title = "Room & Datastore",
                    content = "`Room` 과 `Datastore`를 활용하여 로컬에 데이터를 저장하고 관리할 수 있습니다.",
                )
            }
        }
    }
}

@Composable
fun SkillItem(
    title: String,
    content: String,
    useBoldCodeBlock: Boolean = true,
) {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Text(
            text = title,
            style = MaterialTheme.typography.h3
        )
        CodeBlockText(
            text = content,
            useBoldCodeBlock = useBoldCodeBlock
        )
    }
}
