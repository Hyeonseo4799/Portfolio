package designsystem.icon

import androidx.compose.ui.geometry.Offset
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

private var _handUp: ImageVector? = null
val HandUp: ImageVector
    get() {
        if (_handUp != null) {
            return _handUp!!
        }
        _handUp = Builder(
            name = "IcHandUp",
            defaultWidth = 18.dp,
            defaultHeight = 18.dp,
            viewportWidth = 18f,
            viewportHeight = 18f
        ).apply {
            path(
                fill = radialGradient(
                    0.3533f to Color(0xFFFFCA28),
                    0.8723f to Color(0xFFFFB300),
                    center = Offset(8.06584f, 5.15168f),
                    radius = 11.5731f
                ),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.7292f, 16.3037f)
                curveTo(6.2906f, 16.3037f, 5.1856f, 15.9349f, 4.4457f, 15.2086f)
                curveTo(3.7407f, 14.516f, 3.5832f, 13.6971f, 3.5482f, 13.3758f)
                curveTo(3.4332f, 12.3257f, 3.1757f, 9.7729f, 3.1732f, 9.7479f)
                lineTo(2.6907f, 5.7386f)
                curveTo(2.6407f, 5.4198f, 2.6995f, 5.1461f, 2.8532f, 4.961f)
                curveTo(2.9782f, 4.811f, 3.1645f, 4.7273f, 3.392f, 4.7222f)
                horizontalLineTo(3.412f)
                curveTo(3.6357f, 4.7222f, 3.9532f, 4.8085f, 4.1119f, 5.5511f)
                lineTo(4.6169f, 7.9014f)
                curveTo(4.6582f, 8.0914f, 4.8294f, 8.2302f, 5.0231f, 8.2302f)
                curveTo(5.0356f, 8.2302f, 5.0469f, 8.2302f, 5.0594f, 8.2289f)
                curveTo(5.2844f, 8.2089f, 5.4519f, 8.0164f, 5.4394f, 7.7914f)
                curveTo(5.3906f, 6.9388f, 5.2331f, 4.1172f, 5.2331f, 3.6171f)
                curveTo(5.2331f, 2.7808f, 5.5844f, 2.6545f, 5.8893f, 2.6382f)
                curveTo(5.9043f, 2.637f, 5.9193f, 2.637f, 5.9343f, 2.637f)
                curveTo(6.5731f, 2.637f, 6.6605f, 3.4296f, 6.6718f, 3.5896f)
                curveTo(6.7093f, 4.1234f, 7.0243f, 7.8264f, 7.0268f, 7.8639f)
                curveTo(7.0393f, 8.0827f, 7.218f, 8.2589f, 7.433f, 8.2589f)
                horizontalLineTo(7.4542f)
                curveTo(7.6767f, 8.2477f, 7.8467f, 8.0614f, 7.8467f, 7.8351f)
                lineTo(7.9717f, 2.6457f)
                curveTo(7.9717f, 2.1757f, 8.2255f, 1.7031f, 8.7092f, 1.7031f)
                curveTo(8.7492f, 1.7031f, 8.7917f, 1.7069f, 8.8342f, 1.7131f)
                curveTo(9.2817f, 1.7819f, 9.4417f, 2.2557f, 9.4417f, 2.6758f)
                lineTo(9.5666f, 7.9127f)
                curveTo(9.5666f, 8.0727f, 9.6929f, 8.2052f, 9.8529f, 8.2102f)
                curveTo(10.0141f, 8.2102f, 10.1391f, 8.0939f, 10.1554f, 7.9389f)
                lineTo(10.7028f, 3.4721f)
                curveTo(10.7453f, 3.0383f, 10.9903f, 2.6007f, 11.4415f, 2.5907f)
                horizontalLineTo(11.4615f)
                curveTo(11.6765f, 2.5907f, 11.8528f, 2.6658f, 11.9865f, 2.812f)
                curveTo(12.159f, 3.002f, 12.239f, 3.2971f, 12.2078f, 3.6221f)
                curveTo(12.204f, 3.6746f, 11.8053f, 8.629f, 11.6828f, 9.9679f)
                curveTo(11.6715f, 10.0867f, 11.709f, 10.1992f, 11.789f, 10.2854f)
                curveTo(11.869f, 10.373f, 11.9815f, 10.423f, 12.099f, 10.423f)
                curveTo(12.1978f, 10.423f, 12.2915f, 10.388f, 12.3677f, 10.3217f)
                curveTo(12.579f, 10.1379f, 12.8152f, 9.8366f, 13.0427f, 9.5454f)
                curveTo(13.3164f, 9.1953f, 13.6577f, 8.759f, 13.8464f, 8.704f)
                curveTo(14.0702f, 8.639f, 14.2926f, 8.6065f, 14.5114f, 8.6065f)
                curveTo(14.8851f, 8.6065f, 15.1963f, 8.7052f, 15.3451f, 8.8703f)
                curveTo(15.4413f, 8.9765f, 15.4938f, 9.3141f, 15.4176f, 9.5904f)
                curveTo(15.3913f, 9.6841f, 15.3276f, 9.8491f, 15.1913f, 9.8929f)
                curveTo(14.3576f, 10.1542f, 13.1152f, 11.9006f, 12.6527f, 12.8058f)
                curveTo(12.5715f, 12.9658f, 12.5015f, 13.1546f, 12.4202f, 13.3721f)
                curveTo(11.984f, 14.536f, 11.3265f, 16.3037f, 7.7292f, 16.3037f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFEDA600)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.7081f, 1.8848f)
                curveTo(8.7394f, 1.8848f, 8.7706f, 1.8873f, 8.8043f, 1.8923f)
                curveTo(9.2318f, 1.9586f, 9.2531f, 2.5512f, 9.2531f, 2.6699f)
                verticalLineTo(2.6787f)
                lineTo(9.3781f, 7.9081f)
                curveTo(9.3806f, 8.1719f, 9.5856f, 8.3831f, 9.8493f, 8.3906f)
                horizontalLineTo(9.863f)
                curveTo(10.1093f, 8.3906f, 10.313f, 8.2044f, 10.3405f, 7.9556f)
                lineTo(10.888f, 3.4875f)
                curveTo(10.888f, 3.485f, 10.8892f, 3.4813f, 10.8892f, 3.4788f)
                curveTo(10.923f, 3.1325f, 11.108f, 2.7787f, 11.4455f, 2.7712f)
                horizontalLineTo(11.4617f)
                curveTo(11.6217f, 2.7712f, 11.7517f, 2.8249f, 11.8479f, 2.9312f)
                curveTo(11.9842f, 3.0825f, 12.0479f, 3.325f, 12.0217f, 3.5975f)
                verticalLineTo(3.6038f)
                curveTo(12.0179f, 3.6538f, 11.6192f, 8.6056f, 11.498f, 9.9446f)
                curveTo(11.483f, 10.1158f, 11.5367f, 10.2796f, 11.6517f, 10.4059f)
                curveTo(11.7667f, 10.5321f, 11.9304f, 10.6047f, 12.1004f, 10.6047f)
                curveTo(12.2429f, 10.6047f, 12.3829f, 10.5521f, 12.4917f, 10.4571f)
                curveTo(12.7166f, 10.2621f, 12.9479f, 9.9671f, 13.1904f, 9.6545f)
                curveTo(13.4016f, 9.3833f, 13.7566f, 8.9294f, 13.8991f, 8.8769f)
                curveTo(14.1028f, 8.8182f, 14.3141f, 8.7869f, 14.5115f, 8.7869f)
                curveTo(14.8903f, 8.7869f, 15.1215f, 8.8957f, 15.204f, 8.9869f)
                curveTo(15.249f, 9.0457f, 15.3053f, 9.3245f, 15.229f, 9.5608f)
                curveTo(15.2003f, 9.6508f, 15.1615f, 9.6983f, 15.1353f, 9.707f)
                curveTo(14.2091f, 9.9971f, 12.9329f, 11.8386f, 12.4867f, 12.7137f)
                curveTo(12.4004f, 12.8837f, 12.3242f, 13.0862f, 12.2454f, 13.3f)
                curveTo(12.0354f, 13.8638f, 11.7742f, 14.5664f, 11.148f, 15.1215f)
                curveTo(10.3955f, 15.7903f, 9.2781f, 16.1141f, 7.7319f, 16.1141f)
                curveTo(6.3432f, 16.1141f, 5.2833f, 15.764f, 4.5796f, 15.0727f)
                curveTo(3.9183f, 14.4226f, 3.7696f, 13.6538f, 3.7371f, 13.3537f)
                curveTo(3.6221f, 12.3049f, 3.3646f, 9.7521f, 3.3621f, 9.727f)
                curveTo(3.3621f, 9.7245f, 3.3621f, 9.722f, 3.3609f, 9.7195f)
                lineTo(2.8784f, 5.7128f)
                curveTo(2.8784f, 5.7078f, 2.8772f, 5.704f, 2.8772f, 5.699f)
                curveTo(2.8372f, 5.4453f, 2.8822f, 5.2177f, 2.9997f, 5.0765f)
                curveTo(3.0909f, 4.9665f, 3.2259f, 4.9089f, 3.3996f, 4.9052f)
                horizontalLineTo(3.4146f)
                curveTo(3.5259f, 4.9052f, 3.7859f, 4.9052f, 3.9321f, 5.5853f)
                lineTo(4.4371f, 7.9356f)
                curveTo(4.4958f, 8.2119f, 4.7446f, 8.4119f, 5.0271f, 8.4119f)
                curveTo(5.0445f, 8.4119f, 5.062f, 8.4106f, 5.0795f, 8.4094f)
                curveTo(5.407f, 8.3806f, 5.6483f, 8.1018f, 5.6295f, 7.7743f)
                curveTo(5.5308f, 6.0228f, 5.4245f, 4.0088f, 5.4245f, 3.61f)
                curveTo(5.4245f, 2.8437f, 5.7245f, 2.8274f, 5.9033f, 2.8174f)
                curveTo(5.9145f, 2.8162f, 5.927f, 2.8162f, 5.9383f, 2.8162f)
                curveTo(6.4107f, 2.8162f, 6.4795f, 3.4638f, 6.4882f, 3.5938f)
                curveTo(6.5257f, 4.1251f, 6.8257f, 7.6618f, 6.8432f, 7.8668f)
                curveTo(6.8644f, 8.1868f, 7.1244f, 8.4369f, 7.4369f, 8.4369f)
                curveTo(7.4469f, 8.4369f, 7.4569f, 8.4369f, 7.4719f, 8.4356f)
                curveTo(7.7869f, 8.4194f, 8.0344f, 8.1531f, 8.0369f, 7.8293f)
                lineTo(8.1619f, 2.6387f)
                verticalLineTo(2.6299f)
                curveTo(8.1619f, 2.4061f, 8.2231f, 2.2061f, 8.3331f, 2.0673f)
                curveTo(8.4281f, 1.9473f, 8.5556f, 1.8848f, 8.7081f, 1.8848f)
                close()
                moveTo(8.7081f, 1.5098f)
                curveTo(8.1469f, 1.5098f, 7.7832f, 2.0136f, 7.7832f, 2.6349f)
                lineTo(7.6582f, 7.8281f)
                curveTo(7.6582f, 7.9543f, 7.5657f, 8.0581f, 7.4482f, 8.0643f)
                horizontalLineTo(7.4444f)
                horizontalLineTo(7.4332f)
                curveTo(7.3169f, 8.0643f, 7.2207f, 7.9668f, 7.2132f, 7.8418f)
                curveTo(7.2132f, 7.8418f, 6.8957f, 4.1088f, 6.8582f, 3.5713f)
                curveTo(6.8219f, 3.0475f, 6.5582f, 2.4449f, 5.9345f, 2.4449f)
                curveTo(5.917f, 2.4449f, 5.8983f, 2.4449f, 5.8795f, 2.4461f)
                curveTo(5.2158f, 2.4824f, 5.0458f, 3.0112f, 5.0458f, 3.6125f)
                curveTo(5.0458f, 4.1263f, 5.2058f, 6.9767f, 5.252f, 7.798f)
                curveTo(5.2595f, 7.9218f, 5.167f, 8.0281f, 5.0433f, 8.0381f)
                curveTo(5.037f, 8.0381f, 5.0296f, 8.0393f, 5.0233f, 8.0393f)
                curveTo(4.917f, 8.0393f, 4.8233f, 7.9643f, 4.7996f, 7.8593f)
                lineTo(4.2946f, 5.509f)
                curveTo(4.1721f, 4.9352f, 3.9183f, 4.5326f, 3.4109f, 4.5326f)
                horizontalLineTo(3.3859f)
                curveTo(2.7322f, 4.5489f, 2.3984f, 5.0927f, 2.5034f, 5.759f)
                lineTo(2.9859f, 9.7658f)
                curveTo(2.9859f, 9.7658f, 3.2446f, 12.3336f, 3.3609f, 13.3963f)
                curveTo(3.4771f, 14.4589f, 4.3283f, 16.4904f, 7.7282f, 16.4904f)
                curveTo(12.1154f, 16.4904f, 12.3079f, 13.8826f, 12.8166f, 12.8849f)
                curveTo(13.2904f, 11.9561f, 14.5115f, 10.2959f, 15.244f, 10.0658f)
                curveTo(15.7177f, 9.9171f, 15.7202f, 9.0057f, 15.4802f, 8.7394f)
                curveTo(15.294f, 8.5331f, 14.934f, 8.4131f, 14.5078f, 8.4131f)
                curveTo(14.2828f, 8.4131f, 14.0378f, 8.4469f, 13.7916f, 8.5181f)
                curveTo(13.3729f, 8.6394f, 12.7266f, 9.7558f, 12.2429f, 10.1746f)
                curveTo(12.1979f, 10.2134f, 12.1467f, 10.2309f, 12.0967f, 10.2309f)
                curveTo(11.9717f, 10.2309f, 11.8542f, 10.1258f, 11.8679f, 9.9808f)
                curveTo(11.9917f, 8.6244f, 12.3929f, 3.6363f, 12.3929f, 3.6363f)
                curveTo(12.4579f, 2.9725f, 12.1067f, 2.3986f, 11.4605f, 2.3986f)
                horizontalLineTo(11.4355f)
                curveTo(10.9105f, 2.4099f, 10.5705f, 2.8837f, 10.5143f, 3.445f)
                lineTo(9.9668f, 7.9168f)
                curveTo(9.9605f, 7.9756f, 9.9155f, 8.0193f, 9.8618f, 8.0193f)
                horizontalLineTo(9.8593f)
                horizontalLineTo(9.8568f)
                curveTo(9.7993f, 8.0181f, 9.753f, 7.9668f, 9.753f, 7.9056f)
                lineTo(9.6281f, 2.6724f)
                curveTo(9.6281f, 2.1086f, 9.3806f, 1.6048f, 8.8618f, 1.5248f)
                curveTo(8.8094f, 1.5135f, 8.7581f, 1.5098f, 8.7081f, 1.5098f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFEDA600)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.2662f, 9.6797f)
                curveTo(10.5251f, 9.9284f, 9.4389f, 11.5021f, 8.9464f, 13.1858f)
                curveTo(8.8789f, 13.4182f, 9.1076f, 13.4907f, 9.1751f, 13.2582f)
                curveTo(9.6351f, 11.6896f, 10.9688f, 10.5534f, 12.5825f, 10.3234f)
                curveTo(12.8199f, 10.2897f, 12.7187f, 9.9284f, 12.4825f, 9.9622f)
                lineTo(12.2662f, 9.6797f)
                close()
            }
        }.build()
        return _handUp!!
    }
