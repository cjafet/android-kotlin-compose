package br.com.fiap.composenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.composenavigation.screens.DetailScreen
import br.com.fiap.composenavigation.screens.LoginScreen
import br.com.fiap.composenavigation.screens.HomeScreen
import br.com.fiap.composenavigation.ui.theme.ComposeNavigationTheme
import br.com.fiap.composenavigation.viewmodel.HomeScreenViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeNavigationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "login") {
                        composable("login") { LoginScreen(navController = navController)}
                        composable("detail/{recommendationId}") {
                            val recommendationId = it.arguments?.getString("recommendationId", "0")
                            DetailScreen(navController = navController, recommendationId?.toInt()!!)
                        }
                        composable("home") { HomeScreen(navController = navController, HomeScreenViewModel()) }
                    }
                }
            }
        }
    }
}

