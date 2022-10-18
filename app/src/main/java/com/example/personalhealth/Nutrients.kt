package com.example.personalhealth

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Nutrients(
    val name: String,
    val amount: Double,
    val unit: String,
    val percentOfDailyNeeds: Double
) : Parcelable

/*

  "nutrition": {
    "nutrients": [
      {
        "name": "Calories",
        "amount": 452.5,
        "unit": "cal",
        "percentOfDailyNeeds": 22.63
      },
      {
        "name": "Fat",
        "amount": 1.09,
        "unit": "g",
        "percentOfDailyNeeds": 1.67
      },
      {
        "name": "Saturated Fat",
        "amount": 0.08,
        "unit": "g",
        "percentOfDailyNeeds": 0.51
      },

 */