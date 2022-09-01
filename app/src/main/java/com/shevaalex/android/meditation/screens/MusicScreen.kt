package com.shevaalex.android.meditation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shevaalex.android.meditation.R
import com.shevaalex.android.meditation.ui.theme.Beige2
import com.shevaalex.android.meditation.ui.theme.ButtonBlue
import com.shevaalex.android.meditation.ui.theme.DeepBlue

@Composable
fun MusicScreen() {

    Box(
        modifier = Modifier
            .background(DeepBlue)
            .fillMaxSize()
    ) {
        Column {

            CurrentSleep()
            DisplayAudio()

        }
    }}

@Composable
fun CurrentSleep (color: Color = Beige2
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
            text = "Music",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.h1,
            color = Color.White,
            textAlign = TextAlign.Left,
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


