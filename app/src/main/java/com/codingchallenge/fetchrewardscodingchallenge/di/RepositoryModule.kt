package com.codingchallenge.fetchrewardscodingchallenge.di

import com.codingchallenge.fetchrewardscodingchallenge.data.repository.ItemListRepositoryImpl
import com.codingchallenge.fetchrewardscodingchallenge.domain.repository.ItemListRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindItemListRepository(
        itemListRepositoryImpl: ItemListRepositoryImpl
    ): ItemListRepository
}