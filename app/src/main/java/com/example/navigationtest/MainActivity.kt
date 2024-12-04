package com.example.navigationtest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.navigationtest.ui.theme.NavigationTestTheme
import androidx.compose.material3.Button
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavigationTestTheme {
                val navController = rememberNavController()
                NavHost(navController = navController,startDestination=Nav.GreetingPreview.name){
                    composable(route = Nav.GreetingPreview.name){
                        Greeting(
                            onNavigateToSubMenue = { navController.navigate(Nav.SubMenue.name) },
                        )

                    }
                    composable(route = Nav.SubMenue.name) { SubMenue() }
                }

            }
        }
    }
}

@Composable
fun Greeting(onNavigateToSubMenue: () -> Unit) {
    Button(onClick=onNavigateToSubMenue){
        Text("hogehoge")
    }
}