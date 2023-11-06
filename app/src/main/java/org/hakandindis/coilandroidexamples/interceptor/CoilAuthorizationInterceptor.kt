package org.hakandindis.coilandroidexamples.interceptor

import coil.intercept.Interceptor
import coil.request.ImageResult

/**
 * CREATED BY HAKAN DINDIŞ on 6.11.2023
 */
class CoilAuthorizationInterceptor : Interceptor{
    override suspend fun intercept(chain: Interceptor.Chain): ImageResult {
        TODO("Not yet implemented")
    }
}