package com.codingchallenge.fetchrewardscodingchallenge.di

import com.codingchallenge.fetchrewardscodingchallenge.data.remote.ItemListApi
import com.codingchallenge.fetchrewardscodingchallenge.utils.Constants.Companion.BASE_URL
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
    fun provideRetrofit(
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideItemListApi(
        retrofit: Retrofit
    ): ItemListApi
    {
        return retrofit.create(ItemListApi::class.java)
    }




}