package com.example.plantshopappd

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.plantshopappd.ui.theme.PlantShopAppDTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlantShopAppDTheme {
                //PlantPage()
                DetailsPage()
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
