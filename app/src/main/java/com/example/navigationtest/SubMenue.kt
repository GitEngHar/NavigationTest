package com.example.navigationtest

import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier

/*
* 検証でNavigateされる先の画面
* */
@Composable
fun SubMenue(modifier: Modifier = Modifier){
    Text(
            text = "Hello Submenue",
            modifier = modifier
    )
}