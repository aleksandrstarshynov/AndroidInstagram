package nl.q42.instagram.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import nl.q42.instagram.ui.theme.AppTheme
import nl.q42.instagram.ui.theme.PreviewLightDark

data class HomeViewState(
    val feedItems: List<FeedItemViewState>
)

@Composable
fun Home(viewState: HomeViewState) {
    Column {
        Text("Hello world!")
    }
}

@Composable
@PreviewLightDark
private fun HomePreview() {
    AppTheme {
        Home(viewState = HomeViewState(listOf()))
    }
}
