package com.shevaalex.android.meditation

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.shevaalex.android.meditation.audioMusic.AudioData
import com.shevaalex.android.meditation.audioMusic.AudioList
import com.shevaalex.android.meditation.audioMusic.AudioListItem

import com.shevaalex.android.meditation.screens.CurrentMeditationMusic
import com.shevaalex.android.meditation.screens.HomeScreen
import com.shevaalex.android.meditation.ui.theme.ButtonBlue


import com.shevaalex.android.meditation.ui.theme.MeditationTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalFoundationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeditationTheme {
             HomeScreen()


                // get recreated on recomposition
                val navController = rememberNavController()

                Surface(color = ButtonBlue) {
                    // Scaffold Component
                    Scaffold(
                        // Bottom navigation
                        bottomBar = {
                            BottomNavigationBar(navController = navController)
                        }, content = { padding ->
                            // Navhost: where screens are placed
                            ScreenControler(navController = navController)
                        }
                    )
                }
            }
        }
    }
}

