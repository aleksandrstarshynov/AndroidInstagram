package nl.q42.instagram.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import nl.q42.instagram.ui.data.dummyViewState
import nl.q42.instagram.ui.theme.AppTheme

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
@Preview
private fun HomePreview() {
    AppTheme {
        Home(viewState = dummyViewState)
    }
}