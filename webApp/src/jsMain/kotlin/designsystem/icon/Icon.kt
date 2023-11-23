package designsystem.icon

import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _raisedHand: ImageVector? = null

val RaisedHand: ImageVector
    get() {
        if (_raisedHand != null) {
            return _raisedHand!!
        }
        _raisedHand = ImageVector.Builder(
            name = "vector",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 36f,
            viewportHeight = 36f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF7DECE)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(32.375f, 16.219f)
                curveToRelative(-1.381f, -0.611f, -3.354f, 0.208f, -4.75f, 2.188f)
                curveToRelative(-0.917f, 1.3f, -1.187f, 3.151f, -2.391f, 3.344f)
                curveToRelative(-0.46f, 0.074f, -0.71f, -0.206f, -0.84f, -0.609f)
                curveToRelative(-0.137f, -0.68f, -0.107f, -1.731f, 0.147f, -3.201f)
                lineToRelative(2.74f, -12.315f)
                curveToRelative(0.218f, -0.941f, -0.293f, -1.852f, -1.523f, -2.149f)
                reflectiveCurveToRelative(-2.155f, 0.306f, -2.374f, 1.247f)
                lineTo(20.938f, 15.89f)
                curveToRelative(-0.493f, 2.466f, -1.407f, 2.018f, -1.186f, -0.775f)
                verticalLineToRelative(-0.001f)
                lineToRelative(0.701f, -13.092f)
                curveTo(20.51f, 1.01f, 19.732f, 0.183f, 18.582f, 0.139f)
                curveToRelative(-1.15f, -0.044f, -1.979f, 0.646f, -2.038f, 1.657f)
                lineToRelative(-0.668f, 13.409f)
                curveToRelative(-0.143f, 2.707f, -1.112f, 1.687f, -1.322f, -0.274f)
                lineTo(13f, 4.083f)
                curveToRelative(-0.159f, -1.023f, -1.118f, -1.73f, -2.268f, -1.546f)
                curveToRelative(-1.15f, 0.185f, -1.845f, 1.136f, -1.686f, 2.159f)
                lineToRelative(1.495f, 9.914f)
                curveToRelative(0.593f, 3.785f, -0.182f, 4.833f, -1.458f, 0.723f)
                lineTo(7.489f, 9.308f)
                curveToRelative(-0.26f, -0.967f, -1.213f, -1.567f, -2.41f, -1.231f)
                curveToRelative(-1.197f, 0.336f, -1.713f, 1.299f, -1.454f, 2.266f)
                lineToRelative(1.558f, 5.663f)
                curveToRelative(0.651f, 4.077f, 0.651f, 5.686f, 0.651f, 8.493f)
                reflectiveCurveTo(7.125f, 36f, 17f, 36f)
                reflectiveCurveToRelative(11.906f, -10.031f, 12f, -10.666f)
                curveToRelative(0f, 0f, 0.123f, -1.48f, 1.156f, -2.865f)
                curveToRelative(1.469f, -1.969f, 2.5f, -3.156f, 3.125f, -3.866f)
                curveToRelative(0.317f, -0.359f, 0.625f, -1.707f, -0.906f, -2.384f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE0AA94)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(24.911f, 21.741f)
                curveToRelative(-0.3f, -0.122f, -0.554f, -0.436f, -0.584f, -1.119f)
                curveToRelative(-1.892f, 0.259f, -4.451f, 0.789f, -6.42f, 2.715f)
                curveToRelative(-2.556f, 2.499f, -2.992f, 5.2f, -2.971f, 7.007f)
                curveToRelative(0.017f, 1.457f, 0.812f, 2.147f, 1.045f, -0.012f)
                curveToRelative(0.293f, -2.727f, 2.282f, -8.143f, 8.93f, -8.591f)
                close()
            }
        }.build()
        return _raisedHand!!
    }
