@file:Suppress("unused", "ObjectPropertyName")

package ru.tech.imageresizershrinker.theme

import androidx.compose.material.icons.Icons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Icons.Rounded.Github: ImageVector
    get() {
        if (_github != null) {
            return _github!!
        }
        _github = Builder(
            name = "Github", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 2.0f)
                arcTo(
                    10.0f, 10.0f, 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 2.0f,
                    y1 = 12.0f
                )
                curveTo(2.0f, 16.42f, 4.87f, 20.17f, 8.84f, 21.5f)
                curveTo(9.34f, 21.58f, 9.5f, 21.27f, 9.5f, 21.0f)
                curveTo(9.5f, 20.77f, 9.5f, 20.14f, 9.5f, 19.31f)
                curveTo(6.73f, 19.91f, 6.14f, 17.97f, 6.14f, 17.97f)
                curveTo(5.68f, 16.81f, 5.03f, 16.5f, 5.03f, 16.5f)
                curveTo(4.12f, 15.88f, 5.1f, 15.9f, 5.1f, 15.9f)
                curveTo(6.1f, 15.97f, 6.63f, 16.93f, 6.63f, 16.93f)
                curveTo(7.5f, 18.45f, 8.97f, 18.0f, 9.54f, 17.76f)
                curveTo(9.63f, 17.11f, 9.89f, 16.67f, 10.17f, 16.42f)
                curveTo(7.95f, 16.17f, 5.62f, 15.31f, 5.62f, 11.5f)
                curveTo(5.62f, 10.39f, 6.0f, 9.5f, 6.65f, 8.79f)
                curveTo(6.55f, 8.54f, 6.2f, 7.5f, 6.75f, 6.15f)
                curveTo(6.75f, 6.15f, 7.59f, 5.88f, 9.5f, 7.17f)
                curveTo(10.29f, 6.95f, 11.15f, 6.84f, 12.0f, 6.84f)
                curveTo(12.85f, 6.84f, 13.71f, 6.95f, 14.5f, 7.17f)
                curveTo(16.41f, 5.88f, 17.25f, 6.15f, 17.25f, 6.15f)
                curveTo(17.8f, 7.5f, 17.45f, 8.54f, 17.35f, 8.79f)
                curveTo(18.0f, 9.5f, 18.38f, 10.39f, 18.38f, 11.5f)
                curveTo(18.38f, 15.32f, 16.04f, 16.16f, 13.81f, 16.41f)
                curveTo(14.17f, 16.72f, 14.5f, 17.33f, 14.5f, 18.26f)
                curveTo(14.5f, 19.6f, 14.5f, 20.68f, 14.5f, 21.0f)
                curveTo(14.5f, 21.27f, 14.66f, 21.59f, 15.17f, 21.5f)
                curveTo(19.14f, 20.16f, 22.0f, 16.42f, 22.0f, 12.0f)
                arcTo(
                    10.0f, 10.0f, 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 2.0f
                )
                close()
            }
        }
            .build()
        return _github!!
    }

private var _github: ImageVector? = null

