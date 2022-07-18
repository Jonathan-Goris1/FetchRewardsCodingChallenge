package com.codingchallenge.fetchrewardscodingchallenge.data.remote

import com.codingchallenge.fetchrewardscodingchallenge.data.remote.model.ItemListModelItem
import retrofit2.http.GET

interface ItemListApi {

    @GET("hiring.json")
    suspend fun getItemList(): List<ItemListModelItem>
}