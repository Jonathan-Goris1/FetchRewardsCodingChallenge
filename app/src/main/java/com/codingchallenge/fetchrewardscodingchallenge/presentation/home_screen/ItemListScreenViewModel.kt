package com.codingchallenge.fetchrewardscodingchallenge.presentation.home_screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.codingchallenge.fetchrewardscodingchallenge.domain.interactor.GetItemsFilterAndSorted
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

//The HiltViewModel annotation Identifies a ViewModel for construction injection.
@HiltViewModel
class ItemListScreenViewModel @Inject constructor(
    //Rather than injecting the repository
    //I am injecting the Use Case for the viewModel
    private val getItems: GetItemsFilterAndSorted
) : ViewModel() {
    var state by mutableStateOf(ItemListScreenState())

    //This init block will initialize the function when the
    //ViewModel is first created, hence running the function.
    init {
        fetchItems()
    }

//This function will make api call
    private fun fetchItems() {
    //because this is a suspend function it must be called
    //within a Scope, in this case a viewModelScope
        viewModelScope.launch {
            //Here I set the loading state to be true because
            // I haven't received the data yet
            state = state.copy(isLoading = true)
            // I wrap the call in a try/catch in case it fails
            state = try {
                //I place the function call in a variable
                // to make the variable type a List and not a GetItemsFilterAndSorted
                val result = getItems()
                //After the call I copy the data into the state variables
                state.copy(
                    originalListItems = result.groupBy { it.listId },
                    isLoading = false,
                    error = null,
                )
                //if it fails I copy the response into the state
            } catch (exception: Exception){
                state.copy(
                    originalListItems = emptyMap(),
                    isLoading = false,
                    error = exception.message,
                )
            }

        }
        // after the coroutine is done we set the loading state to false
        state = state.copy(isLoading = false)
    }
}