val Icons.Rounded.Telegram: ImageVector
    get() {
        if (_telegram != null) {
            return _telegram!!
        }
        _telegram = Builder(
            name = "Telegram", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.944f, 0.0f)
                arcTo(
                    12.0f, 12.0f, 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 0.0f,
                    y1 = 12.0f
                )
                arcToRelative(
                    12.0f, 12.0f, 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 12.0f,
                    dy1 = 12.0f
                )
                arcToRelative(
                    12.0f, 12.0f, 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 12.0f,
                    dy1 = -12.0f
                )
                arcTo(
                    12.0f, 12.0f, 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 0.0f
                )
                arcToRelative(
                    12.0f, 12.0f, 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.056f,
                    dy1 = 0.0f
                )
                close()
                moveTo(16.906f, 7.224f)
                curveToRelative(0.1f, -0.002f, 0.321f, 0.023f, 0.465f, 0.14f)
                arcToRelative(
                    0.506f, 0.506f, 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.171f,
                    dy1 = 0.325f
                )
                curveToRelative(0.016f, 0.093f, 0.036f, 0.306f, 0.02f, 0.472f)
                curveToRelative(-0.18f, 1.898f, -0.962f, 6.502f, -1.36f, 8.627f)
                curveToRelative(-0.168f, 0.9f, -0.499f, 1.201f, -0.82f, 1.23f)
                curveToRelative(-0.696f, 0.065f, -1.225f, -0.46f, -1.9f, -0.902f)
                curveToRelative(-1.056f, -0.693f, -1.653f, -1.124f, -2.678f, -1.8f)
                curveToRelative(-1.185f, -0.78f, -0.417f, -1.21f, 0.258f, -1.91f)
                curveToRelative(0.177f, -0.184f, 3.247f, -2.977f, 3.307f, -3.23f)
                curveToRelative(0.007f, -0.032f, 0.014f, -0.15f, -0.056f, -0.212f)
                reflectiveCurveToRelative(-0.174f, -0.041f, -0.249f, -0.024f)
                curveToRelative(-0.106f, 0.024f, -1.793f, 1.14f, -5.061f, 3.345f)
                curveToRelative(-0.48f, 0.33f, -0.913f, 0.49f, -1.302f, 0.48f)
                curveToRelative(-0.428f, -0.008f, -1.252f, -0.241f, -1.865f, -0.44f)
                curveToRelative(-0.752f, -0.245f, -1.349f, -0.374f, -1.297f, -0.789f)
                curveToRelative(0.027f, -0.216f, 0.325f, -0.437f, 0.893f, -0.663f)
                curveToRelative(3.498f, -1.524f, 5.83f, -2.529f, 6.998f, -3.014f)
                curveToRelative(3.332f, -1.386f, 4.025f, -1.627f, 4.476f, -1.635f)
                close()
            }
        }
            .build()
        return _telegram!!
    }

private var _telegram: ImageVector? = null


val Icons.Rounded.PaletteSwatch: ImageVector
    get() {
        if (_paletteSwatch != null) {
            return _paletteSwatch!!
        }
        _paletteSwatch = Builder(
            name = "Palette-swatch", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.53f, 19.65f)
                lineTo(3.87f, 20.21f)
                verticalLineTo(11.18f)
                lineTo(1.44f, 17.04f)
                curveTo(1.03f, 18.06f, 1.5f, 19.23f, 2.53f, 19.65f)
                moveTo(22.03f, 15.95f)
                lineTo(17.07f, 4.0f)
                curveTo(16.76f, 3.23f, 16.03f, 2.77f, 15.26f, 2.75f)
                curveTo(15.0f, 2.75f, 14.73f, 2.79f, 14.47f, 2.9f)
                lineTo(7.1f, 5.95f)
                curveTo(6.35f, 6.26f, 5.89f, 7.0f, 5.87f, 7.75f)
                curveTo(5.86f, 8.0f, 5.91f, 8.29f, 6.0f, 8.55f)
                lineTo(11.0f, 20.5f)
                curveTo(11.29f, 21.28f, 12.03f, 21.74f, 12.81f, 21.75f)
                curveTo(13.07f, 21.75f, 13.33f, 21.7f, 13.58f, 21.6f)
                lineTo(20.94f, 18.55f)
                curveTo(21.96f, 18.13f, 22.45f, 16.96f, 22.03f, 15.95f)
                moveTo(7.88f, 8.75f)
                arcTo(
                    1.0f, 1.0f, 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 6.88f,
                    y1 = 7.75f
                )
                arcTo(
                    1.0f, 1.0f, 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 7.88f,
                    y1 = 6.75f
                )
                curveTo(8.43f, 6.75f, 8.88f, 7.2f, 8.88f, 7.75f)
                curveTo(8.88f, 8.3f, 8.43f, 8.75f, 7.88f, 8.75f)
                moveTo(5.88f, 19.75f)
                arcTo(
                    2.0f, 2.0f, 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 7.88f,
                    y1 = 21.75f
                )
                horizontalLineTo(9.33f)
                lineTo(5.88f, 13.41f)
                verticalLineTo(19.75f)
                close()
            }
        }
            .build()
        return _paletteSwatch!!
    }

private var _paletteSwatch: ImageVector? = null

