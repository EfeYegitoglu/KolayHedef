package com.example.kolayhedef.ui.onboard

import android.view.LayoutInflater
import androidx.fragment.app.viewModels
import com.example.kolayhedef.base.BaseFragment
import com.example.kolayhedef.databinding.FragmentSelectExamBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SelectExamFragment : BaseFragment<FragmentSelectExamBinding, OnBoardViewModel>() {
    override fun layoutInflater(inflater: LayoutInflater): FragmentSelectExamBinding =
        FragmentSelectExamBinding.inflate(inflater)

    override val viewModel: OnBoardViewModel by viewModels()

    override fun initViews() {
        with(binding) {
            progressBar.max = 4
            progressBar.progress = 1



            buttonClose.setOnClickListener {

            }

            buttonSave.setOnClickListener {
                navigate(SelectExamFragmentDirections.actionSelectExamFragmentToSelectDateFragment())
            }

        }
    }

    override fun initObservers() {

    }
}