package nl.q42.instagram.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import nl.q42.instagram.ui.data.dummyViewState
import nl.q42.instagram.ui.theme.AppTheme
import nl.q42.instagram.ui.theme.Love
import nl.q42.instagram.ui.theme.Purple40

data class HomeViewState(
    val feedItems: List<FeedItemViewState>
)

@Composable
fun Home(viewState: HomeViewState) {
    Column(Modifier.padding(top = 30.dp)) {
        Text(
            text="Instanimal",
            modifier = Modifier.padding(10.dp),
            style = MaterialTheme.typography.headlineMedium
        )
        HorizontalDivider( )
        ItemsColumn(viewState)
    }
}

@Composable
private fun ItemsColumn(viewState: HomeViewState) {
    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp),
        modifier = Modifier
            .padding(top = 10.dp)
            .verticalScroll(rememberScrollState())
    )
    {
        viewState.feedItems.forEach { item ->
            Item(item)
        }
    }
    Love()
}

@Composable
private fun Item(item: FeedItemViewState) {

    Row(horizontalArrangement = Arrangement
        .spacedBy(10.dp),
        modifier = Modifier.padding(start = 10.dp)
    ) {
        Image(
            painter = painterResource(item.authorImage),
            contentDescription = item.authorDescription,
            modifier = Modifier
                .clip(CircleShape)
                .border(width = 2.dp,
                shape = CircleShape,
                brush = Brush.linearGradient(listOf(Color.Magenta, Color.Red)))
                .size(54.dp),
        contentScale = ContentScale.Crop
        )
         Column {
        Text(text = item.authorName, fontWeight = FontWeight.Bold)
        Text(text = item.authorDescription)
    }}
    Image(
        painter = painterResource(item.postImageId),
        contentDescription = item.postDescription,
        modifier = Modifier.fillMaxWidth(),
        contentScale = ContentScale.FillWidth
    )
    HorizontalDivider()
}

@Composable
@Preview(showBackground = true)
private fun HomePreview() {
    AppTheme {
        Home(viewState = dummyViewState)
    }
}