package com.shevaalex.android.meditation.screens


import android.content.Intent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import com.shevaalex.android.meditation.*
import com.shevaalex.android.meditation.R
import com.shevaalex.android.meditation.ui.theme.*

@ExperimentalFoundationApi
@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .background(DeepBlue)
            .fillMaxSize()
    ) {
        Column {
            GreetingSection()
            ChipSection(chips = listOf("Sweet sleep", "Insomnia", "Depression"))
            CurrentMeditation()
     FeatureSection(
         feature = listOf(
             Features(
                 title = "Meditation",
                 BlueViolet1,
                 BlueViolet2,
                 BlueViolet3,
                 Description = "  Meditation has many potential benefits for sleep, as it has been shown to reduce anxiety, depression, and pain5. Overall, reducing stress6 may help you get better sleep." +
                         " Sleep meditation usually incorporates soothing, calming sounds or music, which can contribute to a relaxing environment. Some studies have shown a link between mindfulness meditation and improved ." +
                         "Sleep meditation may also help you adjust to a new sleep schedule or sleeping arrangement. Traveling often and staying in hotels can be disruptive and impact your sleep. Jet lag and shift work are two common factors that can lead to sleep disturbances and short-term insomnia8. Meditation has been shown to have a mild impact on certain symptoms of insomnia"
             ),
             Features(
                 title = "Tips for sleeping",
                 LightGreen1,
                 LightGreen2,
                 LightGreen3,

                 Description = "1. Stick to a sleep schedule\n" +
                         "Set aside no more than eight hours for sleep. The recommended amount of sleep for a healthy adult is at least seven hours. Most people don't need more than eight hours in bed to be well rested." +
                         "2. Pay attention to what you eat and drink\n" +
                         "Don't go to bed hungry or stuffed. In particular, avoid heavy or large meals within a couple of hours of bedtime. Discomfort might keep you up." +
                         "3. Create a restful environment\n" +
                         "Keep your room cool, dark and quiet. Exposure to light in the evenings might make it more challenging to fall asleep. Avoid prolonged use of light-emitting screens just before bedtime. Consider using room-darkening shades, earplugs, a fan or other devices to create an environment that suits your needs." +
                         "4. Limit daytime naps\n" +
                         "Long daytime naps can interfere with nighttime sleep. Limit naps to no more than one hour and avoid napping late in the day."
             ),
             Features(
                 title = "Sleeping Techniques",
                 LightGreen1,
                 LightGreen2,
                 LightGreen3,

                 Description = "1. Stick to a sleep schedule\n" +
                         "Set aside no more than eight hours for sleep. The recommended amount of sleep for a healthy adult is at least seven hours. Most people don't need more than eight hours in bed to be well rested." +
                         "2. Pay attention to what you eat and drink\n" +
                         "Don't go to bed hungry or stuffed. In particular, avoid heavy or large meals within a couple of hours of bedtime. Discomfort might keep you up." +
                         "3. Create a restful environment\n" +
                         "Keep your room cool, dark and quiet. Exposure to light in the evenings might make it more challenging to fall asleep. Avoid prolonged use of light-emitting screens just before bedtime. Consider using room-darkening shades, earplugs, a fan or other devices to create an environment that suits your needs." +
                         "4. Limit daytime naps\n" +
                         "Long daytime naps can interfere with nighttime sleep. Limit naps to no more than one hour and avoid napping late in the day."
             ),
             Features(
                 title = "Silent Nights",
                 BlueViolet1,
                 BlueViolet2,
                 BlueViolet3,
                 Description = "  Meditation has many potential benefits for sleep, as it has been shown to reduce anxiety, depression, and pain5. Overall, reducing stress6 may help you get better sleep." +
                         " Sleep meditation usually incorporates soothing, calming sounds or music, which can contribute to a relaxing environment. Some studies have shown a link between mindfulness meditation and improved ." +
                         "Sleep meditation may also help you adjust to a new sleep schedule or sleeping arrangement. Traveling often and staying in hotels can be disruptive and impact your sleep. Jet lag and shift work are two common factors that can lead to sleep disturbances and short-term insomnia8. Meditation has been shown to have a mild impact on certain symptoms of insomnia"


             )
         )
     )
        }
}
}



@Composable
fun GreetingSection(

) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Good Day",
                style = MaterialTheme.typography.h2
            )
            Text(
                text = "We wish you have a good day!",
                style = MaterialTheme.typography.body1
            )
        }
        Icon(
            painter = painterResource(id = R.drawable.ic_search),
            contentDescription = "Search",
            tint = Color.White,
            modifier = Modifier.size(24.dp)
        )
    }
}

