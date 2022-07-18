package com.codingchallenge.fetchrewardscodingchallenge

import com.codingchallenge.fetchrewardscodingchallenge.data.remote.model.ItemListModelItem
import com.codingchallenge.fetchrewardscodingchallenge.domain.repository.ItemListRepository
import com.codingchallenge.fetchrewardscodingchallenge.utils.Resource
import kotlin.random.Random

class FakeRepository: ItemListRepository {
    override suspend fun getItems(): List<ItemListModelItem> {
        return arrayListOf(
            ItemListModelItem(
            id = 5,
            listId = 1,
            name = "Item 5"
            ),
            ItemListModelItem(
                id = Random.nextInt(),
                listId = 1,
                name = ""
            ),
            ItemListModelItem(
                id = Random.nextInt(),
                listId = 1,
                name = null
            ),

            ItemListModelItem(
                id = 1,
                listId = 1,
                name = "Item 1"
            ),

            ItemListModelItem(
                id = 4,
                listId = 1,
                name = "Item 4"
            ),

            ItemListModelItem(
                id = Random.nextInt(),
                listId = 1,
                name = null
            ),

            ItemListModelItem(
                id = Random.nextInt(),
                listId = 1,
                name = ""
            ),

            )
    }
}