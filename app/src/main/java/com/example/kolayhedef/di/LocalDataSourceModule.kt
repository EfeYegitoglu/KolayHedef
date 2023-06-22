package com.example.kolayhedef.di

import android.app.Application
import android.content.SharedPreferences
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKey
import com.example.kolayhedef.local.LocalTokenSource
import com.example.kolayhedef.local.LocalTokenSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class LocalDataSourceModule {

    @Provides
    fun providesSharedPreference(application: Application): SharedPreferences {

        val masterKey = MasterKey.Builder(application.applicationContext)
            .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
            .build()

        return EncryptedSharedPreferences.create(application.applicationContext,
            "shared-prefs",
            masterKey,
            EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
            EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM)
    }

    @Provides
    fun providesLoginLocalDataSource(sharedPreferences: SharedPreferences): LocalTokenSource {
        return LocalTokenSourceImpl(sharedPreferences)
    }

}