@Composable
fun ChipSection(
    chips: List<String>
)
{


    var selectedChipIndex by remember {
        mutableStateOf(0)
    }
    LazyRow {
        items(chips.size) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(start = 15.dp, top = 15.dp, bottom = 15.dp)
                    .clickable {
                        selectedChipIndex = it
                    }
                    .clip(RoundedCornerShape(10.dp))
                    .background(
                        if (selectedChipIndex == it) ButtonBlue
                        else DarkerButtonBlue
                    )
                    .padding(15.dp)
            ) {
                Text(text = chips[it], color = TextWhite)
            }
        }
    }
}

@Composable
fun CurrentMeditation() {


    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(15.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(LightRed)
            .padding(horizontal = 15.dp, vertical = 20.dp)
            .fillMaxWidth()
    ) {
        Column {
            Text(
                text = "Daily Thought",
                style = MaterialTheme.typography.h2
            )
            Text(
                text = "Meditation • 3-10 min",
                style = MaterialTheme.typography.body1,
                color = TextWhite
            )
        }

    }
}

@ExperimentalFoundationApi
@Composable
fun FeatureSection(feature: List<Features>) {


    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = "Features",
            style = MaterialTheme.typography.h1,
            modifier = Modifier.padding(15.dp)
        )
        LazyVerticalGrid(
            cells = GridCells.Fixed(2),
            contentPadding = PaddingValues(start = 7.5.dp, end = 7.5.dp, bottom = 100.dp),
            modifier = Modifier.fillMaxHeight()
        ) {
            items( feature.size)



             {
                FeatureItem(feature = feature[it])
            }

        }
    }
}

@Composable
fun FeatureItem(
    feature: Features
) {
    val mContext = LocalContext.current
    BoxWithConstraints(
        modifier = Modifier
            .padding(7.5.dp)
            .aspectRatio(1f)
            .clip(RoundedCornerShape(10.dp))
            .background(feature.darkColor)
    ) {
        val width = constraints.maxWidth
        val height = constraints.maxHeight

        // Medium colored path
        val mediumColoredPoint1 = Offset(0f, height * 0.3f)
        val mediumColoredPoint2 = Offset(width * 0.1f, height * 0.35f)
        val mediumColoredPoint3 = Offset(width * 0.4f, height * 0.05f)
        val mediumColoredPoint4 = Offset(width * 0.75f, height * 0.7f)
        val mediumColoredPoint5 = Offset(width * 1.4f, -height.toFloat())

        val mediumColoredPath = Path().apply {
            moveTo(mediumColoredPoint1.x, mediumColoredPoint1.y)
            standardQuardFromTo(mediumColoredPoint1, mediumColoredPoint2)
            standardQuardFromTo(mediumColoredPoint2, mediumColoredPoint3)
            standardQuardFromTo(mediumColoredPoint3, mediumColoredPoint4)
            standardQuardFromTo(mediumColoredPoint4, mediumColoredPoint5)
            lineTo(width.toFloat() + 100f, height.toFloat() + 100f)
            lineTo(-100f, height.toFloat() + 100f)
            close()
        }

        // Light colored path
        val lightPoint1 = Offset(0f, height * 0.35f)
        val lightPoint2 = Offset(width * 0.1f, height * 0.4f)
        val lightPoint3 = Offset(width * 0.3f, height * 0.35f)
        val lightPoint4 = Offset(width * 0.65f, height.toFloat())
        val lightPoint5 = Offset(width * 1.4f, -height.toFloat() / 3f)

        val lightColoredPath = Path().apply {
            moveTo(lightPoint1.x, lightPoint1.y)
            standardQuardFromTo(lightPoint1, lightPoint2)
            standardQuardFromTo(lightPoint2, lightPoint3)
            standardQuardFromTo(lightPoint3, lightPoint4)
            standardQuardFromTo(lightPoint4, lightPoint5)
            lineTo(width.toFloat() + 100f, height.toFloat() + 100f)
            lineTo(-100f, height.toFloat() + 100f)
            close()
        }
        Canvas(
            modifier = Modifier
                .fillMaxSize()
        ) {
            drawPath(
                path = mediumColoredPath,
                color = feature.mediumColor
            )
            drawPath(
                path = lightColoredPath,
                color = feature.lightColor
            )
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp)
        ) {
            Text(
                text = feature.title,
                style = MaterialTheme.typography.h2,
                lineHeight = 26.sp,
                modifier = Modifier.align(Alignment.TopStart)
            )

            Text(
                text = "Start",
                color = TextWhite,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .clickable {
                        mContext.startActivity(Intent(  InfoActivity.newIntent(mContext, feature)))
                        // Handle the click
                    }
                    .align(Alignment.BottomEnd)
                    .clip(RoundedCornerShape(10.dp))
                    .background(ButtonBlue)
                    .padding(vertical = 6.dp, horizontal = 15.dp)
            )
        }
    }
}









