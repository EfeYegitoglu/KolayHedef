package com.example.kolayhedef.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineExceptionHandler

abstract class BaseViewModel : ViewModel() {

    private val _loadingLiveData = MutableLiveData<Boolean>()
    val loadingLiveData: LiveData<Boolean>
        get() = _loadingLiveData

    private val _errorLiveData = MutableLiveData<ErrorModel>()
    val errorLiveData: LiveData<ErrorModel>
        get() = _errorLiveData

    private val _fatalErrorLiveData = MutableLiveData<Boolean>()
    val fatalErrorLiveData: LiveData<Boolean>
        get() = _fatalErrorLiveData

    val coroutineExceptionHandler = CoroutineExceptionHandler { _, throwable ->
        // TODO: Call log service here.
        // FirebaseCrashlytics.getInstance().recordException(throwable)
        showFatalError()
        //throw(throwable)
    }

    protected fun showLoading(show: Boolean) {
        _loadingLiveData.value = show
    }

    protected fun showErrorDialog(error: ErrorModel?) {
        error?.let {
            _errorLiveData.value = it
        }
    }

    private fun showFatalError() {
        _fatalErrorLiveData.value = true
    }
}