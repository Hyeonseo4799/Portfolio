package view.section

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.unit.dp
import designsystem.component.BiographyItem
import designsystem.component.ContactItem
import designsystem.component.SectionTitle
import designsystem.component.annotated.appendBold
import designsystem.component.annotated.appendPurple
import designsystem.icon.Phone
import designsystem.icon.Postbox
import designsystem.icon.School
import designsystem.icon.Seedling
import kotlinx.browser.window

@Composable
fun InformationSection() {
    Column {
        SectionTitle(text = "Infomation.")
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
            horizontalArrangement = Arrangement.spacedBy(32.dp),
        ) {
            Column(
                modifier = Modifier.weight(0.43f),
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                ContactItem(
                    imageVector = Postbox,
                    title = "Email",
                    content = "ragdoll4799@gmail.com"
                )
                ContactItem(
                    imageVector = Phone,
                    title = "Phone",
                    content = "010-5190-4799"
                )
            }
            Column(
                modifier = Modifier.weight(0.56f),
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                val githubLink = "https://github.com/Hyeonseo4799"

                ContactItem(
                    imageVector = School,
                    title = "Education",
                    content = "광주소프트웨어마이스터고등학교 졸업예정"
                )
                ContactItem(
                    imageVector = Seedling,
                    title = "Github",
                    content = githubLink,
                    clickEnabled = true,
                    onContentClick = { window.location.href = githubLink }
                )
            }
        }
        BiographyItem(
            title = buildAnnotatedString {
                append(text = "저는 ")
                appendPurple(text = "배움의 가치를 아는 개발자 ")
                append(text = "입니다.")
            },
            content = buildAnnotatedString {
                append(text = "새로운 ")
                appendBold(text = "기술 스택을 배우고 ")
                append(text = "실제 프로젝트에 적용하는 것을 즐깁니다.\n")
                append(text = "또한 새로 알게 된 내용이 있다면 정리해두고, 문서함으로써 ")
                appendBold(text = "조금씩이라도 성장")
                append("하기를 희망합니다.")
            },
        )
        BiographyItem(
            title = buildAnnotatedString {
                append(text = "저는 ")
                appendPurple(text = "열심히 소통하는 개발자 ")
                append(text = "입니다.")
            },
            content = buildAnnotatedString {
                append(text = "여러 프로젝트를 진행하고 다양한 팀원과 함께했기에 ")
                appendBold(text = "소통의 중요성")
                append(text = "을 잘 알고 있으며,\n")
                append(text = "개발 중 생긴 문제점이나 개발 일정에 대해 항상 ")
                appendBold(text = "적극적으로 커뮤니케이션 ")
                append("하고자 노력합니다.")
            },
        )
    }
}
