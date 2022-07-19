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
//Module annotation informs Hilt how to provide instances of certain types
//that we do not own, like using a third party library retrofit or an interface
// like ItemListRepository and ItemListApi
@Module
//InstallIn annotation tells Hilt which Android class each module will be used or installed in.
//all classes that uses the Singleton annotation will be provided this module
@InstallIn(SingletonComponent::class)
object AppModule {

    // The Provides annotation tells hilt how to provide instances of this type
    //The function return type tells Hilt what type the function provides instances of.
    //The function parameters tell Hilt the dependencies of the corresponding type.
    //The function body tells Hilt how to provide an instance of the corresponding type.
    // Hilt executes the function body every time it needs to provide an instance of that type.
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