package br.com.fiap.composenavigation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MenuItem(title: String, id: Int) {
    Button(
        onClick = { /* ... */ },
        shape = RectangleShape,
        contentPadding = PaddingValues(20.dp)
    ) {
        Column() {
            Icon(
                painter = painterResource(id = id),
                contentDescription = "$title",
                modifier = Modifier
                    .size(20.dp)
                    .align(Alignment.CenterHorizontally)
            )
            Text(text = "$title", fontSize = 16.sp, color = Color.White)
        }
    }
}