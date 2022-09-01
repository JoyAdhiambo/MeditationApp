@file:OptIn(ExperimentalFoundationApi::class, ExperimentalFoundationApi::class)

package com.shevaalex.android.meditation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.shevaalex.android.meditation.audioMusic.AudioList.audolist
import com.shevaalex.android.meditation.screens.CurrentMeditationMusic
import com.shevaalex.android.meditation.screens.HomeScreen
import com.shevaalex.android.meditation.screens.MusicScreen
import com.shevaalex.android.meditation.screens.SleepMeditation


import com.shevaalex.android.meditation.ui.theme.*


@Composable
fun ScreenControler(navController: NavHostController
) {
    NavHost(navController = navController, startDestination ="Home") {
        composable("Home") {
            HomeScreen()
        }

        composable("Meditation") {
            CurrentMeditationMusic( )
        }
        composable("Sleep") {
            SleepMeditation()
        }
        composable("Music") {
            MusicScreen()
        }



    }
}



@Composable
fun BottomNavigationBar(navController: NavHostController) {

    BottomNavigation(

        // set background color



       ) {

        // observe the backstack
        val navBackStackEntry by navController.currentBackStackEntryAsState()

        // observe current route to change the icon
        // color,label color when navigated
        val currentRoute = navBackStackEntry?.destination?.route
        // Bottom nav items we declared
        Constants.BottomNavItems.forEach { navItem ->
            // Place the bottom nav items
            BottomNavigationItem(
                selectedContentColor = ButtonBlue,

                // it currentRoute is equal then its selected route
                selected = currentRoute == navItem.route,
                unselectedContentColor = AquaBlue,

                // navigate on click
                onClick = {
                    navController.navigate(navItem.route)
                },

                // Icon of navItem
                icon = {
                    Icon( painter = painterResource(navItem.iconId), contentDescription = navItem.label,
                        tint = if (currentRoute == navItem.route) AquaBlue
                        else Beige2 )
                },

                // label
                label = {
                    Text(text = navItem.label,
                     color= if (currentRoute == navItem.route) AquaBlue
                     else Beige2)
                },
                alwaysShowLabel = false
            )
        }
    }
}