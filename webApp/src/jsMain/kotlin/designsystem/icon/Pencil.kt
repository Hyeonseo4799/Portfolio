package designsystem.icon

import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _pencil: ImageVector? = null

val Pencil: ImageVector
    get() {
        if (_pencil != null) {
            return _pencil!!
        }
        _pencil = ImageVector.Builder(
            name = "vector",
            defaultWidth = 18.dp,
            defaultHeight = 18.dp,
            viewportWidth = 18f,
            viewportHeight = 18f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFFECB3)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(16.4861f, 15.8522f)
                lineTo(15.7135f, 13.7907f)
                lineTo(15.1822f, 12.3718f)
                curveTo(15.0622f, 12.0055f, 15.0397f, 11.8542f, 14.8359f, 11.6504f)
                lineTo(13.3582f, 10.1727f)
                lineTo(10.1753f, 13.3556f)
                lineTo(11.6542f, 14.8346f)
                curveTo(11.7755f, 14.9558f, 12.008f, 15.0596f, 12.3743f, 15.1796f)
                lineTo(13.7932f, 15.7109f)
                lineTo(15.8548f, 16.4835f)
                curveTo(16.2436f, 16.6098f, 16.6123f, 16.241f, 16.4861f, 15.8522f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF616161)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(15.8544f, 16.4832f)
                lineTo(14.147f, 15.8432f)
                curveTo(14.147f, 15.8432f, 14.8519f, 15.8032f, 15.3282f, 15.327f)
                curveTo(15.8044f, 14.8507f, 15.8456f, 14.1445f, 15.8456f, 14.1445f)
                lineTo(16.4856f, 15.8519f)
                curveTo(16.6118f, 16.2407f, 16.2431f, 16.6094f, 15.8544f, 16.4832f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFEF5350)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(6.39727f, 3.2138f)
                lineTo(5.72106f, 5.62493f)
                lineTo(3.21619f, 6.39489f)
                lineTo(1.80127f, 4.98121f)
                curveTo(1.4113f, 4.5912f, 1.2263f, 3.8138f, 2.26f, 2.7801f)
                lineTo(2.88371f, 2.15636f)
                curveTo(3.7774f, 1.2627f, 4.5936f, 1.4089f, 4.9836f, 1.7989f)
                lineTo(6.39727f, 3.2138f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFC107)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(5.28418f, 6.58084f)
                lineTo(6.58059f, 5.28442f)
                lineTo(14.1103f, 12.8141f)
                curveTo(14.1103f, 12.8141f, 14.2641f, 13.4542f, 13.8728f, 13.8455f)
                curveTo(13.4815f, 14.2368f, 12.8139f, 14.1105f, 12.8139f, 14.1105f)
                lineTo(5.28418f, 6.58084f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFA000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(4.3418f, 7.52355f)
                lineTo(11.6652f, 14.847f)
                curveTo(12.8479f, 15.1045f, 12.7966f, 14.0931f, 12.7966f, 14.0931f)
                lineTo(5.28441f, 6.58093f)
                lineTo(4.3418f, 7.52355f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFDD835)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(6.58252f, 5.28332f)
                lineTo(14.0947f, 12.7955f)
                curveTo(14.0947f, 12.7955f, 15.4474f, 12.7955f, 14.8286f, 11.6441f)
                lineTo(7.52514f, 4.3407f)
                lineTo(6.58252f, 5.28332f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD1762C)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(12.7857f, 14.257f)
                lineTo(5.2085f, 6.67981f)
                lineTo(5.38477f, 6.50354f)
                lineTo(13.0107f, 14.1295f)
                lineTo(12.8144f, 14.1095f)
                lineTo(12.7857f, 14.257f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF19534)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(14.1401f, 13.0204f)
                lineTo(6.01904f, 4.89942f)
                lineTo(6.19656f, 4.72314f)
                lineTo(14.2563f, 12.7829f)
                lineTo(14.1101f, 12.8129f)
                lineTo(14.1401f, 13.0204f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF4E342E)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(7.52413f, 4.3407f)
                curveTo(7.5241f, 4.3407f, 6.8404f, 5.3519f, 6.2742f, 5.9244f)
                curveTo(5.1905f, 7.0168f, 4.3418f, 7.523f, 4.3418f, 7.523f)
                lineTo(4.56054f, 7.74177f)
                curveTo(4.8718f, 7.6205f, 5.668f, 7.2568f, 6.4629f, 6.4631f)
                curveTo(7.2629f, 5.6631f, 7.6404f, 4.8819f, 7.7666f, 4.5832f)
                lineTo(7.52413f, 4.3407f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF94D1E0)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(3.93636f, 7.48767f)
                curveTo(4.0064f, 7.5577f, 4.1051f, 7.5889f, 4.2026f, 7.5727f)
                curveTo(4.2026f, 7.5727f, 5.2263f, 7.2602f, 6.2437f, 6.2427f)
                curveTo(7.2612f, 5.2253f, 7.5974f, 4.2341f, 7.5974f, 4.2341f)
                curveTo(7.6137f, 4.1366f, 7.5824f, 4.0366f, 7.5124f, 3.9666f)
                lineTo(6.43997f, 2.89416f)
                curveTo(6.395f, 2.8492f, 6.3325f, 2.8254f, 6.27f, 2.8329f)
                curveTo(6.2487f, 2.8354f, 6.2275f, 2.8379f, 6.205f, 2.8417f)
                curveTo(6.12f, 2.8542f, 6.0525f, 2.9167f, 6.0287f, 2.9992f)
                curveTo(6.0287f, 2.9992f, 5.5388f, 3.9491f, 4.7313f, 4.7553f)
                curveTo(3.9239f, 5.5615f, 2.9389f, 6.0315f, 2.9389f, 6.0315f)
                curveTo(2.8564f, 6.054f, 2.7927f, 6.1202f, 2.7802f, 6.2052f)
                curveTo(2.7802f, 6.2065f, 2.7802f, 6.2065f, 2.7802f, 6.2077f)
                curveTo(2.7702f, 6.2752f, 2.7927f, 6.3427f, 2.8402f, 6.3902f)
                lineTo(3.93636f, 7.48767f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFF8383)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(3.27399f, 3.2742f)
                curveTo(4.0076f, 2.5405f, 4.4262f, 1.7696f, 4.209f, 1.5523f)
                curveTo(3.9918f, 1.3351f, 3.221f, 1.7538f, 2.4875f, 2.4875f)
                curveTo(1.7539f, 3.2212f, 1.3353f, 3.9921f, 1.5525f, 4.2094f)
                curveTo(1.7696f, 4.4266f, 2.5404f, 4.0079f, 3.274f, 3.2742f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB9E4EA)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(6.20139f, 3.71786f)
                curveTo(5.7902f, 4.5053f, 5.1139f, 5.1515f, 4.309f, 5.5253f)
                curveTo(4.2565f, 5.549f, 4.1827f, 5.5665f, 4.1515f, 5.519f)
                curveTo(4.1277f, 5.4815f, 4.149f, 5.434f, 4.1727f, 5.3965f)
                curveTo(4.2777f, 5.234f, 4.4227f, 5.1028f, 4.5627f, 4.969f)
                curveTo(4.9277f, 4.6191f, 5.2627f, 4.2391f, 5.5639f, 3.8341f)
                curveTo(5.7177f, 3.6279f, 5.8614f, 3.4154f, 5.9964f, 3.1966f)
                curveTo(6.0714f, 3.0766f, 6.2051f, 2.8229f, 6.3764f, 3.0016f)
                curveTo(6.5251f, 3.1554f, 6.2801f, 3.5666f, 6.2014f, 3.7179f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB9E4EA)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(5.73545f, 5.18417f)
                curveTo(5.703f, 5.2179f, 5.6692f, 5.2517f, 5.653f, 5.2954f)
                curveTo(5.6367f, 5.3392f, 5.643f, 5.3954f, 5.6805f, 5.4229f)
                curveTo(5.7117f, 5.4467f, 5.7542f, 5.4442f, 5.793f, 5.4379f)
                curveTo(6.0092f, 5.4042f, 6.2004f, 5.2817f, 6.3692f, 5.1442f)
                curveTo(6.7379f, 4.8454f, 7.0504f, 4.4305f, 7.0804f, 3.9567f)
                curveTo(7.0841f, 3.9005f, 7.0829f, 3.8417f, 7.0579f, 3.7917f)
                curveTo(6.8991f, 3.478f, 6.5629f, 4.1792f, 6.4967f, 4.278f)
                curveTo(6.2754f, 4.6067f, 6.0117f, 4.9017f, 5.7355f, 5.1842f)
                close()
            }
        }.build()
        return _pencil!!
    }
