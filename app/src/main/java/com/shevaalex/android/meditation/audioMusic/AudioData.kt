package com.shevaalex.android.meditation.audioMusic

import androidx.annotation.DrawableRes
import java.io.Serializable

data class AudioData(

    val name: String,
    @DrawableRes val imageId :Int,
    val imagepause : Int,
    val imageplay : Int,
    val auduio: Int
):Serializable