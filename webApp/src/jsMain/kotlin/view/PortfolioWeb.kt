package view

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.unit.dp
import designsystem.component.annotated.appendBold
import designsystem.component.GreetingCallout
import view.section.*

@Composable
fun PortfolioWeb() {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier.verticalScroll(scrollState),
    ) {
        PortfolioHeader(modifier = Modifier.padding(top = 32.dp))
        GreetingCallout(
            modifier = Modifier.padding(vertical = 30.dp),
            text = buildAnnotatedString {
                append(text = "안녕하세요 ")
                appendBold(text = "꾸준히 학습하며 성장")
                append(text = "해나가는 안드로이드 개발자 조현서입니다.")
            }
        )
        InformationSection()
        SkillSection(modifier = Modifier.padding(top = 54.dp))
        CertificationSection(modifier = Modifier.padding(top = 54.dp))
        ActivitySection(modifier = Modifier.padding(top = 54.dp))
        StudySection(modifier = Modifier.padding(top = 54.dp))
        ProjectSection(modifier = Modifier.padding(top = 54.dp, bottom = 32.dp))
    }
}
