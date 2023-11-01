package org.hakandindis.coilandroidexamples

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.load

/**
 * CREATED BY HAKAN DINDIŞ on 1.11.2023
 */

@BindingAdapter("load_image")
fun loadImage(view: ImageView, url: String) {
    view.load(url)
}

@BindingAdapter("load_circular_image")
fun loadCircularImage(view: ImageView, url: String) {
    view.loadCircularImage(url)
}

@BindingAdapter("load_rounded_image")
fun loadRoundedImage(view: ImageView, url: String) {
    view.loadRoundedImage(url)
}

@BindingAdapter("load_blurred_image")
fun loadBlurredImage(view: ImageView, url: String) {
    view.loadBlurredImage(url)
}

