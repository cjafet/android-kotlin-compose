package br.com.fiap.composenavigation.screens

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.Alignment
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.composenavigation.components.DetailCard
import br.com.fiap.composenavigation.components.Footer
import br.com.fiap.composenavigation.components.Header
import br.com.fiap.composenavigation.components.Menu

@Composable
fun DetailScreen(navController: NavController, recommendationId: Int) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF009688))
        .padding(top = 0.dp)
        .verticalScroll(state = ScrollState(0), enabled = true)
    ) {
        Column(modifier = Modifier
            .align(Alignment.Start)
            .padding(start = 6.dp)
        ) {
            Row {
                Header()
            }
        }

        Row(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF2629B3))
            ){
                Column {
                    Text(
                        text = "Olá, Carlos!",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        modifier = Modifier
                            .padding(start = 8.dp,top = 18.dp)
                    )
                    Menu()
                }
                Spacer(Modifier.height(18.dp))
                // DetailCard Component
                DetailCard(recommendationId, navController)
                Spacer(Modifier.height(16.dp))
                Column(modifier = Modifier.align(Alignment.CenterHorizontally)) {
                    Footer(navController)
                }
            }
        }
    }
}