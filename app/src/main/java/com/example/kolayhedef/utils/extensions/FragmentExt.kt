package com.example.kolayhedef.utils.extensions

import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController

fun Fragment.findNavControllerSafely(id: Int): NavController? {
    return if (findNavController().currentDestination?.id == id) {
        findNavController()
    } else {
        null
    }
}

fun Fragment.getNavigationResult(key: String = "result") =
    findNavController().currentBackStackEntry?.savedStateHandle?.getLiveData<String>(key)

fun Fragment.setNavigationResult(result: String, key: String = "result") {
    lifecycleScope.launchWhenResumed {
        findNavController().previousBackStackEntry?.savedStateHandle?.set(key, result)
    }
}