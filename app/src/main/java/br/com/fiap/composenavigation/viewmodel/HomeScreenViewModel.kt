package br.com.fiap.composenavigation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.fiap.composenavigation.model.Recommendation
import br.com.fiap.composenavigation.repository.RecommendationRepository

class HomeScreenViewModel: ViewModel() {
    private val repository = RecommendationRepository()
    private val _recommendations = MutableLiveData<List<Recommendation>>(fetchRecommendations())
    val recommendations: LiveData<List<Recommendation>> = _recommendations

    private fun fetchRecommendations(): List<Recommendation> {
        return repository.getAllRecommendations()
    }
}