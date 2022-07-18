package com.codingchallenge.fetchrewardscodingchallenge.domain.repository

import com.codingchallenge.fetchrewardscodingchallenge.data.remote.model.ItemListModelItem
import com.codingchallenge.fetchrewardscodingchallenge.utils.Resource

interface ItemListRepository {

    suspend fun getItems(): List<ItemListModelItem>
}