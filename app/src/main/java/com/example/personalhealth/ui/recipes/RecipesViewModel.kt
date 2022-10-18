package com.example.personalhealth.ui.recipes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.personalhealth.Nutrients
import kotlinx.coroutines.launch

class RecipesViewModel : ViewModel(){

    private val _nutrientsList = MutableLiveData<List<Nutrients>>()
    val nutrientsList : LiveData<List<Nutrients>>
        get() = _nutrientsList

    private val recipesRepository = RecipesRepository()
    init {
        downloadNutrients()
    }

    private fun downloadNutrients() {
        viewModelScope.launch {
            _nutrientsList.value = recipesRepository.downloadNutrients()
        }
    }
}