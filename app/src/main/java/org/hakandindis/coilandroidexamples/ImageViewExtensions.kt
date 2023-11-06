package org.hakandindis.coilandroidexamples

import android.graphics.RenderEffect
import android.graphics.Shader
import android.os.Build
import android.widget.ImageView
import coil.load
import coil.transform.CircleCropTransformation
import coil.transform.RoundedCornersTransformation
import org.hakandindis.coilandroidexamples.transformations.GrayscaleTransformation

/**
 * CREATED BY HAKAN DINDIŞ on 1.11.2023
 */

fun ImageView.loadCircularImage(url: String) = this.load(url) {
    transformations(CircleCropTransformation())
}

fun ImageView.loadRoundedImage(url: String) = this.load(url) {
    transformations(RoundedCornersTransformation(30f, 30f, 30f, 30f))
}

fun ImageView.loadBlurredImage(url: String) = this.load(url) {
    listener(
        onSuccess = { _, _ ->
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                setRenderEffect(RenderEffect.createBlurEffect(10f, 10f, Shader.TileMode.MIRROR))
            }
        }
    )
}

fun ImageView.loadGrayscaleImage(url: String) = this.load(url) {
    transformations(GrayscaleTransformation())
}