package com.example.kolayhedef.data.login.repository

import com.example.kolayhedef.data.login.remote.LoginService
import com.example.kolayhedef.local.LocalTokenSource
import javax.inject.Inject

class LoginRepositoryImpl @Inject constructor(
    private val loginService: LoginService,
    private val localTokenSource: LocalTokenSource
) {
}