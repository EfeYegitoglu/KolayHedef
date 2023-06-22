package com.example.kolayhedef.ui.home

import android.view.LayoutInflater
import androidx.fragment.app.viewModels
import com.example.kolayhedef.base.BaseFragment
import com.example.kolayhedef.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment:BaseFragment<FragmentHomeBinding,HomeViewModel>() {
    override fun layoutInflater(inflater: LayoutInflater): FragmentHomeBinding = FragmentHomeBinding.inflate(inflater)

    override val viewModel: HomeViewModel by viewModels()

    override fun initViews() {

    }

    override fun initObservers() {

    }
}