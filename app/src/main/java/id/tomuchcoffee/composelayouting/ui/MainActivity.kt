package id.tomuchcoffee.composelayouting.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import id.tomuchcoffee.composelayouting.ui.screen.DetailScreen
import id.tomuchcoffee.composelayouting.ui.screen.HomeScreen
import id.tomuchcoffee.composelayouting.ui.theme.ComposeLayoutingTheme


@ExperimentalMaterial3Api
class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val context = LocalContext.current
            ComposeLayoutingTheme {
                // A surface container using the 'background' color from the theme
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "home") {
                    composable("home") { HomeScreen(navController) }
                    composable("detail/{movieID}") {
                        DetailScreen(it.arguments?.getString("movieID").orEmpty(), navController)
                    }
                }
            }
        }
    }
}



