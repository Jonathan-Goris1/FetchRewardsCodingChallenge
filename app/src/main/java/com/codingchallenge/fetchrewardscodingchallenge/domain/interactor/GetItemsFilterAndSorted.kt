package com.codingchallenge.fetchrewardscodingchallenge.domain.interactor

import com.codingchallenge.fetchrewardscodingchallenge.data.remote.model.ItemListModelItem
import com.codingchallenge.fetchrewardscodingchallenge.domain.repository.ItemListRepository

class GetItemsFilterAndSorted(private val repository: ItemListRepository) {

    suspend operator fun invoke(): List<ItemListModelItem> {

        return repository.getItems().filter { !it.name.isNullOrBlank() }.sortedWith(
            compareBy(
                { it.listId },
                { item -> item.name?.filter { it -> it.isDigit() }?.toInt() }
            )
        )

    }

}
