package com.codingchallenge.fetchrewardscodingchallenge.presentation.home_screen

import com.codingchallenge.fetchrewardscodingchallenge.data.remote.model.ItemListModelItem

//This data class represents the states for our viewModel
//We use states for changes in the UI that need to be updated
//by the viewModel.
data class ItemListScreenState(
    val isLoading: Boolean = false,
    val error: String? = null,
    val originalListItems:  Map<Int?, List<ItemListModelItem>> = emptyMap()

)
