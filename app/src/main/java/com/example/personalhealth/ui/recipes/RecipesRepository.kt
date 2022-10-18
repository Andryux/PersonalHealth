package com.example.personalhealth.ui.recipes

import com.example.personalhealth.Nutrients
import com.example.personalhealth.api.DietsApi.retrofitService
import com.example.personalhealth.api.dto.NutrientsDTOMapper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class RecipesRepository {

    suspend fun downloadNutrients(): List<Nutrients> {
        return withContext(Dispatchers.IO) {
            val dietListApiResponse = retrofitService.getAllNutrients()
            val nutrientsDTOList = dietListApiResponse.nutrition.nutrients
            val nutrientsDTOMapper = NutrientsDTOMapper()
            nutrientsDTOMapper.fromDogDTOListToNutrientDomainList(nutrientsDTOList)
        }
    }
}