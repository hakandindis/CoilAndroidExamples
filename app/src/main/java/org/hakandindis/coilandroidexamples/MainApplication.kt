package org.hakandindis.coilandroidexamples

import android.app.Application
import coil.ImageLoader
import coil.ImageLoaderFactory
import org.hakandindis.coilandroidexamples.interceptor.CoilLoggingInterceptor

/**
 * CREATED BY HAKAN DINDIŞ on 5.11.2023
 */
class MainApplication : Application(), ImageLoaderFactory {
    override fun newImageLoader(): ImageLoader {
        return ImageLoader.Builder(this.applicationContext)
            .crossfade(true)
            .components {
                add(CoilLoggingInterceptor())
            }
            .build()
    }
}