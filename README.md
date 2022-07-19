# FetchRewardsCodingChallenge
This Project is a Coding Exercise provided by Fetch Rewards to those who wish to apply for an android developer apprenticeship position. 

# Coding Challenge
Please write a native Android app in Kotlin or Java that retrieves the data from https://fetch-hiring.s3.amazonaws.com/hiring.json.
Display this list of items to the user based on the following requirements:
* Display all the items grouped by "listId"
* Sort the results first by "listId" then by "name" when displaying.
* Filter out any items where "name" is blank or null.
* The final result should be displayed to the user in an easy-to-read list.

Please make the project buildable on the latest (non-pre release) tools and supporting the current release mobile OS.


# Requirements
These Requirements were the tools I decided to use for the project and are not the requirments for the coding challenge
* API21+
* MVVM
* SOLID
* Dagger Hilt
* Retrofit
* Gitflow
* Jetpack Components

# Dependencies
    //Dagger Hilt
    implementation "com.google.dagger:hilt-android:2.40.5"
    kapt "com.google.dagger:hilt-android-compiler:2.40.5"
    implementation "androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03"
    kapt "androidx.hilt:hilt-compiler:1.0.0"
    implementation("androidx.hilt:hilt-navigation-compose:1.0.0")
    
    //Dagger Hilt Testing
    androidTestImplementation("com.google.dagger:hilt-android-testing:2.38.1")
    kaptAndroidTest 'com.google.dagger:hilt-android-compiler:2.40.5'

    // Retrofit + GSON
    implementation "com.squareup.retrofit2:retrofit:2.9.0"
    implementation "com.squareup.retrofit2:converter-gson:2.9.0"
