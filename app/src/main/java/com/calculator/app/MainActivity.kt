package com.calculator.app

import android.annotation.SuppressLint
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.calculator.app.ui.theme.CalculatorTheme
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController


@OptIn(ExperimentalAnimationApi::class)
class MainActivity : ComponentActivity() {
  @SuppressLint("SourceLockedOrientationActivity")
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    this.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
    setContent {
      val navController = rememberAnimatedNavController()
      val systemUiController = rememberSystemUiController()
      SideEffect { systemUiController.setSystemBarsColor(color = Color(0xFFFFFFFF)) }
    }
  }
}