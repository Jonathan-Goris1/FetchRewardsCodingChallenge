package com.codingchallenge.fetchrewardscodingchallenge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.codingchallenge.fetchrewardscodingchallenge.presentation.home_screen.ItemListScreen
import com.codingchallenge.fetchrewardscodingchallenge.ui.theme.FetchRewardsCodingChallengeTheme
import dagger.hilt.android.AndroidEntryPoint
//Marks an Android component class to be setup for injection with the standard Hilt Dagger Android components.
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FetchRewardsCodingChallengeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //This will be our Main Screen and only screen
                    ItemListScreen()
                }
            }
        }
    }
}
