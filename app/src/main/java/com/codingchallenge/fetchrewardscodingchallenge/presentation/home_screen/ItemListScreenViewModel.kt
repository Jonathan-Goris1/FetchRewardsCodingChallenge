package com.codingchallenge.fetchrewardscodingchallenge.presentation.home_screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.codingchallenge.fetchrewardscodingchallenge.domain.interactor.GetItemsFilterAndSorted
import com.codingchallenge.fetchrewardscodingchallenge.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ItemListScreenViewModel @Inject constructor(
    private val getItems: GetItemsFilterAndSorted
) : ViewModel() {
    var state by mutableStateOf(ItemListScreenState())


    init {
        fetchItems()
    }


    private fun fetchItems() {
        viewModelScope.launch {
            state = state.copy(isLoading = true)
            state = try {
                val result = getItems()

                state.copy(
                    originalListItems = result.groupBy { it.listId },
                    isLoading = false,
                    error = null,
                )
            } catch (exception: Exception){
                state.copy(
                    originalListItems = emptyMap(),
                    isLoading = false,
                    error = exception.message,
                )
            }

        }

        state = state.copy(isLoading = false)
    }
}
