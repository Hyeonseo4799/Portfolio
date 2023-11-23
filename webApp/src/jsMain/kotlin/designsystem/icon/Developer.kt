package designsystem.icon

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Brush.Companion.radialGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _developer: ImageVector? = null

val Developer: ImageVector
    get() {
        if (_developer != null) {
            return _developer!!
        }
        _developer = Builder(
            name = "IcDeveloper",
            defaultWidth = 18.dp,
            defaultHeight = 18.dp,
            viewportWidth = 18f,
            viewportHeight = 18f
        ).apply {
            path(
                fill = linearGradient(
                    0.0032f to Color(0xFF424242),
                    0.2705f to Color(0xFF353535),
                    0.7639f to Color(0xFF131313),
                    1.0f to Color(0xFF000000),
                    start = Offset(8.99957f, 2.06176f),
                    end = Offset(8.99957f, 12.0066f)
                ),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.9992f, 11.9975f)
                horizontalLineTo(1.9999f)
                curveTo(1.7237f, 11.9975f, 1.5f, 11.7738f, 1.5f, 11.4975f)
                verticalLineTo(2.498f)
                curveTo(1.5f, 2.2218f, 1.7237f, 1.998f, 1.9999f, 1.998f)
                horizontalLineTo(15.9992f)
                curveTo(16.2754f, 1.998f, 16.4992f, 2.2218f, 16.4992f, 2.498f)
                verticalLineTo(11.4975f)
                curveTo(16.4992f, 11.7738f, 16.2754f, 11.9975f, 15.9992f, 11.9975f)
                close()
            }
            path(
                fill = linearGradient(
                    0.0012f to Color(0xFFBFBEBE),
                    0.15f to Color(0x00212121),
                    0.7759f to Color(0x00212121),
                    1.0f to Color(0xFFBFBEBE),
                    start = Offset(8.99942f, 2.06371f),
                    end = Offset(8.99942f, 12.0086f)
                ),
                stroke = null,
                fillAlpha = 0.3f,
                strokeAlpha = 0.3f,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.9991f, 11.9995f)
                horizontalLineTo(1.9998f)
                curveTo(1.7236f, 11.9995f, 1.4998f, 11.7757f, 1.4998f, 11.4995f)
                verticalLineTo(2.5f)
                curveTo(1.4998f, 2.2237f, 1.7236f, 2.0f, 1.9998f, 2.0f)
                horizontalLineTo(15.9991f)
                curveTo(16.2753f, 2.0f, 16.499f, 2.2237f, 16.499f, 2.5f)
                verticalLineTo(11.4995f)
                curveTo(16.499f, 11.7757f, 16.2753f, 11.9995f, 15.9991f, 11.9995f)
                close()
            }
            path(
                fill = linearGradient(
                    0.0012f to Color(0xFFBFBEBE),
                    0.1f to Color(0x00212121),
                    0.9f to Color(0x00212121),
                    1.0f to Color(0xFFBFBEBE),
                    start = Offset(1.5738f, 6.99973f),
                    end = Offset(16.4911f, 6.99973f)
                ),
                stroke = null,
                fillAlpha = 0.3f,
                strokeAlpha = 0.3f,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.9778f, 11.9995f)
                horizontalLineTo(1.9785f)
                curveTo(1.7023f, 11.9995f, 1.4785f, 11.7757f, 1.4785f, 11.4995f)
                verticalLineTo(2.5f)
                curveTo(1.4785f, 2.2237f, 1.7023f, 2.0f, 1.9785f, 2.0f)
                horizontalLineTo(15.9778f)
                curveTo(16.254f, 2.0f, 16.4778f, 2.2237f, 16.4778f, 2.5f)
                verticalLineTo(11.4995f)
                curveTo(16.4778f, 11.7757f, 16.254f, 11.9995f, 15.9778f, 11.9995f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF76FF03)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.4996f, 2.998f)
                horizontalLineTo(2.4997f)
                verticalLineTo(3.498f)
                horizontalLineTo(5.4996f)
                verticalLineTo(2.998f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF76FF03)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.7491f, 2.998f)
                horizontalLineTo(11.7492f)
                verticalLineTo(3.498f)
                horizontalLineTo(13.7491f)
                verticalLineTo(2.998f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF76FF03)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.499f, 2.998f)
                horizontalLineTo(14.4991f)
                verticalLineTo(3.498f)
                horizontalLineTo(15.499f)
                verticalLineTo(2.998f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF76FF03)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(4.4996f, 4.4981f)
                horizontalLineTo(3.4996f)
                verticalLineTo(4.998f)
                horizontalLineTo(4.4996f)
                verticalLineTo(4.4981f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF76FF03)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(4.4996f, 5.9981f)
                horizontalLineTo(2.4997f)
                verticalLineTo(6.498f)
                horizontalLineTo(4.4996f)
                verticalLineTo(5.9981f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF76FF03)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.4997f, 7.4981f)
                horizontalLineTo(2.4997f)
                verticalLineTo(7.998f)
                horizontalLineTo(3.4997f)
                verticalLineTo(7.4981f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF76FF03)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.749f, 7.4981f)
                horizontalLineTo(13.2491f)
                verticalLineTo(7.998f)
                horizontalLineTo(14.749f)
                verticalLineTo(7.4981f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF76FF03)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.4991f, 5.9981f)
                horizontalLineTo(13.9992f)
                verticalLineTo(6.498f)
                horizontalLineTo(15.4991f)
                verticalLineTo(5.9981f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF76FF03)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(4.4996f, 8.9961f)
                horizontalLineTo(2.4997f)
                verticalLineTo(9.4961f)
                horizontalLineTo(4.4996f)
                verticalLineTo(8.9961f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF76FF03)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.499f, 8.9961f)
                horizontalLineTo(12.9991f)
                verticalLineTo(9.4961f)
                horizontalLineTo(15.499f)
                verticalLineTo(8.9961f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF76FF03)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.9991f, 4.4981f)
                horizontalLineTo(13.4991f)
                verticalLineTo(4.998f)
                horizontalLineTo(14.9991f)
                verticalLineTo(4.4981f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF312D2D)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.3618f, 10.9687f)
                curveTo(13.2056f, 10.685f, 13.4043f, 10.3963f, 13.7443f, 10.0388f)
                curveTo(14.283f, 9.4713f, 14.8693f, 8.1552f, 14.3243f, 6.819f)
                curveTo(14.328f, 6.8115f, 14.2168f, 6.5865f, 14.2206f, 6.579f)
                lineTo(13.9968f, 6.5677f)
                curveTo(13.9256f, 6.5577f, 11.4644f, 6.5527f, 9.0008f, 6.5527f)
                curveTo(6.5372f, 6.5527f, 4.0761f, 6.5577f, 4.0048f, 6.5677f)
                curveTo(4.0048f, 6.5677f, 3.6736f, 6.8115f, 3.6761f, 6.819f)
                curveTo(3.1324f, 8.1552f, 3.7174f, 9.4713f, 4.2561f, 10.0388f)
                curveTo(4.5948f, 10.3963f, 4.7936f, 10.685f, 4.6386f, 10.9687f)
                curveTo(4.4873f, 11.245f, 4.0373f, 11.285f, 4.0373f, 11.285f)
                curveTo(4.0373f, 11.285f, 4.1411f, 11.5675f, 4.3911f, 11.72f)
                curveTo(4.6223f, 11.8612f, 4.9073f, 11.8937f, 5.1035f, 11.8987f)
                curveTo(5.1035f, 11.8987f, 5.8722f, 12.9624f, 7.8821f, 12.9624f)
                horizontalLineTo(9.0008f)
                horizontalLineTo(10.1195f)
                curveTo(12.1294f, 12.9624f, 12.8981f, 11.8987f, 12.8981f, 11.8987f)
                curveTo(13.0944f, 11.8937f, 13.3793f, 11.8612f, 13.6106f, 11.72f)
                curveTo(13.8606f, 11.5675f, 13.9643f, 11.285f, 13.9643f, 11.285f)
                curveTo(13.9643f, 11.285f, 13.5131f, 11.2437f, 13.3618f, 10.9687f)
                close()
            }
            path(
                fill = radialGradient(
                    0.7275f to Color(0x00454140),
                    1.0f to Color(0xFF454140),
                    center = Offset(10.8225f, 11.2534f),
                    radius = 2.92722f
                ),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.9984f, 12.9585f)
                verticalLineTo(11.7786f)
                lineTo(12.5695f, 11.4961f)
                lineTo(12.8945f, 11.8961f)
                curveTo(12.8945f, 11.8961f, 12.1258f, 12.9598f, 10.1159f, 12.9598f)
                lineTo(8.9984f, 12.9585f)
                close()
            }
            path(
                fill = radialGradient(
                    0.6628f to Color(0xFF454140),
                    1.0f to Color(0x00454140),
                    center = Offset(13.7059f, 10.8179f),
                    radius = 0.865023f
                ),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.8871f, 11.3799f)
                curveTo(12.3521f, 10.5674f, 13.5383f, 10.2637f, 13.5383f, 10.2637f)
                lineTo(13.5395f, 10.2649f)
                curveTo(13.3333f, 10.5212f, 13.2395f, 10.7449f, 13.3608f, 10.9661f)
                curveTo(13.512f, 11.2424f, 13.962f, 11.2824f, 13.962f, 11.2824f)
                curveTo(13.962f, 11.2824f, 13.3483f, 11.8273f, 12.8871f, 11.3799f)
                close()
            }
            path(
                fill = radialGradient(
                    0.7247f to Color(0x00454140),
                    1.0f to Color(0xFF454140),
                    center = Offset(11.4639f, 8.3714f),
                    radius = 3.79965f
                ),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.3269f, 6.8165f)
                curveTo(14.8581f, 8.1102f, 14.2994f, 9.4426f, 13.7757f, 10.0051f)
                curveTo(13.7044f, 10.0826f, 13.3995f, 10.3813f, 13.3295f, 10.62f)
                curveTo(13.3295f, 10.62f, 12.137f, 8.9564f, 11.7808f, 7.9789f)
                curveTo(11.7096f, 7.7814f, 11.6433f, 7.5789f, 11.6346f, 7.3689f)
                curveTo(11.6283f, 7.2115f, 11.6521f, 7.024f, 11.7433f, 6.8902f)
                curveTo(11.8545f, 6.7265f, 14.2632f, 6.6777f, 14.2632f, 6.6777f)
                curveTo(14.2632f, 6.679f, 14.3269f, 6.8165f, 14.3269f, 6.8165f)
                close()
            }
            path(
                fill = radialGradient(
                    0.7247f to Color(0x00454140),
                    1.0f to Color(0xFF454140),
                    center = Offset(6.53836f, 8.37132f),
                    radius = 3.79965f
                ),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.675f, 6.8165f)
                curveTo(3.1437f, 8.1102f, 3.7025f, 9.4426f, 4.2262f, 10.0051f)
                curveTo(4.2987f, 10.0826f, 4.6024f, 10.3813f, 4.6724f, 10.62f)
                curveTo(4.6724f, 10.62f, 5.8649f, 8.9564f, 6.2211f, 7.9789f)
                curveTo(6.2936f, 7.7814f, 6.3586f, 7.5789f, 6.3673f, 7.3689f)
                curveTo(6.3736f, 7.2115f, 6.3498f, 7.024f, 6.2586f, 6.8902f)
                curveTo(6.1473f, 6.7265f, 6.0174f, 6.7702f, 5.8286f, 6.7702f)
                curveTo(5.4686f, 6.7702f, 3.8925f, 6.6777f, 3.77f, 6.6777f)
                curveTo(3.7712f, 6.679f, 3.675f, 6.8165f, 3.675f, 6.8165f)
                close()
            }
            path(
                fill = radialGradient(
                    0.7275f to Color(0x00454140),
                    1.0f to Color(0xFF454140),
                    center = Offset(7.17968f, 11.2534f),
                    radius = 2.92722f
                ),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.0034f, 12.9585f)
                verticalLineTo(11.7786f)
                lineTo(5.4324f, 11.4961f)
                lineTo(5.1074f, 11.8961f)
                curveTo(5.1074f, 11.8961f, 5.8761f, 12.9598f, 7.886f, 12.9598f)
                lineTo(9.0034f, 12.9585f)
                close()
            }
            path(
                fill = radialGradient(
                    0.6628f to Color(0xFF454140),
                    1.0f to Color(0x00454140),
                    center = Offset(4.29653f, 10.818f),
                    radius = 0.865023f
                ),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.1148f, 11.3799f)
                curveTo(5.6498f, 10.5674f, 4.4636f, 10.2637f, 4.4636f, 10.2637f)
                lineTo(4.4624f, 10.2649f)
                curveTo(4.6686f, 10.5212f, 4.7624f, 10.7449f, 4.6411f, 10.9661f)
                curveTo(4.4899f, 11.2424f, 4.0399f, 11.2824f, 4.0399f, 11.2824f)
                curveTo(4.0399f, 11.2824f, 4.6536f, 11.8273f, 5.1148f, 11.3799f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFEDC391)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.4157f, 7.2891f)
                horizontalLineTo(5.5835f)
                curveTo(4.8473f, 7.2891f, 4.2448f, 7.9303f, 4.2448f, 8.7152f)
                curveTo(4.2448f, 9.5002f, 4.8473f, 10.1414f, 5.5835f, 10.1414f)
                horizontalLineTo(12.4144f)
                curveTo(13.1506f, 10.1414f, 13.7531f, 9.4989f, 13.7531f, 8.7152f)
                curveTo(13.7543f, 7.9315f, 13.1519f, 7.2891f, 12.4157f, 7.2891f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF9DDBD)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.9997f, 2.3711f)
                curveTo(6.8248f, 2.3711f, 4.8099f, 4.6972f, 4.8099f, 8.0458f)
                curveTo(4.8099f, 11.3756f, 6.8861f, 13.0218f, 8.9997f, 13.0218f)
                curveTo(11.1133f, 13.0218f, 13.1895f, 11.3756f, 13.1895f, 8.0458f)
                curveTo(13.1895f, 4.6972f, 11.1746f, 2.3711f, 8.9997f, 2.3711f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF454140)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.8495f, 7.2122f)
                curveTo(7.7332f, 7.0584f, 7.4658f, 6.8359f, 6.9458f, 6.8359f)
                curveTo(6.4258f, 6.8359f, 6.1571f, 7.0597f, 6.0421f, 7.2122f)
                curveTo(5.9908f, 7.2797f, 6.0033f, 7.3584f, 6.0396f, 7.4059f)
                curveTo(6.0721f, 7.4496f, 6.1696f, 7.4909f, 6.2771f, 7.4546f)
                curveTo(6.3846f, 7.4184f, 6.5946f, 7.3097f, 6.9458f, 7.3072f)
                curveTo(7.297f, 7.3097f, 7.507f, 7.4184f, 7.6145f, 7.4546f)
                curveTo(7.722f, 7.4909f, 7.8195f, 7.4509f, 7.852f, 7.4059f)
                curveTo(7.887f, 7.3597f, 7.9007f, 7.2809f, 7.8495f, 7.2122f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF454140)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.9581f, 7.2122f)
                curveTo(11.8418f, 7.0584f, 11.5743f, 6.8359f, 11.0544f, 6.8359f)
                curveTo(10.5344f, 6.8359f, 10.2656f, 7.0597f, 10.1507f, 7.2122f)
                curveTo(10.0994f, 7.2797f, 10.1119f, 7.3584f, 10.1482f, 7.4059f)
                curveTo(10.1807f, 7.4496f, 10.2781f, 7.4909f, 10.3856f, 7.4546f)
                curveTo(10.4931f, 7.4184f, 10.7031f, 7.3097f, 11.0544f, 7.3072f)
                curveTo(11.4056f, 7.3097f, 11.6156f, 7.4184f, 11.7231f, 7.4546f)
                curveTo(11.8306f, 7.4909f, 11.9281f, 7.4509f, 11.9606f, 7.4059f)
                curveTo(11.9956f, 7.3597f, 12.0093f, 7.2809f, 11.9581f, 7.2122f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF312D2D)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.9446f, 8.9761f)
                curveTo(7.2849f, 8.9761f, 7.5608f, 8.6907f, 7.5608f, 8.3386f)
                curveTo(7.5608f, 7.9866f, 7.2849f, 7.7012f, 6.9446f, 7.7012f)
                curveTo(6.6043f, 7.7012f, 6.3284f, 7.9866f, 6.3284f, 8.3386f)
                curveTo(6.3284f, 8.6907f, 6.6043f, 8.9761f, 6.9446f, 8.9761f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF312D2D)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.0545f, 8.9761f)
                curveTo(11.3948f, 8.9761f, 11.6707f, 8.6907f, 11.6707f, 8.3386f)
                curveTo(11.6707f, 7.9866f, 11.3948f, 7.7012f, 11.0545f, 7.7012f)
                curveTo(10.7142f, 7.7012f, 10.4383f, 7.9866f, 10.4383f, 8.3386f)
                curveTo(10.4383f, 8.6907f, 10.7142f, 8.9761f, 11.0545f, 8.9761f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF444444)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.052f, 10.5045f)
                curveTo(9.6545f, 10.7407f, 8.3484f, 10.7407f, 7.9509f, 10.5045f)
                curveTo(7.7221f, 10.3682f, 7.4884f, 10.577f, 7.5834f, 10.7844f)
                curveTo(7.6771f, 10.9882f, 8.3884f, 11.4619f, 9.0046f, 11.4619f)
                curveTo(9.6208f, 11.4619f, 10.3233f, 10.9882f, 10.417f, 10.7844f)
                curveTo(10.5107f, 10.577f, 10.2808f, 10.3682f, 10.052f, 10.5045f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFDBA689)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.482f, 9.4924f)
                curveTo(9.4683f, 9.4874f, 9.4558f, 9.4837f, 9.442f, 9.4824f)
                horizontalLineTo(8.5571f)
                curveTo(8.5433f, 9.4837f, 8.5296f, 9.4874f, 8.5171f, 9.4924f)
                curveTo(8.4371f, 9.5249f, 8.3933f, 9.6074f, 8.4308f, 9.6962f)
                curveTo(8.4683f, 9.7849f, 8.6446f, 10.0324f, 8.9995f, 10.0324f)
                curveTo(9.3545f, 10.0324f, 9.5308f, 9.7837f, 9.5683f, 9.6962f)
                curveTo(9.6058f, 9.6087f, 9.562f, 9.5249f, 9.482f, 9.4924f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF312D2D)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.0081f, 4.1256f)
                curveTo(13.7031f, 3.6644f, 13.0194f, 3.0457f, 12.4056f, 3.0045f)
                curveTo(12.3069f, 2.4145f, 11.6757f, 1.9145f, 11.0645f, 1.7208f)
                curveTo(9.4108f, 1.197f, 8.3346f, 1.7845f, 7.7571f, 2.0995f)
                curveTo(7.6371f, 2.1645f, 6.8609f, 2.5957f, 6.3185f, 2.287f)
                curveTo(5.9785f, 2.0933f, 5.9847f, 1.5695f, 5.9847f, 1.5695f)
                curveTo(5.9847f, 1.5695f, 4.9198f, 1.9758f, 5.2835f, 3.107f)
                curveTo(4.9173f, 3.1219f, 4.4373f, 3.2769f, 4.1836f, 3.7907f)
                curveTo(3.8811f, 4.4031f, 3.9886f, 4.9144f, 4.0761f, 5.1593f)
                curveTo(3.7611f, 5.4268f, 3.3649f, 5.9955f, 3.6361f, 6.7343f)
                curveTo(3.8411f, 7.2905f, 4.6573f, 7.5467f, 4.6573f, 7.5467f)
                curveTo(4.5798f, 8.8891f, 4.9423f, 9.5403f, 4.9423f, 9.5403f)
                curveTo(4.9423f, 9.5403f, 5.5285f, 7.2342f, 5.4798f, 6.8817f)
                curveTo(5.4798f, 6.8817f, 6.4497f, 6.6892f, 7.5509f, 6.0593f)
                curveTo(8.2946f, 5.6331f, 8.8033f, 5.1343f, 9.6395f, 4.9456f)
                curveTo(10.912f, 4.6594f, 11.1957f, 5.5806f, 11.1957f, 5.5806f)
                curveTo(11.1957f, 5.5806f, 12.3732f, 5.3543f, 12.7281f, 6.9892f)
                curveTo(12.8744f, 7.6617f, 12.9694f, 8.7766f, 13.0494f, 9.4604f)
                curveTo(13.0419f, 9.4004f, 13.4543f, 8.6692f, 13.5318f, 7.9192f)
                curveTo(13.5518f, 7.7255f, 14.0743f, 7.4692f, 14.2993f, 6.6368f)
                curveTo(14.598f, 5.5268f, 14.2293f, 4.4594f, 14.0081f, 4.1256f)
                close()
            }
            path(
                fill = radialGradient(
                    0.6985f to Color(0x00454140),
                    1.0f to Color(0xFF454140),
                    center = Offset(11.2518f, 6.36644f),
                    radius = 4.4538f
                ),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.527f, 7.9226f)
                curveTo(13.547f, 7.7288f, 14.0695f, 7.4726f, 14.2944f, 6.6401f)
                curveTo(14.3182f, 6.5514f, 14.3382f, 6.4614f, 14.3569f, 6.3714f)
                curveTo(14.5394f, 5.3602f, 14.212f, 4.4315f, 14.0082f, 4.124f)
                curveTo(13.7257f, 3.6978f, 13.1208f, 3.1378f, 12.547f, 3.0228f)
                curveTo(12.497f, 3.0166f, 12.4483f, 3.0103f, 12.402f, 3.0078f)
                curveTo(12.402f, 3.0078f, 12.4433f, 3.2766f, 12.3346f, 3.4903f)
                curveTo(12.1946f, 3.7678f, 11.9083f, 3.834f, 11.9083f, 3.834f)
                curveTo(13.4045f, 5.3302f, 13.2983f, 6.5839f, 13.527f, 7.9226f)
                close()
            }
            path(
                fill = radialGradient(
                    0.58f to Color(0xFF454140),
                    1.0f to Color(0x00454140),
                    center = Offset(6.90984f, 1.50842f),
                    radius = 1.16779f
                ),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.1184f, 1.9071f)
                curveTo(7.9809f, 1.9733f, 7.8609f, 2.0396f, 7.756f, 2.0958f)
                curveTo(7.636f, 2.1608f, 6.8597f, 2.5921f, 6.3173f, 2.2833f)
                curveTo(5.9836f, 2.0933f, 5.9836f, 1.5859f, 5.9836f, 1.5684f)
                curveTo(5.8298f, 1.7646f, 5.3648f, 3.1658f, 6.7248f, 3.2595f)
                curveTo(7.311f, 3.2995f, 7.6722f, 2.7883f, 7.8872f, 2.3558f)
                curveTo(7.9647f, 2.1971f, 8.0859f, 1.9683f, 8.1184f, 1.9071f)
                close()
            }
            path(
                fill = radialGradient(
                    0.6985f to Color(0x00454140),
                    1.0f to Color(0xFF454140),
                    center = Offset(9.5181f, 3.63039f),
                    radius = 3.64911f
                ),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.8945f, 1.6687f)
                curveTo(11.8095f, 1.9162f, 12.2982f, 2.4024f, 12.4044f, 3.0036f)
                curveTo(12.4369f, 3.1886f, 12.5007f, 4.8885f, 9.2509f, 2.9536f)
                curveTo(8.0422f, 2.2337f, 8.3722f, 1.7837f, 8.5134f, 1.7325f)
                curveTo(9.0659f, 1.5325f, 9.8696f, 1.3912f, 10.8945f, 1.6687f)
                close()
            }
            path(
                fill = radialGradient(
                    0.7016f to Color(0x00454140),
                    1.0f to Color(0xFF454140),
                    center = Offset(6.44093f, 2.57497f),
                    radius = 1.07188f
                ),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.9798f, 1.5696f)
                curveTo(5.9786f, 1.5709f, 5.9761f, 1.5709f, 5.9724f, 1.5734f)
                curveTo(5.9724f, 1.5734f, 5.9724f, 1.5734f, 5.9711f, 1.5734f)
                curveTo(5.8549f, 1.6221f, 4.9412f, 2.0458f, 5.2824f, 3.1058f)
                lineTo(6.2548f, 3.262f)
                curveTo(5.3936f, 2.3896f, 5.9836f, 1.5684f, 5.9836f, 1.5684f)
                curveTo(5.9836f, 1.5684f, 5.9811f, 1.5684f, 5.9798f, 1.5696f)
                close()
            }
            path(
                fill = radialGradient(
                    0.6605f to Color(0x00454140),
                    1.0f to Color(0xFF454140),
                    center = Offset(6.29325f, 4.46603f),
                    radius = 2.01039f
                ),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.8835f, 3.1998f)
                lineTo(5.2823f, 3.1035f)
                curveTo(5.2586f, 3.1035f, 5.1785f, 3.111f, 5.1348f, 3.1173f)
                curveTo(4.7961f, 3.1648f, 4.3973f, 3.3398f, 4.1811f, 3.7872f)
                curveTo(3.9486f, 4.2697f, 3.9549f, 4.6834f, 4.0186f, 4.9597f)
                curveTo(4.0374f, 5.0522f, 4.0749f, 5.1572f, 4.0749f, 5.1572f)
                curveTo(4.0749f, 5.1572f, 4.3723f, 4.8747f, 5.0811f, 4.8559f)
                lineTo(5.8835f, 3.1998f)
                close()
            }
            path(
                fill = radialGradient(
                    0.5981f to Color(0x00454140),
                    1.0f to Color(0xFF454140),
                    center = Offset(5.81683f, 6.40849f),
                    radius = 2.11066f
                ),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(4.0462f, 5.1824f)
                curveTo(3.7499f, 5.4449f, 3.3512f, 6.0311f, 3.6449f, 6.7586f)
                curveTo(3.8662f, 7.3073f, 4.6561f, 7.5448f, 4.6561f, 7.5448f)
                curveTo(4.6561f, 7.5473f, 4.8136f, 7.5948f, 4.8949f, 7.5948f)
                lineTo(5.0799f, 4.8574f)
                curveTo(4.7011f, 4.8574f, 4.3374f, 4.9712f, 4.1024f, 5.1349f)
                curveTo(4.1062f, 5.1387f, 4.0449f, 5.1786f, 4.0462f, 5.1824f)
                close()
            }
            path(
                fill = linearGradient(
                    0.0f to Color(0xFFFB8C00),
                    0.482f to Color(0xFFF67F00),
                    1.0f to Color(0xFFEF6C00),
                    start = Offset(1.70269f, 15.7698f),
                    end = Offset(3.80783f, 15.7698f)
                ),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(1.9533f, 16.4954f)
                horizontalLineTo(3.557f)
                curveTo(3.697f, 16.4841f, 3.8082f, 16.3479f, 3.8082f, 16.1804f)
                verticalLineTo(16.0992f)
                curveTo(3.8082f, 15.6517f, 3.607f, 15.2605f, 3.3057f, 15.043f)
                curveTo(3.3057f, 15.0617f, 3.307f, 15.0805f, 3.307f, 15.0992f)
                curveTo(3.307f, 15.6117f, 3.0595f, 16.0267f, 2.7558f, 16.0267f)
                curveTo(2.452f, 16.0267f, 2.2045f, 15.6117f, 2.2045f, 15.0992f)
                curveTo(2.2045f, 15.0805f, 2.2058f, 15.0617f, 2.2058f, 15.043f)
                curveTo(1.9046f, 15.2617f, 1.7033f, 15.6517f, 1.7033f, 16.0992f)
                verticalLineTo(16.1804f)
                curveTo(1.7021f, 16.3491f, 1.8133f, 16.4841f, 1.9533f, 16.4954f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE14301)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.7558f, 16.0261f)
                curveTo(3.8807f, 16.0261f, 3.307f, 15.6111f, 3.307f, 15.0987f)
                curveTo(3.307f, 15.0799f, 3.3057f, 15.0612f, 3.3057f, 15.0424f)
                curveTo(3.1457f, 14.9262f, 2.957f, 14.8574f, 2.7558f, 14.8574f)
                curveTo(2.5545f, 14.8574f, 2.3658f, 14.9262f, 2.2058f, 15.0424f)
                curveTo(2.2045f, 15.0612f, 2.2045f, 15.0799f, 2.2045f, 15.0987f)
                curveTo(2.2033f, 15.6111f, 1.6246f, 16.0261f, 2.7558f, 16.0261f)
                close()
            }
            path(
                fill = linearGradient(
                    0.0f to Color(0xFFFFD29C),
                    0.5f to Color(0xFFF9DDBD),
                    start = Offset(3.5533f, 15.1129f),
                    end = Offset(2.34327f, 13.3909f)
                ), stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(4.4973f, 14.3483f)
                curveTo(4.4835f, 13.9934f, 4.2185f, 13.2609f, 3.8723f, 13.1996f)
                curveTo(3.8511f, 13.1959f, 3.8323f, 13.1859f, 3.8211f, 13.1684f)
                curveTo(3.7661f, 13.0846f, 3.5898f, 12.8597f, 3.2673f, 13.0372f)
                curveTo(3.1474f, 13.1034f, 3.1049f, 13.1621f, 3.1249f, 13.2471f)
                curveTo(3.1098f, 13.2646f, 3.0824f, 13.2859f, 3.0424f, 13.2696f)
                curveTo(2.9124f, 13.1246f, 2.7524f, 13.0946f, 2.5661f, 13.2396f)
                curveTo(2.3549f, 13.4046f, 2.3549f, 13.5221f, 2.3924f, 13.6384f)
                lineTo(2.3911f, 13.6396f)
                curveTo(2.3911f, 13.6396f, 2.3824f, 13.7209f, 2.3211f, 13.7146f)
                curveTo(2.2574f, 13.6596f, 2.1811f, 13.6596f, 2.0599f, 13.7471f)
                curveTo(1.7349f, 13.9821f, 1.8687f, 14.2046f, 1.9237f, 14.3358f)
                curveTo(1.9162f, 14.3483f, 1.9037f, 14.3571f, 1.8837f, 14.3558f)
                curveTo(1.8412f, 14.3333f, 1.7874f, 14.3333f, 1.7149f, 14.3746f)
                curveTo(1.5424f, 14.4733f, 1.5674f, 14.7983f, 1.6162f, 14.9046f)
                curveTo(1.6699f, 15.0208f, 1.9662f, 15.4283f, 2.0674f, 15.5433f)
                curveTo(2.0912f, 15.5695f, 2.1199f, 15.5883f, 2.1511f, 15.6008f)
                curveTo(2.1474f, 15.5995f, 2.1437f, 15.5983f, 2.1411f, 15.597f)
                curveTo(2.2299f, 15.652f, 2.3849f, 15.7183f, 2.5361f, 15.6245f)
                curveTo(2.5361f, 15.6245f, 2.6324f, 15.5545f, 2.6411f, 15.4808f)
                curveTo(2.8049f, 15.572f, 3.0311f, 15.402f, 3.0311f, 15.402f)
                curveTo(3.1374f, 15.3208f, 3.1648f, 15.2295f, 3.1611f, 15.1508f)
                curveTo(3.2148f, 15.1833f, 3.2736f, 15.1958f, 3.3298f, 15.197f)
                curveTo(3.4998f, 15.202f, 3.6561f, 15.102f, 3.6561f, 15.102f)
                curveTo(3.8998f, 14.9633f, 3.9486f, 14.8183f, 3.9473f, 14.7221f)
                curveTo(4.0736f, 14.8008f, 4.2298f, 14.7421f, 4.2298f, 14.7421f)
                curveTo(4.506f, 14.6171f, 4.4973f, 14.3483f, 4.4973f, 14.3483f)
                close()
            }
            path(
                fill = linearGradient(
                    0.0f to Color(0xFFFB8C00),
                    0.482f to Color(0xFFF67F00),
                    1.0f to Color(0xFFEF6C00),
                    start = Offset(13.3997f, 15.8556f),
                    end = Offset(16.0991f, 15.8556f)
                ),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.4942f, 16.4971f)
                horizontalLineTo(16.0992f)
                curveTo(16.0992f, 16.4971f, 16.1691f, 15.2734f, 14.2043f, 15.2147f)
                curveTo(12.2381f, 15.1572f, 14.4942f, 16.4971f, 14.4942f, 16.4971f)
                close()
            }
            path(
                fill = linearGradient(
                    0.0f to Color(0xFFFFD29C),
                    0.5f to Color(0xFFF9DDBD),
                    start = Offset(14.3762f, 15.7168f),
                    end = Offset(15.5863f, 13.9948f)
                ), stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.4317f, 14.9518f)
                curveTo(13.4454f, 14.5969f, 13.7104f, 13.8644f, 14.0566f, 13.8032f)
                curveTo(14.0779f, 13.7994f, 14.0966f, 13.7894f, 14.1079f, 13.7719f)
                curveTo(14.1629f, 13.6882f, 14.3391f, 13.4632f, 14.6616f, 13.6407f)
                curveTo(14.7816f, 13.7069f, 14.8241f, 13.7657f, 14.8041f, 13.8507f)
                curveTo(14.8191f, 13.8682f, 14.8466f, 13.8894f, 14.8866f, 13.8732f)
                curveTo(15.0166f, 13.7282f, 15.1766f, 13.6982f, 15.3628f, 13.8432f)
                curveTo(15.5741f, 14.0081f, 15.5741f, 14.1256f, 15.5366f, 14.2419f)
                lineTo(15.5378f, 14.2431f)
                curveTo(15.5378f, 14.2431f, 15.5466f, 14.3244f, 15.6078f, 14.3181f)
                curveTo(15.6716f, 14.2631f, 15.7478f, 14.2631f, 15.869f, 14.3506f)
                curveTo(16.194f, 14.5856f, 16.0603f, 14.8081f, 16.0053f, 14.9393f)
                curveTo(16.0128f, 14.9518f, 16.024f, 14.9606f, 16.0453f, 14.9593f)
                curveTo(16.0878f, 14.9368f, 16.1415f, 14.9368f, 16.214f, 14.9781f)
                curveTo(16.3865f, 15.0768f, 16.3615f, 15.4018f, 16.3128f, 15.5081f)
                curveTo(16.259f, 15.6243f, 15.964f, 16.0318f, 15.8615f, 16.1468f)
                curveTo(15.8378f, 16.173f, 15.809f, 16.1918f, 15.7778f, 16.2043f)
                curveTo(15.7815f, 16.203f, 15.7853f, 16.2018f, 15.7878f, 16.2005f)
                curveTo(15.6991f, 16.2555f, 15.5441f, 16.3218f, 15.3928f, 16.228f)
                curveTo(15.3928f, 16.228f, 15.2966f, 16.158f, 15.2878f, 16.0843f)
                curveTo(15.1241f, 16.1755f, 14.8978f, 16.0055f, 14.8978f, 16.0055f)
                curveTo(14.7916f, 15.9243f, 14.7641f, 15.833f, 14.7679f, 15.7543f)
                curveTo(14.7141f, 15.7868f, 14.6554f, 15.7993f, 14.5991f, 15.8006f)
                curveTo(14.4291f, 15.8056f, 14.2729f, 15.7056f, 14.2729f, 15.7056f)
                curveTo(14.0291f, 15.5668f, 13.9804f, 15.4218f, 13.9816f, 15.3256f)
                curveTo(13.8554f, 15.4043f, 13.6992f, 15.3456f, 13.6992f, 15.3456f)
                curveTo(13.4229f, 15.2206f, 13.4317f, 14.9518f, 13.4317f, 14.9518f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFEDBD82)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.529f, 16.1942f)
                curveTo(15.5078f, 16.1829f, 15.4878f, 16.1704f, 15.469f, 16.1542f)
                curveTo(15.4665f, 16.1517f, 15.4628f, 16.1492f, 15.4603f, 16.1454f)
                curveTo(15.4253f, 16.1067f, 15.4153f, 16.0442f, 15.5065f, 15.9192f)
                curveTo(15.7565f, 15.5879f, 15.8552f, 15.3405f, 15.8552f, 15.3405f)
                curveTo(15.924f, 15.1667f, 15.899f, 15.138f, 15.899f, 15.138f)
                curveTo(15.8752f, 15.0992f, 15.8265f, 15.2117f, 15.8265f, 15.2117f)
                curveTo(15.579f, 15.6579f, 15.409f, 15.8529f, 15.3353f, 15.9254f)
                curveTo(15.3315f, 15.9279f, 15.3278f, 15.9304f, 15.324f, 15.9317f)
                curveTo(15.3103f, 15.9404f, 15.2953f, 15.9492f, 15.279f, 15.9554f)
                curveTo(15.2728f, 15.9579f, 15.2653f, 15.9604f, 15.259f, 15.9629f)
                curveTo(15.2453f, 15.9679f, 15.2303f, 15.9704f, 15.2153f, 15.9729f)
                curveTo(15.2078f, 15.9742f, 15.2003f, 15.9754f, 15.1915f, 15.9754f)
                curveTo(15.1753f, 15.9754f, 15.159f, 15.9742f, 15.1415f, 15.9704f)
                curveTo(15.134f, 15.9692f, 15.1265f, 15.9692f, 15.119f, 15.9667f)
                curveTo(15.094f, 15.9592f, 15.0678f, 15.9504f, 15.0415f, 15.9342f)
                curveTo(15.029f, 15.9267f, 15.0178f, 15.9192f, 15.0065f, 15.9104f)
                curveTo(15.0015f, 15.9054f, 14.9953f, 15.9004f, 14.9903f, 15.8954f)
                curveTo(14.9853f, 15.8904f, 14.979f, 15.8854f, 14.974f, 15.8804f)
                curveTo(14.9678f, 15.8729f, 14.9615f, 15.8642f, 14.9553f, 15.8567f)
                curveTo(14.9528f, 15.8529f, 14.949f, 15.8492f, 14.9465f, 15.8442f)
                curveTo(14.9403f, 15.8342f, 14.9353f, 15.8242f, 14.9303f, 15.8129f)
                curveTo(14.929f, 15.8092f, 14.9265f, 15.8054f, 14.9253f, 15.8017f)
                curveTo(14.9203f, 15.7904f, 14.9178f, 15.7779f, 14.9153f, 15.7654f)
                curveTo(14.914f, 15.7617f, 14.9128f, 15.7579f, 14.9115f, 15.7542f)
                curveTo(14.909f, 15.7417f, 14.909f, 15.7279f, 14.9078f, 15.7154f)
                curveTo(14.9078f, 15.7104f, 14.9065f, 15.7067f, 14.9065f, 15.7029f)
                curveTo(14.9065f, 15.6892f, 14.909f, 15.6754f, 14.9115f, 15.6617f)
                curveTo(14.9128f, 15.6567f, 14.9128f, 15.6517f, 14.914f, 15.6454f)
                curveTo(14.9165f, 15.6317f, 14.9228f, 15.6179f, 14.9278f, 15.6029f)
                curveTo(14.9303f, 15.5967f, 14.9315f, 15.5904f, 14.934f, 15.5854f)
                curveTo(15.219f, 15.183f, 15.3665f, 14.8317f, 15.3665f, 14.8317f)
                curveTo(15.414f, 14.7342f, 15.4315f, 14.6317f, 15.4315f, 14.6317f)
                curveTo(15.4003f, 14.5742f, 15.3503f, 14.658f, 15.3503f, 14.658f)
                curveTo(15.0253f, 15.263f, 14.8328f, 15.5054f, 14.8328f, 15.5054f)
                curveTo(14.8328f, 15.5054f, 14.6815f, 15.7692f, 14.3503f, 15.5717f)
                curveTo(14.3503f, 15.5717f, 14.1866f, 15.4667f, 14.1591f, 15.393f)
                curveTo(14.1353f, 15.3317f, 14.1203f, 15.223f, 14.2041f, 15.068f)
                curveTo(14.2041f, 15.068f, 14.4028f, 14.6617f, 14.7303f, 14.1505f)
                curveTo(14.7303f, 14.1505f, 14.7515f, 14.0705f, 14.6778f, 14.1155f)
                curveTo(14.6203f, 14.1505f, 14.5791f, 14.223f, 14.5591f, 14.2455f)
                curveTo(14.5591f, 14.2455f, 14.3653f, 14.5043f, 14.0841f, 15.0205f)
                curveTo(14.0841f, 15.0205f, 14.0216f, 15.1392f, 13.9491f, 15.198f)
                curveTo(13.8778f, 15.228f, 13.7878f, 15.2167f, 13.6891f, 15.143f)
                curveTo(13.4754f, 14.983f, 13.5554f, 14.7592f, 13.6741f, 14.5292f)
                curveTo(13.7391f, 14.4043f, 13.8878f, 14.123f, 14.0291f, 13.898f)
                curveTo(14.0428f, 13.893f, 14.0566f, 13.888f, 14.0703f, 13.8855f)
                curveTo(14.1153f, 13.878f, 14.1516f, 13.8543f, 14.1741f, 13.8193f)
                curveTo(14.2866f, 13.648f, 14.1978f, 13.4931f, 14.0403f, 13.7318f)
                curveTo(13.6454f, 13.7993f, 13.3654f, 14.5717f, 13.3516f, 14.953f)
                curveTo(13.3516f, 14.9667f, 13.3454f, 15.2767f, 13.6654f, 15.4192f)
                curveTo(13.6754f, 15.423f, 13.7916f, 15.4654f, 13.9166f, 15.4367f)
                curveTo(13.9478f, 15.5404f, 14.0328f, 15.6617f, 14.2316f, 15.7754f)
                curveTo(14.2353f, 15.7779f, 14.4091f, 15.8842f, 14.5991f, 15.8817f)
                curveTo(14.634f, 15.8804f, 14.669f, 15.8767f, 14.7015f, 15.8679f)
                curveTo(14.7215f, 15.9329f, 14.764f, 16.0042f, 14.849f, 16.0692f)
                curveTo(14.859f, 16.0767f, 15.054f, 16.2229f, 15.2415f, 16.1854f)
                curveTo(15.2778f, 16.2429f, 15.3303f, 16.2829f, 15.344f, 16.2929f)
                curveTo(15.4015f, 16.3292f, 15.4628f, 16.3479f, 15.5253f, 16.3529f)
                horizontalLineTo(15.5815f)
                curveTo(15.6615f, 16.3479f, 15.7452f, 16.3204f, 15.8277f, 16.2692f)
                curveTo(15.829f, 16.2692f, 15.829f, 16.2679f, 15.8302f, 16.2679f)
                curveTo(16.024f, 16.1354f, 16.3027f, 15.5817f, 16.3027f, 15.5254f)
                curveTo(16.3027f, 15.5242f, 15.8827f, 16.2542f, 15.529f, 16.1942f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFEDBD82)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(4.5533f, 14.2791f)
                curveTo(4.5383f, 13.8979f, 4.2583f, 13.1255f, 3.8646f, 13.058f)
                curveTo(3.7084f, 12.8192f, 3.6184f, 12.9742f, 3.7309f, 13.1455f)
                curveTo(3.7534f, 13.1805f, 3.7909f, 13.203f, 3.8346f, 13.2117f)
                curveTo(3.8484f, 13.2142f, 3.8621f, 13.2192f, 3.8759f, 13.2242f)
                curveTo(4.0171f, 13.4492f, 4.1659f, 13.7317f, 4.2308f, 13.8554f)
                curveTo(4.3496f, 14.0842f, 4.4283f, 14.3079f, 4.2158f, 14.4691f)
                curveTo(4.1171f, 14.5429f, 4.0283f, 14.5541f, 3.9559f, 14.5241f)
                curveTo(3.8846f, 14.4654f, 3.8209f, 14.3466f, 3.8209f, 14.3466f)
                curveTo(3.5396f, 13.8304f, 3.3459f, 13.5717f, 3.3459f, 13.5717f)
                curveTo(3.3259f, 13.5492f, 3.2859f, 13.4779f, 3.2271f, 13.4417f)
                curveTo(3.1534f, 13.3967f, 3.1746f, 13.4767f, 3.1746f, 13.4767f)
                curveTo(3.5021f, 13.9867f, 3.7009f, 14.3941f, 3.7009f, 14.3941f)
                curveTo(3.7859f, 14.5491f, 3.7709f, 14.6579f, 3.7459f, 14.7191f)
                curveTo(3.7184f, 14.7929f, 3.5546f, 14.8979f, 3.5546f, 14.8979f)
                curveTo(3.2246f, 15.0954f, 3.0721f, 14.8316f, 3.0721f, 14.8316f)
                curveTo(3.0721f, 14.8316f, 2.8784f, 14.5891f, 2.5547f, 13.9842f)
                curveTo(2.5547f, 13.9842f, 2.5034f, 13.9004f, 2.4734f, 13.9579f)
                curveTo(2.4734f, 13.9579f, 2.4909f, 14.0604f, 2.5384f, 14.1579f)
                curveTo(2.5384f, 14.1579f, 2.6859f, 14.5079f, 2.9709f, 14.9116f)
                curveTo(2.9734f, 14.9179f, 2.9747f, 14.9241f, 2.9772f, 14.9291f)
                curveTo(2.9822f, 14.9429f, 2.9872f, 14.9579f, 2.9909f, 14.9716f)
                curveTo(2.9922f, 14.9766f, 2.9922f, 14.9816f, 2.9934f, 14.9879f)
                curveTo(2.9959f, 15.0016f, 2.9984f, 15.0154f, 2.9984f, 15.0291f)
                curveTo(2.9984f, 15.0341f, 2.9972f, 15.0379f, 2.9972f, 15.0416f)
                curveTo(2.9972f, 15.0554f, 2.9959f, 15.0679f, 2.9934f, 15.0804f)
                curveTo(2.9922f, 15.0841f, 2.9909f, 15.0879f, 2.9909f, 15.0916f)
                curveTo(2.9884f, 15.1041f, 2.9847f, 15.1166f, 2.9797f, 15.1279f)
                curveTo(2.9784f, 15.1316f, 2.9759f, 15.1354f, 2.9747f, 15.1391f)
                curveTo(2.9697f, 15.1491f, 2.9647f, 15.1604f, 2.9584f, 15.1704f)
                curveTo(2.9559f, 15.1741f, 2.9522f, 15.1779f, 2.9497f, 15.1829f)
                curveTo(2.9434f, 15.1916f, 2.9372f, 15.1991f, 2.9309f, 15.2066f)
                curveTo(2.9259f, 15.2116f, 2.9197f, 15.2166f, 2.9147f, 15.2216f)
                curveTo(2.9097f, 15.2266f, 2.9047f, 15.2316f, 2.8984f, 15.2366f)
                curveTo(2.8872f, 15.2453f, 2.8747f, 15.2541f, 2.8634f, 15.2603f)
                curveTo(2.8359f, 15.2753f, 2.8097f, 15.2866f, 2.7859f, 15.2928f)
                curveTo(2.7784f, 15.2953f, 2.7709f, 15.2953f, 2.7622f, 15.2966f)
                curveTo(2.7447f, 15.2991f, 2.7284f, 15.3016f, 2.7122f, 15.3016f)
                curveTo(2.7047f, 15.3016f, 2.6959f, 15.3003f, 2.6884f, 15.2991f)
                curveTo(2.6734f, 15.2966f, 2.6584f, 15.2941f, 2.6447f, 15.2891f)
                curveTo(2.6384f, 15.2866f, 2.6309f, 15.2841f, 2.6247f, 15.2816f)
                curveTo(2.6097f, 15.2753f, 2.5947f, 15.2666f, 2.5797f, 15.2578f)
                curveTo(2.5759f, 15.2553f, 2.5722f, 15.2541f, 2.5684f, 15.2516f)
                curveTo(2.4947f, 15.1791f, 2.3247f, 14.9841f, 2.0772f, 14.5379f)
                curveTo(2.0772f, 14.5379f, 2.0285f, 14.4254f, 2.0047f, 14.4641f)
                curveTo(2.0047f, 14.4641f, 1.9797f, 14.4941f, 2.0485f, 14.6666f)
                curveTo(2.0485f, 14.6666f, 2.1472f, 14.9141f, 2.3972f, 15.2453f)
                curveTo(2.4884f, 15.3703f, 2.4784f, 15.4328f, 2.4434f, 15.4716f)
                curveTo(2.4409f, 15.4741f, 2.4372f, 15.4766f, 2.4347f, 15.4803f)
                curveTo(2.4172f, 15.4966f, 2.3959f, 15.5091f, 2.3747f, 15.5203f)
                curveTo(2.021f, 15.5816f, 1.5997f, 14.8504f, 1.5997f, 14.8504f)
                curveTo(1.5997f, 14.9079f, 1.8785f, 15.4616f, 2.0722f, 15.5928f)
                curveTo(2.0735f, 15.5928f, 2.0735f, 15.5941f, 2.0747f, 15.5941f)
                curveTo(2.1572f, 15.6453f, 2.2397f, 15.6728f, 2.3209f, 15.6778f)
                horizontalLineTo(2.3772f)
                curveTo(2.4409f, 15.6728f, 2.5022f, 15.6541f, 2.5584f, 15.6178f)
                curveTo(2.5722f, 15.6078f, 2.6247f, 15.5666f, 2.6609f, 15.5103f)
                curveTo(2.8484f, 15.5478f, 3.0447f, 15.4016f, 3.0534f, 15.3941f)
                curveTo(3.1384f, 15.3291f, 3.1809f, 15.2578f, 3.2009f, 15.1929f)
                curveTo(3.2334f, 15.2016f, 3.2671f, 15.2066f, 3.3034f, 15.2066f)
                curveTo(3.4934f, 15.2103f, 3.6671f, 15.1029f, 3.6709f, 15.1004f)
                curveTo(3.8696f, 14.9879f, 3.9546f, 14.8654f, 3.9859f, 14.7616f)
                curveTo(4.1108f, 14.7891f, 4.2271f, 14.7479f, 4.2371f, 14.7441f)
                curveTo(4.5608f, 14.6029f, 4.5546f, 14.2929f, 4.5533f, 14.2791f)
                close()
            }
            path(
                fill = linearGradient(
                    0.0f to Color(0xFF4DD0E1),
                    1.0f to Color(0xFF00BCD4),
                    start = Offset(8.99909f, 10.3159f),
                    end = Offset(8.99909f, 18.8671f)
                ),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.7488f, 16.4974f)
                verticalLineTo(11.1464f)
                curveTo(14.7488f, 10.699f, 14.3838f, 10.334f, 13.9363f, 10.334f)
                horizontalLineTo(4.0619f)
                curveTo(3.6144f, 10.334f, 3.2494f, 10.699f, 3.2494f, 11.1464f)
                verticalLineTo(16.4987f)
                horizontalLineTo(14.7488f)
                verticalLineTo(16.4974f)
                close()
            }
            path(
                fill = linearGradient(
                    0.0f to Color(0xFF00BCD4),
                    1.0f to Color(0xFF0097A7),
                    start = Offset(8.99916f, 12.5734f),
                    end = Offset(8.99916f, 17.4829f)
                ),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.8729f, 16.4962f)
                curveTo(10.7966f, 16.255f, 10.6966f, 15.9825f, 10.6116f, 15.6925f)
                curveTo(10.4404f, 15.11f, 10.3691f, 14.1376f, 10.3392f, 13.4589f)
                curveTo(10.3204f, 13.0301f, 9.9654f, 12.6914f, 9.5329f, 12.6914f)
                horizontalLineTo(8.4642f)
                curveTo(8.0318f, 12.6914f, 7.6768f, 13.0289f, 7.658f, 13.4589f)
                curveTo(7.628f, 14.1376f, 7.5568f, 15.11f, 7.3856f, 15.6925f)
                curveTo(7.3006f, 15.9825f, 7.2018f, 16.255f, 7.1243f, 16.4962f)
                horizontalLineTo(10.8729f)
                close()
            }
        }.build()
        return _developer!!
    }
