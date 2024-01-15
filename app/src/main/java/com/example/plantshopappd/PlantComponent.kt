package com.example.plantshopappd

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
import androidx.compose.material.icons.outlined.MoreVert
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TopPartSurface() {
    Column(
        Modifier
            .fillMaxWidth()
            .height(450.dp)
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            BackgroundPicTop()
            Column(
                Modifier
                    .fillMaxSize()
                    .padding(10.dp)
            ) {
                ArrowBackMoreVert()
                TitleBarShop()
                Spacer(modifier = Modifier.height(20.dp))
                NameTitle()
                SizeTitle()
                Spacer(modifier = Modifier.height(10.dp))
                PriceTitle()
                Spacer(modifier = Modifier.height(20.dp))
                ImageFlower()
                BackForwardButton()
            }
        }
    }
}

@Composable
fun DownPartSurface() {

    Row(
        Modifier
            .fillMaxWidth()
            .width(210.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        FirstFlower()
        SecondFlower()
        ThirdFlower()
    }
}

@Composable
private fun BackForwardButton() {
    Row(
        Modifier
            .fillMaxWidth()
            .absoluteOffset(0.dp, (30).dp)
            .padding(55.dp, 0.dp),
        Arrangement.SpaceBetween
    ) {
        IconButton(
            onClick = {},
            modifier = Modifier
                .size(45.dp)
                .clip(CircleShape)
                .background(Color(0xFF01714E))
        ) {
            Icon(
                imageVector = Icons.Outlined.ArrowBack,
                contentDescription = "",
                tint = Color.White,
                modifier = Modifier.size(25.dp),
            )
        }

        IconButton(
            onClick = {},
            modifier = Modifier
                .size(45.dp)
                .clip(CircleShape)
                .background(Color(0xFF01714E))
        ) {
            Icon(
                imageVector = Icons.Outlined.ArrowForward,
                contentDescription = "",
                tint = Color.White,
                modifier = Modifier.size(25.dp),
            )
        }
    }
}

@Composable
private fun ImageFlower() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.Bottom
    ) {
        Image(
            painter = painterResource(id = R.drawable.flower_3),
            contentDescription = "",
            contentScale = ContentScale.Crop
        )
    }
}

@Composable
private fun NameTitle() {
    Text(
        text = "نام گل: ژیمام",
        style = MaterialTheme.typography.headlineLarge,
        color = Color.White,
        modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center
    )
}

@Composable
private fun SizeTitle() {
    Text(
        text = "اندازه:  متوسط",
        style = MaterialTheme.typography.headlineSmall,
        color = Color.White,
        textAlign = TextAlign.Center,
        modifier = Modifier.fillMaxWidth(),
    )
}

@Composable
private fun PriceTitle() {
    Text(
        text = "قیمت:   230,000  تومان",
        style = MaterialTheme.typography.headlineLarge,
        color = Color.White,
        textAlign = TextAlign.Center,
        modifier = Modifier.fillMaxWidth(),
    )
}


@Composable
private fun TitleBarShop() {
    Text(

        text = "فروشگاه گل و گیاه منصوری",
        style = MaterialTheme.typography.headlineLarge,
        color = Color.White,
        modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center
    )
}

@Composable
fun BackgroundPicTop() {
    Image(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        painter = painterResource(id = R.drawable.background),
        contentDescription = null,
        contentScale = ContentScale.FillBounds
    )
}

@Composable
private fun ArrowBackMoreVert() {
    Row(
        Modifier
            .fillMaxWidth()
            .height(40.dp),
        Arrangement.SpaceBetween
    ) {
        IconButton(onClick = {}) {
            Icon(
                imageVector = Icons.Outlined.ArrowBack,
                contentDescription = "",
                modifier = Modifier.size(25.dp),
                tint = Color.White
            )
        }
        IconButton(onClick = {}) {
            Icon(
                imageVector = Icons.Outlined.MoreVert,
                contentDescription = "",
                modifier = Modifier.size(25.dp),
                tint = Color.White,
            )
        }
    }
}


