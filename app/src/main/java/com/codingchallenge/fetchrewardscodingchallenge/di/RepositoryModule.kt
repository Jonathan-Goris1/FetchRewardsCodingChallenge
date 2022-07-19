package com.codingchallenge.fetchrewardscodingchallenge.di

import com.codingchallenge.fetchrewardscodingchallenge.data.repository.ItemListRepositoryImpl
import com.codingchallenge.fetchrewardscodingchallenge.domain.repository.ItemListRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

//Module annotation informs Hilt how to provide instances of certain types
//that we do not own, like using a third party library retrofit or an interface
// like ItemListRepository and ItemListApi
@Module
//InstallIn annotation tells Hilt which Android class each module will be used or installed in.
//all classes that uses the Singleton annotation will be provided this module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

//    The @Binds annotation tells Hilt which implementation to use when it needs to provide an instance of an interface.
//    The annotated function provides the following information to Hilt:
//    The function return type tells Hilt what interface the function provides instances of.
//    The function parameter tells Hilt which implementation to provide.
    @Binds
    @Singleton
    abstract fun bindItemListRepository(
        itemListRepositoryImpl: ItemListRepositoryImpl
    ): ItemListRepository
}