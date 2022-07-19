package com.codingchallenge.fetchrewardscodingchallenge.data.remote

import com.codingchallenge.fetchrewardscodingchallenge.data.remote.model.ItemListModelItem
import retrofit2.http.GET

interface ItemListApi {
    // using retrofit I created a GET request
    // This Get function will be used in the retrofit builder and the Get value with be attached
    // to the end of the BASE Url
    //The function will be a suspend function to run the operation off the main thread
    //The function will return a List of ItemModelItem
    @GET("hiring.json")
    suspend fun getItemList(): List<ItemListModelItem>
}