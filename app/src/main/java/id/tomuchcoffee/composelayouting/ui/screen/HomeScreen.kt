package id.tomuchcoffee.composelayouting.ui.screen

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
import id.tomuchcoffee.composelayouting.R
import id.tomuchcoffee.composelayouting.data.DataSource
import id.tomuchcoffee.composelayouting.domain.model.Movie
import id.tomuchcoffee.composelayouting.ui.theme.Gold
import id.tomuchcoffee.composelayouting.ui.theme.neuFont

@ExperimentalMaterial3Api
@Composable
fun HomeScreen(navController: NavHostController) {
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
                }
            )
        }
    )
    {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
        ) {
            DataSource.sectionTitle.forEachIndexed { i, title ->
                Text(
                    modifier = Modifier
                        .padding(start = 16.dp),
                    text = title,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.tertiary
                )
                LazyRow(
                    modifier = Modifier.fillMaxWidth(),
                    contentPadding = PaddingValues(16.dp),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    items(DataSource.movies[i]) { movie ->
                        MovieItem(movie) { movie ->
                            navController.navigate("detail/${movie.id}")
                        }

                    }
                }
            }

        }
    }
}

@Composable
fun MovieItem(
    movie: Movie = Movie(
        1, R.drawable.img, 5.5, "Avengers", "Lorem ipsum"
    ),
    onClick: (Movie) -> Unit
) {
    Column(modifier = Modifier
        .width(200.dp)
        .clickable { onClick.invoke(movie) }) {
        Box(modifier = Modifier.fillMaxWidth()) {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
                    .clip(RoundedCornerShape(10.dp)),
                painter = painterResource(id = movie.image),
                contentDescription = "Movie Image",
                contentScale = ContentScale.Crop
            )
            Text(
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(5.dp)
                    .background(Color.Black, CircleShape)
                    .padding(3.dp),
                text = movie.rating.toString(),
                fontSize = 18.sp,
                color = Gold
            )
        }
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            modifier = Modifier
                .fillMaxWidth(),
            text = movie.title,
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            color = MaterialTheme.colorScheme.tertiary
        )

    }
}