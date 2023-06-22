package com.example.kolayhedef.ui.login

import android.view.LayoutInflater
import androidx.fragment.app.viewModels
import com.example.kolayhedef.base.BaseFragment
import com.example.kolayhedef.databinding.FragmentLoginBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFragment : BaseFragment<FragmentLoginBinding,LoginViewModel>() {
    override fun layoutInflater(inflater: LayoutInflater): FragmentLoginBinding = FragmentLoginBinding.inflate(inflater)

    override val viewModel: LoginViewModel by viewModels()

    override fun initViews() {
        binding.loginButton.setOnClickListener {
            navigate(LoginFragmentDirections.actionLoginFragmentToSelectExamFragment())

        }
    }

    override fun initObservers() {

    }
}