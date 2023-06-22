package com.example.kolayhedef.ui.splash

import androidx.lifecycle.ViewModel
import com.example.kolayhedef.base.BaseViewModel
import com.example.kolayhedef.local.LocalTokenSource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(private val localTokenSource: LocalTokenSource) :
    BaseViewModel() {

    fun getUserAccess(): String? {
        return localTokenSource.getUserAccessToken()
    }

}