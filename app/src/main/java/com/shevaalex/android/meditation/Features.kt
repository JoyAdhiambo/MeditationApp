package com.shevaalex.android.meditation

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import java.io.Serializable

data class Features(
    val title:String,
    val lightColor: Color,
    val mediumColor:Color,
    val darkColor:Color,
    val Description:String,

):Serializable
