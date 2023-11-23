package designsystem.icon

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _postbox: ImageVector? = null

val Postbox: ImageVector
    get() {
        if (_postbox != null) {
            return _postbox!!
        }
        _postbox = ImageVector.Builder(
            name = "vector",
            defaultWidth = 18.dp,
            defaultHeight = 18.dp,
            viewportWidth = 18f,
            viewportHeight = 18f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF78A3AC)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(10.3892f, 11.8912f)
                horizontalLineTo(7.61182f)
                verticalLineTo(16.501f)
                horizontalLineTo(10.3892f)
                verticalLineTo(11.8912f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF4B727B)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(10.3742f, 12.9226f)
                horizontalLineTo(7.61182f)
                verticalLineTo(15.2962f)
                curveTo(7.6118f, 15.2962f, 8.0368f, 15.0137f, 8.9492f, 15.135f)
                curveTo(9.9279f, 15.2637f, 10.3742f, 15.9424f, 10.3742f, 15.9424f)
                verticalLineTo(12.9226f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC62828)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(5.07409f, 1.46484f)
                horizontalLineTo(12.9626f)
                curveTo(13.2314f, 1.4648f, 13.4751f, 1.6198f, 13.5902f, 1.8636f)
                lineTo(14.1127f, 3.17725f)
                horizontalLineTo(3.8877f)
                lineTo(4.45402f, 1.84732f)
                curveTo(4.5728f, 1.6123f, 4.8116f, 1.4648f, 5.0741f, 1.4648f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF44336)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(13.7314f, 14.4853f)
                horizontalLineTo(4.27017f)
                curveTo(4.0314f, 14.4853f, 3.8389f, 14.2927f, 3.8389f, 14.054f)
                verticalLineTo(3.37637f)
                curveTo(3.8389f, 3.1376f, 4.0314f, 2.9451f, 4.2702f, 2.9451f)
                horizontalLineTo(13.7301f)
                curveTo(13.9689f, 2.9451f, 14.1614f, 3.1376f, 14.1614f, 3.3764f)
                verticalLineTo(14.054f)
                curveTo(14.1627f, 14.2915f, 13.9689f, 14.4853f, 13.7314f, 14.4853f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC62828)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.18649f, 8.83087f)
                curveTo(5.0194f, 8.8309f, 4.884f, 8.9663f, 4.884f, 9.1333f)
                verticalLineTo(13.0281f)
                curveTo(4.884f, 13.1951f, 5.0194f, 13.3305f, 5.1865f, 13.3305f)
                horizontalLineTo(12.8149f)
                curveTo(12.9818f, 13.3305f, 13.1176f, 13.1953f, 13.1187f, 13.0278f)
                verticalLineTo(9.13329f)
                curveTo(13.1187f, 8.9663f, 12.9832f, 8.8309f, 12.8162f, 8.8309f)
                horizontalLineTo(5.18649f)
                close()
                moveTo(4.65137f, 9.13329f)
                curveTo(4.6514f, 8.8378f, 4.891f, 8.5983f, 5.1865f, 8.5983f)
                horizontalLineTo(12.8162f)
                curveTo(13.1117f, 8.5983f, 13.3513f, 8.8378f, 13.3513f, 9.1333f)
                verticalLineTo(13.0281f)
                lineTo(13.3513f, 13.0287f)
                curveTo(13.3497f, 13.3236f, 13.1106f, 13.5631f, 12.8149f, 13.5631f)
                horizontalLineTo(5.18649f)
                curveTo(4.891f, 13.5631f, 4.6514f, 13.3236f, 4.6514f, 13.0281f)
                verticalLineTo(9.13329f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC62828)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(6.65557f, 11.3074f)
                curveTo(6.6456f, 11.4061f, 6.7231f, 11.4911f, 6.8218f, 11.4911f)
                horizontalLineTo(13.0289f)
                curveTo(13.1351f, 11.4911f, 13.2139f, 11.3936f, 13.1926f, 11.2899f)
                lineTo(12.3513f, 6.63928f)
                curveTo(12.3513f, 6.6393f, 13.0539f, 6.6168f, 13.0864f, 6.3192f)
                curveTo(13.1189f, 6.0217f, 13.0726f, 5.9755f, 13.0626f, 5.6679f)
                curveTo(13.0526f, 5.3591f, 12.15f, 4.6653f, 12.15f, 4.6653f)
                lineTo(5.53418f, 4.97782f)
                lineTo(6.0955f, 6.33424f)
                lineTo(7.00561f, 6.35049f)
                lineTo(7.05312f, 7.89319f)
                lineTo(6.65557f, 11.3074f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF4E342E)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(11.6447f, 6.45395f)
                horizontalLineTo(6.3565f)
                curveTo(6.2127f, 6.4539f, 6.0952f, 6.3377f, 6.0952f, 6.1927f)
                verticalLineTo(5.44775f)
                horizontalLineTo(11.9059f)
                verticalLineTo(6.19271f)
                curveTo(11.9059f, 6.3365f, 11.7897f, 6.4539f, 11.6447f, 6.4539f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(11.2597f, 4.95407f)
                lineTo(12.4636f, 9.9272f)
                curveTo(12.4936f, 10.0797f, 12.3624f, 10.1072f, 12.2374f, 10.1072f)
                horizontalLineTo(5.82906f)
                curveTo(5.704f, 10.1072f, 5.5715f, 10.066f, 5.6028f, 9.9272f)
                lineTo(6.74167f, 4.95407f)
                curveTo(6.7417f, 4.8553f, 6.8429f, 4.774f, 6.968f, 4.774f)
                horizontalLineTo(11.0347f)
                curveTo(11.1585f, 4.774f, 11.2135f, 4.8128f, 11.2597f, 4.9541f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE0E0E0)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(11.5892f, 6.28263f)
                lineTo(6.43359f, 6.29637f)
                lineTo(6.68988f, 5.17893f)
                lineTo(11.2804f, 5.03894f)
                lineTo(11.5892f, 6.28263f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6FBFF0)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(12.2247f, 9.84332f)
                lineTo(8.98057f, 7.86932f)
                lineTo(9.39562f, 7.55428f)
                curveTo(9.6544f, 7.3318f, 9.6507f, 7.0005f, 9.3869f, 6.7817f)
                lineTo(8.95182f, 6.41914f)
                lineTo(11.0533f, 4.9427f)
                curveTo(11.0908f, 4.9139f, 11.1058f, 4.8889f, 11.0808f, 4.8627f)
                curveTo(11.0646f, 4.8464f, 11.0346f, 4.8502f, 11.0008f, 4.8739f)
                lineTo(8.74804f, 6.25036f)
                lineTo(7.08783f, 4.86519f)
                curveTo(7.0578f, 4.8389f, 6.9528f, 4.8477f, 7.0366f, 4.9277f)
                lineTo(9.08933f, 6.88294f)
                curveTo(9.2706f, 7.053f, 9.2631f, 7.268f, 9.0331f, 7.4655f)
                lineTo(5.84393f, 9.85582f)
                curveTo(5.8139f, 9.8821f, 5.7714f, 9.9158f, 5.7939f, 9.9508f)
                curveTo(5.8202f, 9.9921f, 5.8839f, 9.9696f, 5.9127f, 9.9421f)
                lineTo(8.60927f, 8.09185f)
                lineTo(12.1697f, 9.91208f)
                curveTo(12.1697f, 9.9121f, 12.2497f, 9.9658f, 12.276f, 9.9258f)
                curveTo(12.3022f, 9.8858f, 12.2247f, 9.8433f, 12.2247f, 9.8433f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6FBFF0)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.1283f, 4.81767f)
                lineTo(8.75369f, 6.17379f)
                lineTo(10.9666f, 4.82171f)
                curveTo(10.9882f, 4.8068f, 11.0129f, 4.7951f, 11.039f, 4.7915f)
                curveTo(11.0668f, 4.7877f, 11.0997f, 4.7933f, 11.125f, 4.8186f)
                lineTo(11.1261f, 4.8197f)
                curveTo(11.1378f, 4.832f, 11.1485f, 4.848f, 11.1532f, 4.8681f)
                curveTo(11.1581f, 4.8888f, 11.1553f, 4.9085f, 11.1485f, 4.9253f)
                curveTo(11.1364f, 4.9551f, 11.1112f, 4.9772f, 11.0914f, 4.9924f)
                lineTo(11.0903f, 4.99323f)
                lineTo(9.05454f, 6.42349f)
                lineTo(9.42678f, 6.7337f)
                curveTo(9.4268f, 6.7337f, 9.4268f, 6.7337f, 9.4268f, 6.7337f)
                curveTo(9.5707f, 6.8531f, 9.6479f, 7.0072f, 9.6497f, 7.166f)
                curveTo(9.6515f, 7.3249f, 9.5778f, 7.4802f, 9.4364f, 7.6018f)
                lineTo(9.43494f, 7.60304f)
                lineTo(9.09147f, 7.86375f)
                lineTo(12.2563f, 9.78951f)
                lineTo(12.2566f, 9.78967f)
                curveTo(12.2575f, 9.7902f, 12.2587f, 9.7909f, 12.2602f, 9.7917f)
                curveTo(12.263f, 9.7934f, 12.2669f, 9.7958f, 12.2713f, 9.7988f)
                curveTo(12.28f, 9.8047f, 12.2921f, 9.8135f, 12.3037f, 9.8248f)
                curveTo(12.3147f, 9.8355f, 12.3294f, 9.8522f, 12.3376f, 9.8744f)
                curveTo(12.347f, 9.8996f, 12.3474f, 9.9311f, 12.3282f, 9.9603f)
                curveTo(12.3081f, 9.991f, 12.2771f, 10.0018f, 12.2516f, 10.0031f)
                curveTo(12.2283f, 10.0043f, 12.2067f, 9.9983f, 12.1917f, 9.9929f)
                curveTo(12.1758f, 9.9871f, 12.1618f, 9.9799f, 12.1522f, 9.9746f)
                curveTo(12.1472f, 9.9718f, 12.1432f, 9.9694f, 12.1402f, 9.9675f)
                curveTo(12.1396f, 9.9671f, 12.139f, 9.9668f, 12.1385f, 9.9664f)
                lineTo(8.61396f, 8.16457f)
                lineTo(5.95167f, 9.99127f)
                curveTo(5.9288f, 10.0115f, 5.8964f, 10.0282f, 5.8629f, 10.034f)
                curveTo(5.8265f, 10.0402f, 5.773f, 10.0346f, 5.7412f, 9.9845f)
                curveTo(5.7276f, 9.9632f, 5.7226f, 9.9393f, 5.7262f, 9.9157f)
                curveTo(5.7295f, 9.8938f, 5.7395f, 9.8762f, 5.7485f, 9.8637f)
                curveTo(5.7634f, 9.8429f, 5.7851f, 9.8242f, 5.7982f, 9.8128f)
                curveTo(5.7999f, 9.8114f, 5.8014f, 9.8101f, 5.8028f, 9.8089f)
                lineTo(5.80455f, 9.80734f)
                lineTo(8.99391f, 7.41689f)
                curveTo(9.1003f, 7.325f, 9.147f, 7.2363f, 9.1531f, 7.1591f)
                curveTo(9.1592f, 7.083f, 9.1272f, 7.0042f, 9.0466f, 6.9287f)
                lineTo(9.04623f, 6.92833f)
                lineTo(6.99347f, 4.97309f)
                curveTo(6.9701f, 4.9508f, 6.9473f, 4.9224f, 6.943f, 4.8884f)
                curveTo(6.9406f, 4.8691f, 6.9444f, 4.8491f, 6.9558f, 4.8317f)
                curveTo(6.9665f, 4.8153f, 6.9811f, 4.8055f, 6.9936f, 4.7999f)
                curveTo(7.0174f, 4.789f, 7.0434f, 4.7882f, 7.0633f, 4.7908f)
                curveTo(7.0825f, 4.7932f, 7.108f, 4.8003f, 7.1283f, 4.8177f)
                close()
                moveTo(7.56519f, 5.34499f)
                lineTo(9.1321f, 6.83748f)
                curveTo(9.1322f, 6.8375f, 9.1322f, 6.8376f, 9.1323f, 6.8377f)
                curveTo(9.2329f, 6.9321f, 9.2876f, 7.0458f, 9.2778f, 7.169f)
                curveTo(9.268f, 7.2908f, 9.1963f, 7.4079f, 9.0738f, 7.5131f)
                lineTo(9.07223f, 7.51442f)
                lineTo(6.16717f, 9.69179f)
                lineTo(8.6046f, 8.01938f)
                lineTo(11.7466f, 9.62569f)
                lineTo(8.86969f, 7.87514f)
                lineTo(9.35628f, 7.5058f)
                curveTo(9.4726f, 7.4051f, 9.526f, 7.284f, 9.5247f, 7.1674f)
                curveTo(9.5234f, 7.0503f, 9.4668f, 6.9293f, 9.347f, 6.8299f)
                lineTo(9.34686f, 6.82983f)
                lineTo(8.84911f, 6.41503f)
                lineTo(10.5204f, 5.24088f)
                lineTo(8.74241f, 6.32719f)
                lineTo(7.56519f, 5.34499f)
                close()
                moveTo(7.06524f, 4.86587f)
                curveTo(7.0652f, 4.8659f, 7.0653f, 4.8659f, 7.0653f, 4.866f)
                lineTo(7.06524f, 4.86587f)
                close()
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF4E342E)),
                    fillAlpha = 0.3f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(12.7408f, 8.83075f)
                    horizontalLineTo(12.2096f)
                    lineTo(12.1509f, 8.59827f)
                    horizontalLineTo(12.7021f)
                    lineTo(12.7408f, 8.83075f)
                    close()
                }
            }
            path(
                fill = SolidColor(Color(0xFFF44336)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(12.0473f, 5.4476f)
                horizontalLineTo(5.809f)
                curveTo(5.6565f, 5.4476f, 5.5327f, 5.3239f, 5.5327f, 5.1714f)
                verticalLineTo(4.97637f)
                lineTo(12.2511f, 4.37891f)
                lineTo(12.3498f, 5.14262f)
                curveTo(12.3511f, 5.3114f, 12.2148f, 5.4476f, 12.0473f, 5.4476f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFF7555)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(11.8586f, 5.17153f)
                horizontalLineTo(6.01288f)
                curveTo(5.7778f, 5.1715f, 5.6053f, 4.9903f, 5.6616f, 4.8028f)
                curveTo(5.6616f, 4.8028f, 5.7766f, 4.3353f, 5.9379f, 4.3353f)
                horizontalLineTo(11.9761f)
                curveTo(12.1374f, 4.3353f, 12.1336f, 4.8203f, 12.1336f, 4.8203f)
                curveTo(12.1899f, 5.0078f, 12.0936f, 5.1715f, 11.8586f, 5.1715f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFF9D83)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(5.8411f, 4.35885f)
                curveTo(5.9236f, 4.3139f, 6.3323f, 4.2801f, 6.3123f, 4.4251f)
                curveTo(6.3036f, 4.4876f, 6.2336f, 4.8838f, 6.1986f, 4.9738f)
                curveTo(6.1698f, 5.0463f, 6.1773f, 5.1738f, 6.0123f, 5.1726f)
                curveTo(5.9486f, 5.1726f, 5.6786f, 5.1713f, 5.6286f, 5.1451f)
                curveTo(5.5336f, 5.0951f, 5.5936f, 4.9888f, 5.6161f, 4.9151f)
                curveTo(5.6999f, 4.6501f, 5.7798f, 4.3914f, 5.8411f, 4.3589f)
                close()
            }
        }.build()
        return _postbox!!
    }