val Icons.Rounded.CreateAlt: ImageVector
    get() {
        if (_createAlt != null) {
            return _createAlt!!
        }
        _createAlt = Builder(
            name = "CreateAlt", defaultWidth = 18.2.dp, defaultHeight = 18.2.dp,
            viewportWidth = 18.2f, viewportHeight = 18.2f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0f, 16.2f)
                horizontalLineToRelative(1.4f)
                lineToRelative(10.0f, -10.0f)
                lineToRelative(-0.7f, -0.7f)
                lineToRelative(-0.8f, -0.7f)
                lineTo(2.0f, 14.9f)
                verticalLineTo(16.2f)
                close()
                moveTo(0.0f, 18.2f)
                verticalLineTo(14.0f)
                lineTo(13.4f, 0.6f)
                curveTo(13.7f, 0.2f, 14.2f, 0.0f, 14.8f, 0.0f)
                curveToRelative(0.6f, 0.0f, 1.0f, 0.2f, 1.4f, 0.6f)
                lineTo(17.6f, 2.0f)
                curveToRelative(0.4f, 0.4f, 0.6f, 0.8f, 0.6f, 1.4f)
                reflectiveCurveToRelative(-0.2f, 1.0f, -0.6f, 1.4f)
                lineTo(4.2f, 18.2f)
                horizontalLineTo(0.0f)
                close()
                moveTo(16.1f, 3.4f)
                lineTo(14.8f, 2.0f)
                lineTo(16.1f, 3.4f)
                close()
                moveTo(13.4f, 6.2f)
                lineToRelative(-0.7f, -0.7f)
                lineToRelative(-0.8f, -0.7f)
                lineTo(13.4f, 6.2f)
                close()
            }
        }.build()
        return _createAlt!!
    }

private var _createAlt: ImageVector? = null

