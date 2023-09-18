package br.com.fiap.composenavigation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import br.com.fiap.composenavigation.model.Recommendation

@Composable
fun RecommendationCard(
    recommendation: Recommendation,
    navController: NavController
) {
    Text(
        text = recommendation.stock,
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
            .height(120.dp),
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
            Row {
                Column(modifier = Modifier.width(180.dp).align(Alignment.CenterVertically)) {
                    Text(
                        text = "Fechamento: \t ${recommendation.closing}",
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Spacer(Modifier.height(16.dp))
                    Text(
                        text = "Potencial: \t ${recommendation.potential}%",
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Spacer(Modifier.height(8.dp))
                }
                Column(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(start = 30.dp)
                ) {
                    Button(
                        onClick = { navController.navigate("detail/${recommendation.id}") },
                        modifier = Modifier.align(Alignment.Start),
                        shape = RectangleShape,
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent,Color.White),
                    ) {
                        Text(text = "+info", fontSize = 22.sp, color = Color.White)
                    }
                }
            }
        }
    }
    Spacer(modifier = Modifier.height(18.dp))
}