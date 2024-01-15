package com.example.plantshopappd

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.ArrowForward
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.MoreVert
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.plantshopappd.ui.theme.PlantShopAppDTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlantShopAppDTheme {
                PlantPage()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PlantPage() {

    Column(
        Modifier
            .fillMaxSize()
            .background(Color.White)) {

        TopPartSurface()
        Spacer(modifier = Modifier.height(40.dp))
        SearchBox()
        Spacer(modifier = Modifier.height(10.dp))

        Row(
            Modifier.weight(1F)
        ) {
            DownPartSurface()
        }


        var clickedItem by remember { mutableStateOf("place") }
        BottomAppBar {

            Spacer(modifier = Modifier.weight(0.2F, true))

            IconButton(onClick = {
                clickedItem = "Favorite"
            }) {
                Icon(
                    imageVector = Icons.Outlined.FavoriteBorder,
                    contentDescription = "",
                    modifier = Modifier.size(25.dp)
                )
            }

            Spacer(modifier = Modifier.weight(1F, true))

            IconButton(onClick = {
                clickedItem = "ShoppingCart"
            }) {
                Icon(
                    imageVector = Icons.Outlined.ShoppingCart,
                    contentDescription = "",
                    modifier = Modifier.size(25.dp)
                )
            }

            Spacer(modifier = Modifier.weight(1F, true))

            IconButton(onClick = {
                clickedItem = "Home"
            }) {
                Icon(
                    imageVector = Icons.Outlined.Home,
                    contentDescription = "",
                    modifier = Modifier.size(25.dp)
                )
            }

            Spacer(modifier = Modifier.weight(1F, true))

            IconButton(onClick = {
                clickedItem = "Info"
            }) {
                Icon(
                    imageVector = Icons.Outlined.Info,
                    contentDescription = "",
                    modifier = Modifier.size(25.dp)
                )
            }

            Spacer(modifier = Modifier.weight(1F, true))

            Column(
                Modifier
                    .clip(CircleShape)
                    .size(25.dp)
                    .background(Color.White)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.img),
                    contentDescription = ""
                )
            }

            Spacer(modifier = Modifier.weight(0.2F, true))

        }
    }
}
