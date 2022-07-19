package com.codingchallenge.fetchrewardscodingchallenge.domain.repository

import com.codingchallenge.fetchrewardscodingchallenge.data.remote.model.ItemListModelItem


interface ItemListRepository {
    //This function will have be used by the GetItemsFilteredAndSorted class
    //to call the implementation instance and make the api call
    suspend fun getItems(): List<ItemListModelItem>
}