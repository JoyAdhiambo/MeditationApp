package com.shevaalex.android.meditation

import android.graphics.drawable.Icon
import androidx.annotation.DrawableRes

data class BottomNavItem(
    val label:String,
    @DrawableRes val iconId :Int,
    val route:String
)
