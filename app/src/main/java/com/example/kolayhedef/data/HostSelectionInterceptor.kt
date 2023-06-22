package com.example.kolayhedef.data

import okhttp3.HttpUrl
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class HostSelectionInterceptor : Interceptor {
    @Volatile
    var host: String? = null

    @Volatile
    var lang: String = "tr"
    override fun intercept(chain: Interceptor.Chain): Response {
        var request: Request = chain.request()
        val host = host
        if (host != null) {
            val newUrl: HttpUrl = request.url.newBuilder()
                .scheme("https")
                .host(host)
                .build()
            request = request.newBuilder()
                .url(newUrl)
                .header("Accept-Language", lang)
                .build()
        }
        return chain.proceed(request)
    }
}