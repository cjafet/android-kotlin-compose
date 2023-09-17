package br.com.fiap.composenavigation.screens

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.ui.Alignment;
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.composenavigation.R
import br.com.fiap.composenavigation.components.MenuItem
import br.com.fiap.composenavigation.components.RecommendationCard

@Composable
fun MenuScreen(navController: NavController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF009688))
        .padding(top = 0.dp)
        .verticalScroll(state = ScrollState(0), enabled = true)
    ) {
        Column(modifier = Modifier
            .align(Alignment.Start)
            .padding(start = 6.dp)) {
            // header
            Row {
                Button(
                    onClick = { /* ... */ },
                    shape = RectangleShape,
                    contentPadding = PaddingValues(10.dp)
                ) {
                    Column() {
                        Icon(
                            imageVector = Icons.Default.Menu,
                            contentDescription = "Menu",
                            modifier = Modifier
                                .size(20.dp)
                                .align(Alignment.CenterHorizontally)
                        )
                    }
                }
                Column(modifier = Modifier.padding(start = 60.dp, top = 4.dp, end = 50.dp)) {
                    Text(
                        text = "SmartTrade",
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                    )
                }
                Column(
                    modifier = Modifier.padding(top = 12.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "Menu",
                        modifier = Modifier
                            .size(26.dp),
                        tint = Color.White
                    )
                }
            }
        }

        Row(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF2629B3))
            ){
                // body
                Column {
                    Text(
                        text = "Olá, Carlos!",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        modifier = Modifier
                            .padding(start = 8.dp,top = 18.dp)
                    )
                    Row(
                        horizontalArrangement = Arrangement.SpaceAround,
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Column(modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .padding(top = 16.dp)) {
                            MenuItem(title = "Carteira", id = R.drawable.baseline_wallet_24)
                        }
                        Column(modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .padding(top = 10.dp)) {
                            MenuItem(title = "Recomendações", id = R.drawable.baseline_bar_chart_24)
                        }
                        Column(modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .padding(top = 10.dp)) {
                            MenuItem(title = "Artigos", id = R.drawable.baseline_article_24)
                        }
                    }
                }
                Spacer(Modifier.height(18.dp))
                RecommendationCard(stock = "TWKS", closing = "7.04", potential = "0.32")
                RecommendationCard(stock = "DDOG", closing = "65.83", potential = "0.45")
                RecommendationCard(stock = "GTBL", closing = "33.40", potential = "0.47")
                RecommendationCard(stock = "TSLA", closing = "185.06", potential = "0.51")
                Spacer(Modifier.height(16.dp))
                Column(modifier = Modifier.align(Alignment.CenterHorizontally)) {
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(
                        onClick = { navController.navigate("login") },
                        colors = ButtonDefaults.buttonColors(Color.White),
                        shape = RectangleShape,
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.SpaceAround,
                            modifier = Modifier
                                .fillMaxWidth()
                                .border(width = 4.dp, color = Color.White)
                        ) {
                            Button(
                                onClick = { navController.navigate("login") },
                                colors = ButtonDefaults.buttonColors(Color.White),
                                shape = RectangleShape
                            ) {
                                Text(text = "voltar", fontSize = 16.sp, color = Color.DarkGray)
                            }
                            Button(
                                onClick = { navController.navigate("login") },
                                colors = ButtonDefaults.buttonColors(Color.White),
                                shape = RectangleShape,
                            ) {
                                Text(text = "sair", fontSize = 16.sp, color = Color.DarkGray)
                            }
                        }
                    }
                }
            }
        }
    }
}