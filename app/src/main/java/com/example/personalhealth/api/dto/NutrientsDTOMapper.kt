package com.example.personalhealth.api.dto

import com.example.personalhealth.Nutrients

class NutrientsDTOMapper {

    private fun fromNutrientDTOToNutrientsDomain(nutrientsDTO: NutrientsDTO): Nutrients {
        return Nutrients(
            nutrientsDTO.name,
            nutrientsDTO.amount,
            nutrientsDTO.unit,
            nutrientsDTO.percentOfDailyNeeds
        )
    }

    fun fromDogDTOListToNutrientDomainList(nutrientsDTOList: List<NutrientsDTO>): List<Nutrients> {
        return nutrientsDTOList.map { fromNutrientDTOToNutrientsDomain(it) }
    }
}