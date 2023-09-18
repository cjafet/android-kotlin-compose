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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.composenavigation.R
import br.com.fiap.composenavigation.viewmodel.HomeScreenViewModel
import java.util.Collections

@Composable
fun DetailCard(recommendationId: Int, navController: NavController, homeScreenViewModel: HomeScreenViewModel) {

    val recommendations by homeScreenViewModel.recommendations.observeAsState(initial = Collections.emptyList())
    val recommendation = recommendations[recommendationId]

    Column(modifier = Modifier
        .fillMaxWidth()
        .height(460.dp)
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
                    text = String.format(stringResource(id = R.string.closing), " \t ${recommendation.closing}"),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Spacer(Modifier.height(16.dp))
                Text(
                    text = String.format(stringResource(id = R.string.min), " \t ${recommendation.min}%"),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Spacer(Modifier.height(16.dp))
                Text(
                    text = String.format(stringResource(id = R.string.max), " \t ${recommendation.max}%"),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Spacer(Modifier.height(16.dp))
                Text(
                    text = String.format(stringResource(id = R.string.potential), " \t ${recommendation.potential}%"),
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
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = R.string.back.toString())
            Text(text = stringResource(id = R.string.back), fontSize = 16.sp, color = Color.White)
        }
    }
}