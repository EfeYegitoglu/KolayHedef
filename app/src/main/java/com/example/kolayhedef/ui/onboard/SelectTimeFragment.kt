package com.example.kolayhedef.ui.onboard

import android.view.LayoutInflater
import androidx.fragment.app.viewModels
import com.example.kolayhedef.base.BaseFragment
import com.example.kolayhedef.databinding.FragmentSelectTimeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SelectTimeFragment : BaseFragment<FragmentSelectTimeBinding, OnBoardViewModel>() {
    override fun layoutInflater(inflater: LayoutInflater): FragmentSelectTimeBinding =
        FragmentSelectTimeBinding.inflate(inflater)

    override val viewModel: OnBoardViewModel by viewModels()

    override fun initViews() {
        with(binding) {
            progressBar.max = 4
            progressBar.progress = 3

            buttonClose.setOnClickListener {

            }

            buttonSave.setOnClickListener {
                navigate(SelectTimeFragmentDirections.actionSelectTimeFragmentToAccountInfoFragment())
            }

        }
    }

    override fun initObservers() {

    }
}