package com.example.kolayhedef.local

interface LocalTokenSource {
    fun saveUserAccessToken(token: String?)
    fun getUserAccessToken(): String?
    fun deleteUserAccessToken(): Boolean
}