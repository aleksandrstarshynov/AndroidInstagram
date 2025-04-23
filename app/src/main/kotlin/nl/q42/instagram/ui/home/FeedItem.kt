package nl.q42.instagram.ui.home

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import nl.q42.instagram.ui.theme.AppTheme
import nl.q42.instagram.ui.theme.PreviewLightDark

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

@Composable
fun FeedItem() {
}

@Composable
@PreviewLightDark
private fun FeedItemPreview() {
    AppTheme {
        FeedItem()
    }
}