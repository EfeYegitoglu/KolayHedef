package com.example.kolayhedef.data.onboard.repository

import com.example.kolayhedef.data.onboard.remote.OnBoardService
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class OnBoardRepositoryImpl @Inject constructor(
    private val onBoardService: OnBoardService

) {
}