package br.com.fiap.composenavigation.repository

import br.com.fiap.composenavigation.model.Recommendation

open class RecommendationRepository {

    val recommendations = listOf(
        Recommendation(id = 0, stock = "TWKS", closing = "7.04", potential = "0.32", min = "6.56", max = "21.67"),
        Recommendation(id = 1, stock = "DDOG", closing = "65.83", potential = "0.45", min = "61.34", max = "145.19"),
        Recommendation(id = 2, stock = "TSLA", closing = "185.06", potential = "0.51", min = "101.80", max = "364.07"),
        Recommendation(id = 3, stock = "TEAM", closing = "158.54", potential = "0.53", min = "113.86", max = "300.29")
    )

    open fun getAllRecommendations(): List<Recommendation> {
        return recommendations
    }
}