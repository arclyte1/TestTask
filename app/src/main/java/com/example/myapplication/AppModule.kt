package com.example.myapplication

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideRetrofitClient(): Api = Retrofit.Builder()
        .baseUrl("https://hostexample.ry/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(Api::class.java)

}