val Icons.Rounded.Sparkles: ImageVector
    get() {
        if (_sparkles != null) {
            return _sparkles!!
        }
        _sparkles = Builder(
            name = "Sparkles", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
            viewportWidth = 128.0f, viewportHeight = 128.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFfdd835)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveToRelative(121.59f, 60.83f)
                lineToRelative(-13.93f, -4.49f)
                curveToRelative(-8.91f, -2.94f, -14.13f, -10.15f, -16.58f, -19.21f)
                lineToRelative(-6.13f, -29.86f)
                curveToRelative(-0.16f, -0.59f, -0.55f, -1.38f, -1.75f, -1.38f)
                curveToRelative(-1.01f, 0.0f, -1.59f, 0.79f, -1.75f, 1.38f)
                lineToRelative(-6.13f, 29.87f)
                curveToRelative(-2.46f, 9.06f, -7.67f, 16.27f, -16.58f, 19.21f)
                lineToRelative(-13.93f, 4.49f)
                curveToRelative(-1.97f, 0.64f, -2.0f, 3.42f, -0.04f, 4.09f)
                lineToRelative(14.03f, 4.83f)
                curveToRelative(8.88f, 2.95f, 14.06f, 10.15f, 16.52f, 19.17f)
                lineToRelative(6.14f, 29.53f)
                curveToRelative(0.16f, 0.59f, 0.49f, 1.65f, 1.75f, 1.65f)
                curveToRelative(1.33f, 0.0f, 1.59f, -1.06f, 1.75f, -1.65f)
                lineToRelative(6.14f, -29.53f)
                curveToRelative(2.46f, -9.03f, 7.64f, -16.23f, 16.52f, -19.17f)
                lineToRelative(14.03f, -4.83f)
                curveToRelative(1.94f, -0.68f, 1.91f, -3.46f, -0.06f, -4.1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFffee58)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveToRelative(122.91f, 62.08f)
                curveToRelative(-0.22f, -0.55f, -0.65f, -1.03f, -1.32f, -1.25f)
                lineToRelative(-13.93f, -4.49f)
                curveToRelative(-8.91f, -2.94f, -14.13f, -10.15f, -16.58f, -19.21f)
                lineToRelative(-6.13f, -29.86f)
                curveToRelative(-0.09f, -0.34f, -0.41f, -0.96f, -0.78f, -1.14f)
                lineToRelative(1.98f, 29.97f)
                curveToRelative(1.47f, 13.68f, 2.73f, 20.12f, 13.65f, 22.0f)
                curveToRelative(9.38f, 1.62f, 20.23f, 3.48f, 23.11f, 3.98f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFf4b400)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveToRelative(122.94f, 63.64f)
                lineToRelative(-24.16f, 5.54f)
                curveToRelative(-8.51f, 2.16f, -13.2f, 7.09f, -13.2f, 19.99f)
                lineToRelative(-2.37f, 30.94f)
                curveToRelative(0.81f, -0.08f, 1.47f, -0.52f, 1.75f, -1.65f)
                lineToRelative(6.14f, -29.53f)
                curveToRelative(2.46f, -9.03f, 7.64f, -16.23f, 16.52f, -19.17f)
                lineToRelative(14.03f, -4.83f)
                curveToRelative(0.66f, -0.24f, 1.08f, -0.73f, 1.29f, -1.29f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFfdd835)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveToRelative(41.81f, 86.81f)
                curveToRelative(-8.33f, -2.75f, -9.09f, -5.85f, -10.49f, -11.08f)
                lineToRelative(-3.49f, -12.24f)
                curveToRelative(-0.21f, -0.79f, -2.27f, -0.79f, -2.49f, 0.0f)
                lineToRelative(-2.37f, 11.31f)
                curveToRelative(-1.41f, 5.21f, -4.41f, 9.35f, -9.53f, 11.04f)
                lineToRelative(-8.16f, 3.54f)
                curveToRelative(-1.13f, 0.37f, -1.15f, 1.97f, -0.02f, 2.35f)
                lineToRelative(8.22f, 2.91f)
                curveToRelative(5.1f, 1.69f, 8.08f, 5.83f, 9.5f, 11.02f)
                lineToRelative(2.37f, 10.82f)
                curveToRelative(0.22f, 0.79f, 2.27f, 0.79f, 2.48f, 0.0f)
                lineToRelative(2.78f, -10.77f)
                curveToRelative(1.41f, -5.22f, 3.57f, -9.37f, 10.5f, -11.07f)
                lineToRelative(7.72f, -2.91f)
                curveToRelative(1.13f, -0.39f, 1.12f, -1.99f, -0.02f, -2.36f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFffee58)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveToRelative(28.49f, 75.55f)
                curveToRelative(0.85f, 7.86f, 1.28f, 10.04f, 7.65f, 11.67f)
                lineToRelative(13.27f, 2.59f)
                curveToRelative(-0.14f, -0.19f, -0.34f, -0.35f, -0.61f, -0.43f)
                lineToRelative(-7.0f, -2.57f)
                curveToRelative(-7.31f, -2.5f, -9.33f, -5.68f, -10.7f, -12.04f)
                reflectiveCurveToRelative(-2.83f, -10.51f, -2.83f, -10.51f)
                curveToRelative(-0.51f, -1.37f, -1.24f, -1.3f, -1.24f, -1.3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFf4b400)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveToRelative(28.73f, 102.99f)
                curveToRelative(0.0f, -7.41f, 4.05f, -11.08f, 10.49f, -11.08f)
                lineToRelative(10.02f, -0.41f)
                reflectiveCurveToRelative(-0.58f, 0.77f, -1.59f, 1.01f)
                lineToRelative(-6.54f, 2.13f)
                curveToRelative(-5.55f, 2.23f, -8.08f, 3.35f, -9.8f, 10.94f)
                curveToRelative(0.0f, 0.0f, -2.22f, 8.83f, -2.64f, 9.76f)
                curveToRelative(-0.58f, 1.3f, -1.27f, 1.57f, -1.27f, 1.57f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFf4b400)), stroke = SolidColor(Color(0xFFf4b400)),
                strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveToRelative(59.74f, 28.14f)
                curveToRelative(0.56f, -0.19f, 0.54f, -0.99f, -0.03f, -1.15f)
                lineToRelative(-7.72f, -2.08f)
                curveToRelative(-1.62f, -0.44f, -2.88f, -1.69f, -3.34f, -3.3f)
                lineToRelative(-3.04f, -12.55f)
                curveToRelative(-0.15f, -0.61f, -1.02f, -0.61f, -1.17f, 0.01f)
                lineToRelative(-2.86f, 12.5f)
                curveToRelative(-0.44f, 1.66f, -1.74f, 2.94f, -3.4f, 3.37f)
                lineToRelative(-7.67f, 1.99f)
                curveToRelative(-0.57f, 0.15f, -0.61f, 0.95f, -0.05f, 1.15f)
                lineToRelative(8.09f, 2.8f)
                curveToRelative(1.45f, 0.5f, 2.57f, 1.68f, 3.01f, 3.15f)
                lineToRelative(2.89f, 11.59f)
                curveToRelative(0.15f, 0.6f, 1.01f, 0.61f, 1.16f, 0.0f)
                lineToRelative(2.99f, -11.63f)
                curveToRelative(0.45f, -1.47f, 1.58f, -2.64f, 3.04f, -3.13f)
                close()
            }
        }
            .build()
        return _sparkles!!
    }

