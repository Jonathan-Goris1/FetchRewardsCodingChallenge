package com.codingchallenge.fetchrewardscodingchallenge.presentation.home_screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.codingchallenge.fetchrewardscodingchallenge.presentation.components.ItemCard


@Composable
fun ItemListScreen(
    viewModel: ItemListScreenViewModel = hiltViewModel()
) {
    when(viewModel.state.isLoading){
        true -> {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                CircularProgressIndicator()
            }

        }
        else -> {
            LazyColumn(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ){

                items(viewModel.state.originalListItems.keys.toList()) { key->
                    Row(modifier = Modifier
                        .padding(0.dp, 16.dp, 0.dp, 0.dp)
                        .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "ListID: ${key.toString()}",
                            textAlign = TextAlign.Center,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Row {
                        Divider(
                            modifier = Modifier
                                .padding(0.dp, 0.dp, 0.dp, 16.dp),
                            color = Color.Black,
                            thickness = 2.dp
                        )
                    }


                    viewModel.state.originalListItems[key]?.forEach { ItemCard(Item = it) }

                }

            }
        }
    }

}

@Preview
@Composable
fun ItemListScreenPreview(){
    ItemListScreen()
}