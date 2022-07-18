package com.codingchallenge.fetchrewardscodingchallenge.domain.repository

import com.codingchallenge.fetchrewardscodingchallenge.data.remote.model.ItemListModelItem

interface ItemListRepository {

    suspend fun getItems(): List<ItemListModelItem>
}