private var _sparkles: ImageVector? = null


val Icons.Rounded.GooglePlay: ImageVector
    get() {
        if (_googlePlay != null) {
            return _googlePlay!!
        }
        _googlePlay = Builder(
            name = "Google-play", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.0f, 20.5f)
                verticalLineTo(3.5f)
                curveTo(3.0f, 2.91f, 3.34f, 2.39f, 3.84f, 2.15f)
                lineTo(13.69f, 12.0f)
                lineTo(3.84f, 21.85f)
                curveTo(3.34f, 21.6f, 3.0f, 21.09f, 3.0f, 20.5f)
                moveTo(16.81f, 15.12f)
                lineTo(6.05f, 21.34f)
                lineTo(14.54f, 12.85f)
                lineTo(16.81f, 15.12f)
                moveTo(20.16f, 10.81f)
                curveTo(20.5f, 11.08f, 20.75f, 11.5f, 20.75f, 12.0f)
                curveTo(20.75f, 12.5f, 20.53f, 12.9f, 20.18f, 13.18f)
                lineTo(17.89f, 14.5f)
                lineTo(15.39f, 12.0f)
                lineTo(17.89f, 9.5f)
                lineTo(20.16f, 10.81f)
                moveTo(6.05f, 2.66f)
                lineTo(16.81f, 8.88f)
                lineTo(14.54f, 11.15f)
                lineTo(6.05f, 2.66f)
                close()
            }
        }
            .build()
        return _googlePlay!!
    }

private var _googlePlay: ImageVector? = null

val Icons.Rounded.Lamp: ImageVector
    get() {
        if (_lamp != null) {
            return _lamp!!
        }
        _lamp = Builder(
            name = "Lightbulb-night", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.0f, 21.0f)
                curveTo(6.0f, 21.55f, 6.45f, 22.0f, 7.0f, 22.0f)
                horizontalLineTo(11.0f)
                curveTo(11.55f, 22.0f, 12.0f, 21.55f, 12.0f, 21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(21.0f)
                moveTo(13.0f, 16.32f)
                verticalLineTo(17.0f)
                curveTo(13.0f, 17.55f, 12.55f, 18.0f, 12.0f, 18.0f)
                horizontalLineTo(6.0f)
                curveTo(5.45f, 18.0f, 5.0f, 17.55f, 5.0f, 17.0f)
                verticalLineTo(14.74f)
                curveTo(3.19f, 13.47f, 2.0f, 11.38f, 2.0f, 9.0f)
                curveTo(2.0f, 5.13f, 5.13f, 2.0f, 9.0f, 2.0f)
                curveTo(10.65f, 2.0f, 12.16f, 2.57f, 13.35f, 3.5f)
                curveTo(10.8f, 4.57f, 9.0f, 7.07f, 9.0f, 10.0f)
                curveTo(9.0f, 12.79f, 10.64f, 15.19f, 13.0f, 16.32f)
                moveTo(20.92f, 9.94f)
                lineTo(19.5f, 9.03f)
                lineTo(18.1f, 10.0f)
                lineTo(18.5f, 8.35f)
                lineTo(17.17f, 7.32f)
                lineTo(18.85f, 7.21f)
                lineTo(19.41f, 5.6f)
                lineTo(20.04f, 7.18f)
                lineTo(21.72f, 7.22f)
                lineTo(20.42f, 8.3f)
                lineTo(20.92f, 9.94f)
                moveTo(19.39f, 13.0f)
                curveTo(17.5f, 15.27f, 14.03f, 15.19f, 12.22f, 12.95f)
                curveTo(10.0f, 10.13f, 11.56f, 6.0f, 15.0f, 5.34f)
                curveTo(15.34f, 5.29f, 15.64f, 5.63f, 15.5f, 5.97f)
                curveTo(15.05f, 7.25f, 15.12f, 8.71f, 15.85f, 9.97f)
                curveTo(16.58f, 11.24f, 17.79f, 12.03f, 19.12f, 12.25f)
                curveTo(19.47f, 12.3f, 19.62f, 12.74f, 19.39f, 13.0f)
                close()
            }
        }
            .build()
        return _lamp!!
    }

private var _lamp: ImageVector? = null