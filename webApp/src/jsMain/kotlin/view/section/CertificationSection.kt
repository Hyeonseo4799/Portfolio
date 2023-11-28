package view.section

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.unit.dp
import designsystem.component.SectionTitle
import designsystem.component.annotated.appendGray
import designsystem.theme.PortfolioTheme

@Composable
fun CertificationSection(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        SectionTitle(text = "Certifications.")
        CertificationItem(name = "SQLD", date = "2023-10-06", issuer = "한국데이터산업진흥원")
        CertificationItem(name = "정보처리산업기사", date = "2022-11-04", issuer = "한국산업인력공단")
        CertificationItem(name = "정보처리기능사", date = "2021-12-31", issuer = "한국산업인력공단")
    }
}

@Composable
fun CertificationItem(
    name: String,
    date: String,
    issuer: String,
) {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Text(
            text = buildAnnotatedString {
                append(text = name)
                append(text = " | ")
                appendGray(text = date)
            },
            style = MaterialTheme.typography.h3
        )
        Text(
            text = issuer,
            style = MaterialTheme.typography.body1,
            color = PortfolioTheme.color.gray
        )
    }
}
