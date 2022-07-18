package com.codingchallenge.fetchrewardscodingchallenge

import com.codingchallenge.fetchrewardscodingchallenge.data.remote.model.ItemListModelItem
import com.codingchallenge.fetchrewardscodingchallenge.domain.interactor.GetItemsFilterAndSorted
import com.codingchallenge.fetchrewardscodingchallenge.domain.repository.ItemListRepository
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class GetItemsFilterAndSortTest {

    private lateinit var getItems: GetItemsFilterAndSorted
    private lateinit var repository: ItemListRepository

    @Before
    fun setup(){
        repository = FakeRepository()
        getItems = GetItemsFilterAndSorted(repository)

    }

    @Test
    fun getItemsFilterAndSortedCorrectly(){
        val correct = arrayListOf(
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
                id = 5,
                listId = 1,
                name = "Item 5"
            )

        )

        runBlocking {
            val result = getItems()
            Assert.assertEquals(correct, result)
        }

    }
}