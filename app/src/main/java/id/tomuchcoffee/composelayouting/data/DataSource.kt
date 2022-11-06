package id.tomuchcoffee.composelayouting.data

import id.tomuchcoffee.composelayouting.R
import id.tomuchcoffee.composelayouting.domain.model.Movie

object DataSource {
    val sectionTitle = listOf("What's Popular", "Free To Watch", "Trending")
    val movies = listOf<List<Movie>>(
        listOf(
            Movie(
                id = 1,
                title = "The Stranger",
                image = R.drawable.img,
                rating = 5.5,
                description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"
            ),
            Movie(
                id = 2,
                title = "House of the Dragon",
                image = R.drawable.img_1,
                rating = 5.5,
                description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"
            ),
            Movie(
                id = 3,
                title = "Barbarian",
                image = R.drawable.img_2,
                rating = 5.5,
                description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"
            ),
            Movie(
                id = 4,
                title = "Doctor Strange in the Multiverse of Madness",
                image = R.drawable.img_3,
                rating = 5.5,
                description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"
            ),
            Movie(
                id = 5,
                title = "Fullmetal Alchemist: The Final Alchemy",
                image = R.drawable.img_4,
                rating = 5.5,
                description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"
            )
        ),

        listOf(
            Movie(
                id = 6,
                title = "The Host",
                image = R.drawable.img_5,
                rating = 5.5,
                description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"
            ),
            Movie(
                id = 7,
                title = "A Monster Calls",
                image = R.drawable.img_6,
                rating = 5.5,
                description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"
            ),
            Movie(
                id = 8,
                title = "I Spit on Your Grave III: Vengeance is Mine",
                image = R.drawable.img_7,
                rating = 5.5,
                description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"
            ),
            Movie(
                id = 9,
                title = "The Divine Fury",
                image = R.drawable.img_8,
                rating = 5.5,
                description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"
            ),
            Movie(
                id = 10,
                title = "Satan's Slaves",
                image = R.drawable.img_9,
                rating = 5.5,
                description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"
            )
        ),

        listOf(
            Movie(
                id = 11,
                title = "Enola Holmes 2",
                image = R.drawable.img_10,
                rating = 5.5,
                description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"
            ),
            Movie(
                id = 12,
                title = "Causeway",
                image = R.drawable.img_11,
                rating = 5.5,
                description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"
            ),
            Movie(
                id = 13,
                title = "My Policeman",
                image = R.drawable.img_12,
                rating = 5.5,
                description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"
            ),
            Movie(
                id = 14,
                title = "Overdose",
                image = R.drawable.img_13,
                rating = 5.5,
                description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"
            ),
            Movie(
                id = 15,
                title = "See How They Run",
                image = R.drawable.img_14,
                rating = 5.5,
                description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"
            )
        ),
    )
}