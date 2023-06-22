package com.example.kolayhedef.base

sealed class DataResult<T> {
    data class Success<T>(val data: T) : DataResult<T>()
    data class Error<T>(val error: ErrorModel?) : DataResult<T>()
    data class Loading<T>(val show: Boolean) : DataResult<T>()
}