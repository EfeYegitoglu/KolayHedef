package com.example.kolayhedef.ui.splash

import android.view.LayoutInflater
import androidx.fragment.app.viewModels
import com.example.kolayhedef.R
import com.example.kolayhedef.base.BaseFragment
import com.example.kolayhedef.databinding.FragmentSplashBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.*

@AndroidEntryPoint
class SplashFragment : BaseFragment<FragmentSplashBinding, SplashViewModel>() {
    override fun layoutInflater(inflater: LayoutInflater): FragmentSplashBinding =
        FragmentSplashBinding.inflate(inflater)

    override val viewModel: SplashViewModel by viewModels()

    override fun initViews() {
        CoroutineScope(Dispatchers.Main).launch {
            delay(2000)
            navigateSafely(R.id.splashFragment,SplashFragmentDirections.actionSplashFragmentToLoginFragment())
        }
    }

    override fun initObservers() {

    }
}