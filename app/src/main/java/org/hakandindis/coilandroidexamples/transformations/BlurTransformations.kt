package org.hakandindis.coilandroidexamples.transformations

import android.graphics.Bitmap
import coil.size.Size
import coil.transform.Transformation

/**
 * CREATED BY HAKAN DINDIŞ on 2.11.2023
 */
class BlurTransformations(
    private val blurPercentage: Float
) : Transformation {
    override val cacheKey: String = "${BlurTransformations::class.java}-$blurPercentage"
    override suspend fun transform(input: Bitmap, size: Size): Bitmap {
        TODO()
    }

    override fun equals(other: Any?) = other is BlurTransformations
    override fun hashCode() = javaClass.hashCode()
}