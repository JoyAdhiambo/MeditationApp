package com.shevaalex.android.meditation.SleepMusic

import android.media.MediaPlayer
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.shevaalex.android.meditation.R
import com.shevaalex.android.meditation.ui.theme.*

@Composable
fun AudioSleepListItem(item: SleepData,  color: Color = BlueViolet1) {
    val context = LocalContext.current
    val mp: MediaPlayer = MediaPlayer.create(context, item.auduio)

    Card( modifier = Modifier

        .background(DeepBlue)
        .padding(10.dp),
        shape = RoundedCornerShape(corner = CornerSize(18.dp))
        ) {


        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize()
                .background(color)
                .clip(RoundedCornerShape(50.dp))
                .padding(10.dp),

            ) {
                Image(
                    painter = painterResource(id = item.imageId),
                    contentDescription = "",
                    modifier = Modifier
                        .height(100.dp)
                        .width(100.dp)
                        .padding(32.dp)

                )

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                            .background(ButtonBlue)
                            .padding(10.dp)
                    ) {
                        IconButton(onClick = { mp.start() }, modifier = Modifier.size(35.dp)) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_play),
                                contentDescription = ""
                            )
                        }
                    }

                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                            .background(ButtonBlue)
                            .padding(10.dp)
                    ) {
                        IconButton(onClick = { mp.pause() }, modifier = Modifier.size(35.dp)) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_pause),
                                contentDescription = ""
                            )
                        }
                    }

                }
            }
        }
    }

