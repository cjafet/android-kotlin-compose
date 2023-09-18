package br.com.fiap.composenavigation.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.composenavigation.R

@Composable
fun Footer(navController: NavController) {
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
                shape = RectangleShape,
            ) {
                Text(text = stringResource(id = R.string.exit), fontSize = 16.sp, color = Color.DarkGray)
            }
        }
    }
}