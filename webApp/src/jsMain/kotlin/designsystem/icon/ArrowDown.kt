package designsystem.icon

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _arrowDown: ImageVector? = null

val ArrowDown: ImageVector
    get() {
        if (_arrowDown != null) {
            return _arrowDown!!
        }
        _arrowDown = ImageVector.Builder(
            name = "vector",
            defaultWidth = 18.dp,
            defaultHeight = 18.dp,
            viewportWidth = 18f,
            viewportHeight = 18f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF427687)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(15.4993f, 1.5f)
                horizontalLineTo(2.49995f)
                curveTo(1.95f, 1.5f, 1.5f, 1.95f, 1.5f, 2.5f)
                verticalLineTo(15.4993f)
                curveTo(1.5f, 16.0492f, 1.95f, 16.4992f, 2.5f, 16.4992f)
                horizontalLineTo(15.4993f)
                curveTo(16.0492f, 16.4992f, 16.4992f, 16.0492f, 16.4992f, 15.4993f)
                verticalLineTo(2.49995f)
                curveTo(16.4992f, 1.95f, 16.0492f, 1.5f, 15.4993f, 1.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF8CAFBF)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(14.7118f, 1.5f)
                horizontalLineTo(2.43745f)
                curveTo(1.925f, 1.5f, 1.5f, 1.925f, 1.5f, 2.4375f)
                verticalLineTo(14.6743f)
                curveTo(1.5f, 15.1993f, 1.925f, 15.6118f, 2.4375f, 15.6118f)
                horizontalLineTo(14.6993f)
                curveTo(15.2243f, 15.6118f, 15.6368f, 15.1868f, 15.6368f, 14.6743f)
                verticalLineTo(2.43745f)
                curveTo(15.6618f, 1.925f, 15.2243f, 1.5f, 14.7118f, 1.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFAFAFA)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(12.3743f, 11.0744f)
                lineTo(9.37446f, 14.0742f)
                curveTo(9.1745f, 14.2992f, 8.8245f, 14.2992f, 8.6245f, 14.0742f)
                lineTo(5.62466f, 11.0744f)
                curveTo(5.3372f, 10.7494f, 5.5747f, 10.2494f, 5.9996f, 10.2494f)
                horizontalLineTo(7.74954f)
                curveTo(7.887f, 10.2494f, 7.9995f, 10.1369f, 7.9995f, 9.9994f)
                verticalLineTo(4.24973f)
                curveTo(7.9995f, 3.9747f, 8.2245f, 3.7498f, 8.4995f, 3.7498f)
                horizontalLineTo(9.49945f)
                curveTo(9.7744f, 3.7498f, 9.9994f, 3.9747f, 9.9994f, 4.2497f)
                verticalLineTo(9.99943f)
                curveTo(9.9994f, 10.1369f, 10.1119f, 10.2494f, 10.2494f, 10.2494f)
                horizontalLineTo(11.9993f)
                curveTo(12.4243f, 10.2494f, 12.6618f, 10.7619f, 12.3743f, 11.0744f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB4E1ED)),
                fillAlpha = 0.5f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(5.96203f, 2.61228f)
                curveTo(5.962f, 2.3248f, 5.762f, 2.2373f, 4.6121f, 2.2748f)
                curveTo(3.6496f, 2.3123f, 3.1747f, 2.4248f, 2.8872f, 2.7748f)
                curveTo(2.5997f, 3.1248f, 2.5247f, 3.8372f, 2.5122f, 4.6872f)
                curveTo(2.5122f, 5.2871f, 2.5122f, 5.8496f, 2.8247f, 5.8496f)
                curveTo(3.2497f, 5.8496f, 3.2497f, 4.8622f, 3.5997f, 4.3122f)
                curveTo(4.2746f, 3.2247f, 5.962f, 2.9873f, 5.962f, 2.6123f)
                close()
            }
        }.build()
        return _arrowDown!!
    }
