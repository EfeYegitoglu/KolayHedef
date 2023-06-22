package com.example.kolayhedef.di

import com.example.kolayhedef.Constants.API_BASE_URL
import com.example.kolayhedef.Constants.DEBUG
import com.example.kolayhedef.data.HostSelectionInterceptor
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Singleton
    @Provides
    fun provideGson(): Gson {
        return GsonBuilder().create()
    }

    @Provides
    @Singleton
    fun providesRetrofit(gson: Gson, okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(API_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(okHttpClient)
            .build()
    }

    @Singleton
    @Provides
    fun provideOkHttpClient(hostSelectionInterceptor: HostSelectionInterceptor): OkHttpClient {
        val okHttpBuilder: OkHttpClient.Builder = OkHttpClient.Builder()
            .retryOnConnectionFailure(true)
            .callTimeout(15, TimeUnit.SECONDS)
            .connectTimeout(15, TimeUnit.SECONDS)
            .readTimeout(15, TimeUnit.SECONDS)
            .addInterceptor(hostSelectionInterceptor)
        if (DEBUG) {
            val logging = HttpLoggingInterceptor()
            logging.level = HttpLoggingInterceptor.Level.BODY
            okHttpBuilder.addInterceptor(logging)
        }
        return okHttpBuilder.build()
    }

    @Singleton
    @Provides
    fun provideHostSelectionInterceptor(): HostSelectionInterceptor {
        return HostSelectionInterceptor()
    }
}
