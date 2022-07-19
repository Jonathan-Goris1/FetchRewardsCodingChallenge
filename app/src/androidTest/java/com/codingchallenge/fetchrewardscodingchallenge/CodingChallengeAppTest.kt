package com.codingchallenge.fetchrewardscodingchallenge

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import com.codingchallenge.fetchrewardscodingchallenge.di.AppModule
import com.codingchallenge.fetchrewardscodingchallenge.presentation.home_screen.ItemListScreen
import com.codingchallenge.fetchrewardscodingchallenge.ui.theme.FetchRewardsCodingChallengeTheme
import com.codingchallenge.fetchrewardscodingchallenge.utils.TestTags
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import dagger.hilt.android.testing.UninstallModules
import org.junit.Before
import org.junit.Rule
import org.junit.Test
//You must annotate any UI test that uses Hilt with @HiltAndroidTest.
// This annotation is responsible for generating the Hilt components for each test.
@HiltAndroidTest
//An annotation used to uninstall modules that have previously been installed with InstallIn.
@UninstallModules(AppModule::class)
class CodingChallengeAppTest {
    @get:Rule(order = 0)
    val hiltRule = HiltAndroidRule(this)

    @get:Rule(order = 1)
    val composeRule = createAndroidComposeRule<MainActivity>()

    @Before
    fun setup() {
        hiltRule.inject()
        composeRule.setContent {
            FetchRewardsCodingChallengeTheme { ItemListScreen() }
        }
    }

    @Test
    fun checkListIsDisplayedCorrectly() {
        // Check to see if the UI is displayed correctly
        composeRule.onNodeWithTag(TestTags.GroupID_text).assertIsDisplayed()
        composeRule.onNodeWithTag(TestTags.ID_Text).assertIsDisplayed()
        composeRule.onNodeWithTag(TestTags.ListID_Text).assertIsDisplayed()
        composeRule.onNodeWithTag(TestTags.Name_Text).assertIsDisplayed()

    }
}




