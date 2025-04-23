package nl.q42.instagram.ui.data

import nl.q42.instagram.R
import nl.q42.instagram.ui.home.FeedItemViewState
import nl.q42.instagram.ui.home.HomeViewState

val dummyBunnyItemViewState = FeedItemViewState(
    authorName = "nature._.images",
    authorDescription = "Cute Animals",
    authorImage = R.drawable.author_nature,
    postDescription = "What is your favourite image? \uD83D\uDE0D 1,2,3,4 or ?", // TODO search on emoticons: all fonts/android versions?
    postImageIds = listOf(R.drawable.post_nature, R.drawable.bunny2),
    numberOfLikes = 2_374_585,
)

val dummyCatItemViewState = FeedItemViewState(
    authorName = "cats_online",
    authorDescription = "Cats!",
    authorImage = R.drawable.cat_profile,
    postDescription = "Awww, look at these kitties",
    postImageIds = listOf(R.drawable.eli, R.drawable.stijn, R.drawable.eli2),
    numberOfLikes = 133_742,
)

val dummyDogItemViewState = FeedItemViewState(
    authorName = "puppers",
    authorDescription = "Awooo!",
    authorImage = R.drawable.dog_profile,
    postDescription = "Woof!",
    postImageIds = listOf(R.drawable.husky), // R.drawable.sheppy, R.drawable.sleepydog,
    numberOfLikes = 42_424_242,
)

val dummyViewState = HomeViewState(
    feedItems = listOf(dummyBunnyItemViewState, dummyCatItemViewState, dummyDogItemViewState)
)
