package com.shevaalex.android.meditation.screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shevaalex.android.meditation.Features
import com.shevaalex.android.meditation.standardQuardFromTo
import com.shevaalex.android.meditation.ui.theme.Beige2
import com.shevaalex.android.meditation.ui.theme.BlueViolet2

@Composable
fun FeatureScreen(features: Features) {
    val scrollstate = rememberScrollState()
    
    Column(modifier = Modifier.fillMaxSize()) {
        BoxWithConstraints() {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(scrollstate)
                    .background(BlueViolet2)
            ) {

                ProfileHeader(features = features, containerHeight =this@BoxWithConstraints.maxHeight )
                Description(features = features)

            }
                
            }
            
        }
        
        
    }

@Composable
private  fun ProfileHeader(
    features: Features,containerHeight: Dp
) {

    BoxWithConstraints(
        modifier = Modifier
            .padding(7.5.dp)
            .fillMaxWidth()
            .heightIn(max = containerHeight / 2)
            .aspectRatio(1f)
            .clip(RoundedCornerShape(10.dp))
            .background(features.darkColor)
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
                    color = features.mediumColor
                )
                drawPath(
                    path = lightColoredPath,
                    color = features.lightColor
                )
            }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(35.dp)
        ) {
            Text(
                text = features.title,
                style = MaterialTheme.typography.h1,
                lineHeight = 56.sp,
                modifier = Modifier.align(Alignment.TopStart)
            )


        }

        }
    }

@Composable
fun Description(features: Features) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(35.dp)
    ) {
        Text(
            text = features.Description,
            style = MaterialTheme.typography.h1,
            lineHeight = 36.sp,
            modifier = Modifier.align(Alignment.TopStart)
        )
    }
    
}