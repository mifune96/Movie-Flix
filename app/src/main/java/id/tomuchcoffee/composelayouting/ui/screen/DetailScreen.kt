package id.tomuchcoffee.composelayouting.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import id.tomuchcoffee.composelayouting.ui.theme.neuFont
import id.tomuchcoffee.composelayouting.R
import id.tomuchcoffee.composelayouting.data.DataSource
import id.tomuchcoffee.composelayouting.domain.model.Movie

@ExperimentalMaterial3Api
@Composable
fun DetailScreen(
    movieID: String,
    navController: NavHostController
) {
    val movie = findMoviewById(movieID.toInt())
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = MaterialTheme.colorScheme.primary,
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary
                ),
                title = {
                    Text(
                        text = "MOVIEFLIX",
                        fontSize = 26.sp,
                        fontFamily = neuFont,
                        color = Color.Red
                    )
                },
                navigationIcon = {
                    if (navController.previousBackStackEntry != null) {
                        IconButton(onClick = { navController.navigateUp() }) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_back),
                                contentDescription = "Back Arrow"
                            )

                        }
                    }
                }
            )
        }
    )
    {
        movie?.let { movie ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
            ) {
                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .clip(RoundedCornerShape(10.dp))
                        .padding(16.dp),
                    painter = painterResource(id = movie.image),
                    contentDescription = "Movie Image",
                    contentScale = ContentScale.Inside
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    text = movie.title,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    color = MaterialTheme.colorScheme.tertiary
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    text = movie.description,
                    fontSize = 16.sp,
                    color = MaterialTheme.colorScheme.tertiary
                )
            }
        }


    }
}

fun findMoviewById(id: Int): Movie? {
    DataSource.movies.map {
        it.map {
            if (it.id == id)
                return it
        }
    }
    return null
}