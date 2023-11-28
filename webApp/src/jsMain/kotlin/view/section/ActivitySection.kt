package view.section

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import designsystem.component.SectionTitle
import designsystem.component.annotated.appendLink
import kotlinx.browser.window

@Composable
fun ActivitySection(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        SectionTitle(text = "Activities.")
        ActivityItem(
            year = "2023",
            activities = listOf(
                Activity(
                    name = "Droid Knights 2023 참여",
                    deeplink = "https://hyeonseo4799.notion.site/Droid-Knight-2023-c1b19b3a616c4ab1bef1888c59ab5962?pvs=4"
                ),
                Activity(name = "팀 프로젝트(졸업작품) 발표 대회 - 장려상"),
            )
        )
        ActivityItem(
            year = "2022",
            activities = listOf(
                Activity(name = "STA+C (SmarTeen App Challenge) 참가"),
                Activity(name = "환경데이터 활용 아이디어 공모전 참가"),
                Activity(name = "2022 KINTEX 디지털미디어 테크쇼 방문"),
                Activity(name = "SW 마이스터고 4개교 연합 토크 콘서트"),
                Activity(name = "마이스터 AI-BC 워크숍 수료"),
                Activity(name = "여름방학 전공능력보충심화캠프 수료"),
            )
        )
        ActivityItem(
            year = "2021",
            activities = listOf(
                Activity(name = "교내 코딩 콘테스트 - 장려상"),
                Activity(name = "여름방학 전공능력보충심화캠프 수료"),
                Activity(name = "STA+C (SmarTeen App Challenge) 참가"),
                Activity(name = "ICT이노베이션스퀘어 인공지능 기본과정 수료"),
            )
        )
    }
}

@OptIn(ExperimentalTextApi::class)
@Composable
fun ActivityItem(
    year: String,
    activities: List<Activity>,
) {
    val annotatedString = buildAnnotatedString {
        activities.forEach {
            // TODO: break point & linebreak 로직 리팩토링
            val text = "\u2022 ${it.name}".addLineBreak(isLast = activities.last() == it)

            if (it.deeplink.isNotEmpty()) {
                appendLink(
                    tag = it.name,
                    text = text,
                    deeplink = it.deeplink
                )
            } else {
                append(text = text)
            }
        }
    }
    Column {
        Text(
            text = year,
            style = MaterialTheme.typography.h3
        )
        ClickableText(
            modifier = Modifier.padding(start = 10.dp),
            text = annotatedString,
            style = MaterialTheme.typography.body1.copy(lineHeight = 34.sp),
            onClick = { offset ->
                annotatedString.getUrlAnnotations(offset, offset).firstOrNull()?.let { annotation ->
                    window.location.href = annotation.item.url
                }
            }
        )
    }
}

data class Activity(
    val name: String,
    val deeplink: String = "",
)

private fun String.addLineBreak(isLast: Boolean): String {
    return if (!isLast) "$this\n" else this
}
