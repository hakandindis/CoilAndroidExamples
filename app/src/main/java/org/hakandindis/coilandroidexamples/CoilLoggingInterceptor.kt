package org.hakandindis.coilandroidexamples

import android.util.Log
import coil.intercept.Interceptor
import coil.request.ImageResult

/**
 * CREATED BY HAKAN DINDIŞ on 5.11.2023
 */
class CoilLoggingInterceptor : Interceptor {
    companion object {
        val TAG: String = CoilLoggingInterceptor::class.java.simpleName
    }

    override suspend fun intercept(chain: Interceptor.Chain): ImageResult {
        val logModel = CoilLogModel(
            url = chain.request.data.toString(),
            width = chain.size.width.toString(),
            height = chain.size.height.toString()
        )
        Log.d(TAG, logModel.toString())
        return chain.proceed(chain.request)
    }

    data class CoilLogModel(
        val url: String,
        val width: String,
        val height: String
    ) {
        override fun toString(): String {
            return """
                URL: $url
                width: $width
                height: $height
            """.trimIndent()
        }
    }
}