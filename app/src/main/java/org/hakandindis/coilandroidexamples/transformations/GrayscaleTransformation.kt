package org.hakandindis.coilandroidexamples.transformations

import android.graphics.Bitmap
import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.graphics.Paint
import androidx.core.graphics.applyCanvas
import androidx.core.graphics.createBitmap
import coil.size.Size
import coil.transform.Transformation

/**
 * CREATED BY HAKAN DINDIŞ on 6.11.2023
 */
class GrayscaleTransformation() : Transformation {

    override val cacheKey: String = GrayscaleTransformation::class.java.name

    override suspend fun transform(input: Bitmap, size: Size): Bitmap {
        val paint = Paint(Paint.ANTI_ALIAS_FLAG or Paint.FILTER_BITMAP_FLAG)
        paint.colorFilter = COLOR_FILTER

        val output = createBitmap(input.width, input.height, input.config)
        output.applyCanvas {
            drawBitmap(input, 0f, 0f, paint)
        }

        return output
    }

    override fun equals(other: Any?) = other is GrayscaleTransformation
    override fun hashCode() = javaClass.hashCode()
    override fun toString() = "GrayscaleTransformation()"
    private companion object {
        val COLOR_FILTER = ColorMatrixColorFilter(ColorMatrix().apply { setSaturation(0f) })
    }
}