package com.example.kolayhedef.ui.onboard

import android.view.LayoutInflater
import androidx.fragment.app.viewModels
import com.example.kolayhedef.base.BaseFragment
import com.example.kolayhedef.databinding.FragmentAccountInfoBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AccountInfoFragment : BaseFragment<FragmentAccountInfoBinding, OnBoardViewModel>() {
    override fun layoutInflater(inflater: LayoutInflater): FragmentAccountInfoBinding =
        FragmentAccountInfoBinding.inflate(inflater)


    override val viewModel: OnBoardViewModel by viewModels()

    override fun initViews() {
        with(binding) {
            progressBar.max = 4
            progressBar.progress = 4

            buttonClose.setOnClickListener {

            }

            buttonSave.setOnClickListener {
                navigate(AccountInfoFragmentDirections.actionAccountInfoFragmentToHomeFragment())
            }

        }
    }

    override fun initObservers() {

    }
}