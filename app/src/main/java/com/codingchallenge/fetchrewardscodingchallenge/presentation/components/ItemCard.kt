package com.codingchallenge.fetchrewardscodingchallenge.presentation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codingchallenge.fetchrewardscodingchallenge.data.remote.model.ItemListModelItem
import com.codingchallenge.fetchrewardscodingchallenge.utils.TestTags

//This composable will display the data
@Composable
fun ItemCard(
    modifier: Modifier = Modifier,
    Item: ItemListModelItem
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        border = BorderStroke(1.dp, Color.Black)

    ) {
        Row(
            modifier = modifier
                .padding(8.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                modifier = modifier
                    .testTag(TestTags.ID_Text)
                    .padding(0.dp,0.dp,16.dp,0.dp)
                    .weight(1.0f),
                textAlign = TextAlign.Left,
                fontSize = 16.sp,
                text = "ID: ${Item.id.toString()}"
            )


            Text(
                modifier = modifier
                    .testTag(TestTags.ListID_Text)
                    .padding(0.dp,0.dp,16.dp,0.dp)
                    .weight(1.0f),
                fontSize = 16.sp,
                text = "listID: ${Item.listId.toString()}"
            )

            Text(
                modifier = Modifier
                    .testTag(TestTags.Name_Text)
                    .weight(1f),
                fontSize = 16.sp,
                text = "Name: ${Item.name?: ""}"
            )
        }

    }
}

@Preview
@Composable
fun ItemCardPreview() {

    Card(
        modifier = Modifier
            .padding(0.dp, 8.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(8.dp),
        ) {
            Text(
                fontSize = 16.sp,
                text = "id: 755"
            )
            Spacer(modifier = Modifier.padding(8.dp))
            Text(
                fontSize = 16.sp,
                text = "listId: 2"
            )
            Spacer(modifier = Modifier.padding(8.dp))
            Text(
                fontSize = 16.sp,
                text = "name: Item 808"
            )
        }

    }
}