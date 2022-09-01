package com.shevaalex.android.meditation.SleepMusic

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.shevaalex.android.meditation.Features
import com.shevaalex.android.meditation.R
import com.shevaalex.android.meditation.ui.theme.BlueViolet1
import com.shevaalex.android.meditation.ui.theme.BlueViolet2
import com.shevaalex.android.meditation.ui.theme.BlueViolet3

object AudioSleepList{


        val audolist =listOf(

            SleepData(

                name = "Meditation1",
                imageId = R.drawable.ic_music,
                imagepause = R.drawable.ic_pause,
                imageplay = R.drawable.ic_play,
                auduio = R.raw.yoga
            ),
            SleepData (

                name = "Lucifer",
                imageId = R.drawable.ic_music,
                imagepause = R.drawable.ic_pause,
                imageplay = R.drawable.ic_play,
                auduio = R.raw.mediounder
            ),
            SleepData(

                name = "Lucifer",
                imageId = R.drawable.ic_music,
                imagepause = R.drawable.ic_pause,
                imageplay = R.drawable.ic_play,
                auduio = R.raw.medione
            ),
            SleepData(

                name = "Lucifer",
                imageId = R.drawable.ic_music,
                imagepause = R.drawable.ic_pause,
                imageplay = R.drawable.ic_play,
                auduio = R.raw.piano
            )



        )

    }





@Composable
fun AudioImage(audio: SleepData) {
    Image(
        painter = painterResource(id = audio.imageId),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(4.dp)

            .height(140.dp)
            .width(100.dp)
            .clip(RoundedCornerShape(corner = CornerSize(10.dp)))

    )
}