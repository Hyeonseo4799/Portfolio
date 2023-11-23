package designsystem.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

var Pretendard: FontFamily? = null

val Typography by lazy {
    Typography(
        h1 = TextStyle(
            fontFamily = Pretendard,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
        ),
        h2 = TextStyle(
            fontFamily = Pretendard,
            fontSize = 24.sp,
            fontWeight = FontWeight.SemiBold,
        ),
        h3 = TextStyle(
            fontFamily = Pretendard,
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold,
        ),
        body1 = TextStyle(
            fontFamily = Pretendard,
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            lineHeight = 24.sp
        )
    )
}
