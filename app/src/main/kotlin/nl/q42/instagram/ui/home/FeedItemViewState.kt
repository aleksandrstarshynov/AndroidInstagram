package nl.q42.instagram.ui.home

import androidx.annotation.DrawableRes

data class FeedItemViewState(
    val authorName: String,
    val authorDescription: String,
    val authorImage: Int,
    val postDescription: String,
    @DrawableRes val postImageId: Int,
    val numberOfLikes: Int,
    val canFollow: Boolean = true,
    val canLike: Boolean = true,
)