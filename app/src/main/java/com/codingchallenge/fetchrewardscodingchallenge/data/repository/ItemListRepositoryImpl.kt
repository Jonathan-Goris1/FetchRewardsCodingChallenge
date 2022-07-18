package com.codingchallenge.fetchrewardscodingchallenge.data.repository

import com.codingchallenge.fetchrewardscodingchallenge.data.remote.ItemListApi
import com.codingchallenge.fetchrewardscodingchallenge.data.remote.model.ItemListModelItem
import com.codingchallenge.fetchrewardscodingchallenge.domain.repository.ItemListRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ItemListRepositoryImpl @Inject constructor(
    private val api: ItemListApi
): ItemListRepository {
    override suspend fun getItems(): List<ItemListModelItem> {
        return api.getItemList()
    }
}