package com.codingchallenge.fetchrewardscodingchallenge.domain.interactor

import com.codingchallenge.fetchrewardscodingchallenge.data.remote.model.ItemListModelItem
import com.codingchallenge.fetchrewardscodingchallenge.domain.repository.ItemListRepository
//This class is going to interact with the repository and
//be called in the viewModel
class GetItemsFilterAndSorted(private val repository: ItemListRepository) {
    //Objects with the invoke() method can be invoked as a function.
    //The reason I created this class was because i previously had
    //this business login in the viewModel.
    //I didn't like this approach because it didn't look clean and also
    //wasn't testable.
    //after creating this class the viewModel looks clean and
    //I was able to write a Unit test to insure the data was coming out
    //how it was suppose too.
    suspend operator fun invoke(): List<ItemListModelItem> {

        return repository.getItems().filter { !it.name.isNullOrBlank() }.sortedWith(
            compareBy(
                { it.listId },
                { item -> item.name?.filter { it -> it.isDigit() }?.toInt() }
            )
        )

    }

}
