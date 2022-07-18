package com.codingchallenge.fetchrewardscodingchallenge.di

import com.codingchallenge.fetchrewardscodingchallenge.domain.interactor.GetItemsFilterAndSorted
import com.codingchallenge.fetchrewardscodingchallenge.domain.repository.ItemListRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object InteractorModule {

    @Provides
    @Singleton
    fun provideGetItemsFilterAndSorted(repository: ItemListRepository) = GetItemsFilterAndSorted(repository)
}