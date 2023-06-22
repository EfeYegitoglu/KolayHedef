package com.example.kolayhedef.base

data class WrappedResponse<T>(val success: Boolean, val data: T, val error: ErrorModel)