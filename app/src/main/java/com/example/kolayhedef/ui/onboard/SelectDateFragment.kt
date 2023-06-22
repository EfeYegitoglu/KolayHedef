package com.example.kolayhedef.ui.onboard

import android.view.LayoutInflater
import androidx.fragment.app.viewModels
import com.example.kolayhedef.base.BaseFragment
import com.example.kolayhedef.databinding.FragmentSelectDateBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SelectDateFragment : BaseFragment<FragmentSelectDateBinding, OnBoardViewModel>() {
    override fun layoutInflater(inflater: LayoutInflater): FragmentSelectDateBinding =
        FragmentSelectDateBinding.inflate(inflater)

    override val viewModel: OnBoardViewModel by viewModels()

    override fun initViews() {
        with(binding) {
            progressBar.max = 4
            progressBar.progress = 2

            buttonClose.setOnClickListener {

            }

            buttonSave.setOnClickListener {
                navigate(SelectDateFragmentDirections.actionSelectDateFragmentToSelectTimeFragment())
            }

        }
    }

    override fun initObservers() {

    }
}