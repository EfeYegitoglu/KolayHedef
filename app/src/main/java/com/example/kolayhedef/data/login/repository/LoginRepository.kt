package com.example.kolayhedef.data.login.repository

import com.example.kolayhedef.base.DataResult
import java.util.concurrent.Flow

interface LoginRepository {
    suspend fun login()
    fun logout(): Boolean
}