package br.com.fiap.composenavigation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.composenavigation.repository.RecommendationRepository

@Composable
fun DetailCard(recommendationId: Int, navController: NavController) {
    val repository = RecommendationRepository()
    val recommendation = repository.getRecommendation(recommendationId)

    Column(modifier = Modifier
        .fillMaxWidth()
        .height(460.dp)
    ) {
        Text(
            text = repository.getRecommendation(recommendationId).stock,
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.padding(start = 32.dp)
        )
        Spacer(Modifier.height(14.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 24.dp, end = 24.dp)
                .height(200.dp),
            colors = CardDefaults
                .cardColors(containerColor = Color(0xFF2629B3)),
            elevation = CardDefaults.cardElevation(12.dp)
        ) {
            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .align(alignment = Alignment.Start)
                    .padding(start = 16.dp, top = 24.dp)
            ) {
                Text(
                    text = "Fechamento: \t ${recommendation.closing}",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Spacer(Modifier.height(16.dp))
                Text(
                    text = "Min: \t ${recommendation.min}%",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Spacer(Modifier.height(16.dp))
                Text(
                    text = "Max: \t ${recommendation.max}%",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Spacer(Modifier.height(16.dp))
                Text(
                    text = "Potencial: \t ${recommendation.potential}%",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )

            }
        }
        Spacer(modifier = Modifier.height(18.dp))
        Button(
            onClick = { navController.navigate("home") },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent,Color.White),
            shape = RectangleShape,
            modifier = Modifier.padding(start = 16.dp)
        ) {
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "voltar")
            Text(text = " voltar", fontSize = 16.sp, color = Color.White)
        }
    }
}