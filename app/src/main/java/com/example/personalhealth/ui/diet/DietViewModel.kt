package com.example.personalhealth.ui.diet

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.personalhealth.Nutrients
import kotlinx.coroutines.launch

class DietViewModel : ViewModel(){

    private val _nutrientsList = MutableLiveData<List<Nutrients>>()
    val nutrientsList : LiveData<List<Nutrients>>
        get() = _nutrientsList

    private val dietRepository = DietRepository()
    init {
        downloadNutrients()
    }

    private fun downloadNutrients() {
        viewModelScope.launch {
            _nutrientsList.value = dietRepository.downloadNutrients()
        }
    }
}