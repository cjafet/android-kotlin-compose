package br.com.fiap.composenavigation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import br.com.fiap.composenavigation.R

@Composable
fun Menu() {
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Column(modifier = Modifier
            .align(Alignment.CenterVertically)
            .padding(top = 16.dp)) {
            MenuItem(title = stringResource(id = R.string.wallet), id = R.drawable.baseline_wallet_24)
        }
        Column(modifier = Modifier
            .align(Alignment.CenterVertically)
            .padding(top = 16.dp)) {
            MenuItem(title = stringResource(id = R.string.recommendation), id = R.drawable.baseline_bar_chart_24)
        }
        Column(modifier = Modifier
            .align(Alignment.CenterVertically)
            .padding(top = 16.dp)) {
            MenuItem(title = stringResource(id = R.string.articles), id = R.drawable.baseline_article_24)
        }
    }
}