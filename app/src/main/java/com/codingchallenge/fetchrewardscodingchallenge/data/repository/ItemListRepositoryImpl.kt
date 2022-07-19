package com.codingchallenge.fetchrewardscodingchallenge.data.repository

import com.codingchallenge.fetchrewardscodingchallenge.data.remote.ItemListApi
import com.codingchallenge.fetchrewardscodingchallenge.data.remote.model.ItemListModelItem
import com.codingchallenge.fetchrewardscodingchallenge.domain.repository.ItemListRepository
import javax.inject.Inject
import javax.inject.Singleton

// This is a singleton annotation used by hilt tells hilt to
//create this class only once when it is first called
//creating only one instance of the class
//The Inject annotation tells hilt what instance to inject
// in this example it is the api of type ItemList Api
// The class Inherits from the ItemListRepository
// When inheriting from a interfaced must implement its members and
//override the functions it inherits
@Singleton
class ItemListRepositoryImpl @Inject constructor(
    private val api: ItemListApi
): ItemListRepository {
    //The getItems function is from the ItemListRepository located in
    //the domain package, we inherit the function and override it.
    // the function uses the api instance that will be injected into the
    //constructor and calls the getItemList function in ItemListApi
    override suspend fun getItems(): List<ItemListModelItem> {
        return api.getItemList()
    }
}