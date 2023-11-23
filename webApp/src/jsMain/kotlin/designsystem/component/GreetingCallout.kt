package designsystem.component

import designsystem.icon.RaisedHand
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import designsystem.theme.PortfolioTheme

@Composable
fun GreetingCallout(
    modifier: Modifier = Modifier,
    text: AnnotatedString,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(
                color = PortfolioTheme.color.blockGray,
                shape = RoundedCornerShape(3.dp)
            )
            .padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(
            imageVector = RaisedHand,
            contentDescription = null
        )
        Text(
            text = text,
            style = MaterialTheme.typography.body1,
        )
    }
}

