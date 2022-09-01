package com.shevaalex.android.meditation

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.shevaalex.android.meditation.screens.FeatureScreen
import com.shevaalex.android.meditation.ui.theme.ButtonBlue
import com.shevaalex.android.meditation.ui.theme.MeditationTheme

class InfoActivity : ComponentActivity() {
    private val features :Features by lazy {
        intent?.getSerializableExtra(FEATURE_ID)as Features
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeditationTheme {
                // A surface container using the 'background' color from the theme


            FeatureScreen(features = features)

            }
        }
    }



    companion object{
        private const val FEATURE_ID = "features_id "

        fun newIntent(context: Context,features: Features)=
            Intent(context,InfoActivity::class.java).apply {
                putExtra(FEATURE_ID,features)
            }
    }

}


