package view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import designsystem.icon.Developer

@Composable
fun PortfolioHeader() {
    Column {
        Image(
            modifier = Modifier.size(48.dp),
            imageVector = Developer,
            contentDescription = null,
        )
        Text(
            modifier = Modifier.padding(top = 8.dp),
            text = "조현서",
            style = MaterialTheme.typography.h1,
            fontSize = 40.sp,
        )
    }
}