@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun SearchBox() {
    Box(
        Modifier
            .fillMaxWidth()
            .padding(start = 24.dp, end = 24.dp, top = 8.dp, bottom = 8.dp),
        Alignment.TopCenter
    ) {
        var txt by remember { mutableStateOf("") }

        TextField(
            value = txt,
            onValueChange = { txt = it },
            label = {
                Text(
                    text = "جست و جو",
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF05986A)
                )
            },
            shape = CircleShape,
            colors = TextFieldDefaults.textFieldColors(
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
            ),
            trailingIcon = {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = "",
                    tint = Color(0xFF05986A)
                )
            },
            modifier = Modifier
                .width(350.dp)
        )
    }
}


@Composable
private fun ThirdFlower() {
    Card(Modifier.clip(RoundedCornerShape(0.dp))) {
        Column(
            Modifier.size(150.dp, 200.dp)
                .background(Color(0xFF01714E))
        ) {
            Column(
                Modifier.size(150.dp, 130.dp),
                verticalArrangement = Arrangement.Bottom
            ) {
                Image(
                    painter = painterResource(id = R.drawable.flower_4),
                    contentDescription = "",
                )
            }
            Column(
                modifier = Modifier.size(150.dp, 70.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "آدنیوم", color = Color.White)
                Text(text = "88,000", color = Color.White)
            }
        }
    }
}

@Composable
private fun SecondFlower() {
    Card(Modifier
        .clip(RoundedCornerShape(0.dp))
    ) {

        Column(
            Modifier.size(150.dp, 200.dp)
                .background(Color(0xFF01714E))
        ) {
            Column(
                Modifier.size(150.dp, 130.dp),
                verticalArrangement = Arrangement.Bottom
            ) {
                Image(
                    painter = painterResource(id = R.drawable.flower_5),
                    contentDescription = "",
                )
            }
            Column(
                modifier = Modifier.size(150.dp, 70.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "آزاله", color = Color.White)
                Text(text = "96,000", color = Color.White)
            }
        }
    }
}

@Composable
private fun FirstFlower() {
    Card(
        Modifier
            .clip(RoundedCornerShape(0.dp)),
    ) {

        Column(
            Modifier.size(150.dp, 200.dp)
                .background(Color(0xFF01714E))
        ) {
            Column(
                Modifier.size(150.dp, 130.dp),
                verticalArrangement = Arrangement.Bottom
            ) {
                Image(
                    painter = painterResource(id = R.drawable.flower_8),
                    contentDescription = "",
                )
            }
            Column(
                modifier = Modifier.size(150.dp, 70.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "ارانتیس", color = Color.White)
                Text(text = "87,000", color = Color.White)
            }
        }
    }
}


