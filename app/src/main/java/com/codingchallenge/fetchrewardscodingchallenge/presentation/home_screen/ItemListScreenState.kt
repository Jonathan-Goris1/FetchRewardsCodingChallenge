package com.codingchallenge.fetchrewardscodingchallenge.presentation.home_screen

import com.codingchallenge.fetchrewardscodingchallenge.data.remote.model.ItemListModelItem

data class ItemListScreenState(
    val isLoading: Boolean = false,
    val error: String? = null,
    val originalListItems:  Map<Int?, List<ItemListModelItem>> = emptyMap()

)
