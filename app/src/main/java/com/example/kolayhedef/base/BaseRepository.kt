package com.example.kolayhedef.base

import retrofit2.Response

abstract class BaseRepository {
    suspend fun <T> apiCall(call: suspend () -> Response<WrappedResponse<T>>): DataResult<T> {
        val response = call.invoke()
        if(response.isSuccessful){
            val body = response.body()
            if(body?.success == true){
                return DataResult.Success(body.data)
            } else {
                body?.error?.let {
                    return DataResult.Error(it)
                }
                return DataResult.Error(ErrorModel(-1, "Unknown Server Error"))
            }
        } else {
            return DataResult.Error(ErrorModel(-9999, "Unknown Error"))
        }
    }
}