@Composable
fun DetailsPage() {

    Column(Modifier.fillMaxSize()) {
        Column(
            Modifier
                .fillMaxWidth()
                .height(200.dp)
        ) {
            Card(Modifier.clip(RoundedCornerShape(0.dp))) {
                Image(
                    painter = painterResource(id = R.drawable.background_1),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds
                )

                Column(
                    Modifier
                        .fillMaxSize()
                        .padding(10.dp)
                ) {
                    ArrowBackMoreVert()

                    Column(Modifier.padding(30.dp), Arrangement.Bottom) {
                        Text(
                            text = "Details",
                            style = MaterialTheme.typography.bodySmall,
                            color = Color.White,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(40.dp))

        Row(
            Modifier
                .fillMaxWidth()
                .height(30.dp)
                .padding(start = 20.dp)
        ) {

            Text(
                text = "Reviews",
                style = MaterialTheme.typography.titleMedium,
                color = Color(0xFF555555),
                fontWeight = FontWeight.Bold,
                modifier = Modifier.weight(0.25F),
                textAlign = TextAlign.Start
            )

            Text(
                text = "Family",
                style = MaterialTheme.typography.titleMedium,
                color = Color(0xFF555555),
                fontWeight = FontWeight.Bold,
                modifier = Modifier.weight(0.25F),
                textAlign = TextAlign.Start
            )

            Text(
                text = "Size",
                style = MaterialTheme.typography.titleMedium,
                color = Color(0xFF555555),
                fontWeight = FontWeight.Bold,
                modifier = Modifier.weight(0.25F),
                textAlign = TextAlign.Start
            )

            Text(
                text = "Category",
                style = MaterialTheme.typography.titleMedium,
                color = Color(0xFF555555),
                fontWeight = FontWeight.Bold,
                modifier = Modifier.weight(0.25F),
                textAlign = TextAlign.Start
            )

        }

        Row(
            Modifier
                .fillMaxWidth()
                .height(30.dp)
                .padding(start = 20.dp)
        ) {

            Row(Modifier.weight(0.25F)) {
                for (i in 1..5) {
                    Icon(
                        imageVector = Icons.Filled.Star,
                        contentDescription = "",
                        modifier = Modifier.size(20.dp),
                        tint = Color(0xFFFFB42D)
                    )
                }
            }

            Text(
                text = "Gimberg",
                style = MaterialTheme.typography.titleMedium,
                color = Color(0xFF05986A),
                modifier = Modifier.weight(0.25F),
                textAlign = TextAlign.Start
            )

            Text(
                text = "Height: 62 Inc",
                style = MaterialTheme.typography.titleMedium,
                color = Color(0xFF05986A),
                modifier = Modifier.weight(0.25F),
                textAlign = TextAlign.Start
            )

            Text(
                text = "Indor",
                style = MaterialTheme.typography.titleMedium,
                color = Color(0xFF05986A),
                modifier = Modifier.weight(0.25F),
                textAlign = TextAlign.Start
            )

        }

        Spacer(modifier = Modifier.height(20.dp))

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Card(
                Modifier
                    .height(500.dp)
                    .clip(CircleShape)
            ) {
                Column(
                    modifier = Modifier
                        .clip(CircleShape)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Card(
                        Modifier
                            .size(500.dp, 500.dp)
                            .clip(CircleShape)
                    ) {
                        Column(Modifier.clip(CircleShape)) {
                            Image(
                                painter = painterResource(id = R.drawable.flower_5),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(500.dp)
                                    .background(Color(0xFFEEEEEE)),
                            )
                        }
                    }
                }

                Box(
                    Modifier
                        .fillMaxWidth()
                        .padding(bottom = 100.dp), Alignment.BottomEnd
                ) {
                    Button(
                        onClick = {},
                        shape = RoundedCornerShape(
                            topStart = 48.dp,
                            bottomStart = 48.dp
                        ),
                        colors = ButtonDefaults.buttonColors(
                            //backgroundColor = Color(0xFF05986A),
                            contentColor = Color.White,
                        ),
                        modifier = Modifier
                            .shadow(
                                elevation = 5.dp,
                                shape = RoundedCornerShape(
                                    topStart = 48.dp,
                                    bottomStart = 48.dp
                                ),
                                clip = true
                            )
                    ) {
                        Text(
                            text = "Price: $200",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(12.dp)
                        )
                    }
                }
            }

        }

        Spacer(modifier = Modifier.height(20.dp))

        Column(Modifier.weight(1F)) {
            Text(
                text = "Details",
                style = MaterialTheme.typography.headlineMedium,
                color = Color(0xFF555555),
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp),
                textAlign = TextAlign.Start
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "A flower, sometimes known as a bloom or blossom, is the reproductive structure found in flowering plants (plants of the division Magnoliophyta, also called angiosperms).",
                style = MaterialTheme.typography.titleMedium,
                color = Color(0xFF888888),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp),
                textAlign = TextAlign.Start
            )
        }

        Row(
            Modifier
                .height(65.dp)
                .fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(0.85F)
                    .background(Color(0xFF05986A)),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "BUY IT NOW", color = Color.White)
            }


            Row(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(0.15F)
                    .background(Color(0xFF01714E)),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Outlined.FavoriteBorder,
                        contentDescription = "",
                        modifier = Modifier.size(35.dp),
                        tint = Color.White
                    )
                }
            }
        }

    }
}




