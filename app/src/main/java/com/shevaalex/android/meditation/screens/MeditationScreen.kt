package com.shevaalex.android.meditation.screens

import android.content.Context
import android.media.MediaPlayer
import android.widget.Toast
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shevaalex.android.meditation.Features

import com.shevaalex.android.meditation.MainActivity
import com.shevaalex.android.meditation.R
import com.shevaalex.android.meditation.audioMusic.AudioData
import com.shevaalex.android.meditation.audioMusic.AudioImage
import com.shevaalex.android.meditation.audioMusic.AudioList
import com.shevaalex.android.meditation.audioMusic.AudioListItem
import com.shevaalex.android.meditation.standardQuardFromTo
import com.shevaalex.android.meditation.ui.theme.*

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CurrentMeditationMusic() {

    Box(
        modifier = Modifier
            .background(ButtonBlue)
            .fillMaxSize()
    ) {
        Column {

       CurrentMed()
            DisplayAudio()
        }
    }}


@Composable
fun CurrentMed(
    color: Color = Beige2
) {


    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(15.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(color)
            .padding(horizontal = 15.dp, vertical = 20.dp)
            .height(200.dp)
            .width(400.dp)
    ) {
        Text(
            text = "Meditation",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.h1,
            color = Color.White,
            textAlign = TextAlign.Start,
            fontSize = 40.sp,

            )


        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(ButtonBlue)
                .padding(10.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_headphone),
                contentDescription = "",
                tint = Color.White,
                modifier = Modifier.align(Alignment.BottomStart)
            )


        }
    }
}


@Composable
fun DisplayAudio() {

    val audioList = remember { AudioList.audolist }
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {

        items(
            items = audioList,
            itemContent = {
                AudioListItem(item = it)
            }
        )
    }

}