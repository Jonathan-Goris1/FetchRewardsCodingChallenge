package com.codingchallenge.fetchrewardscodingchallenge

import com.codingchallenge.fetchrewardscodingchallenge.data.remote.ItemListApi
import com.codingchallenge.fetchrewardscodingchallenge.utils.Constants.Companion.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton
//If you need to inject a fake or mock instance of a dependency,
// you need to tell Hilt not to use the binding that it used in production code
// and to use a different one instead.
@Module
@InstallIn(SingletonComponent::class)
class TestAppModule {

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
    fun provideAuthApi(
        retrofit: Retrofit
    ): ItemListApi
    {
        return retrofit.create(ItemListApi::class.java)
    }

}