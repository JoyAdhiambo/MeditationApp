package com.shevaalex.android.meditation.SleepMusic

import androidx.annotation.DrawableRes
import java.io.Serializable

data class SleepData ( val name: String,
@DrawableRes
val imageId :Int,
val imagepause : Int,
val imageplay : Int,
val auduio: Int
):Serializable