package com.example.personalhealth.api.responses

class DietListApiResponse(
    val id: Long,
    val name: String,
    val nutrition: DietListResponse
)

/*

{
  "id": 9266,
  "original": "pineapples",
  "originalName": "pineapples",
  "name": "pineapples",
  "amount": 1,
  "unit": "",
  "unitShort": "",
  "unitLong": "",
  "possibleUnits": [
    "piece",
    "slice",
    "fruit",
    "g",
    "oz",
    "cup",
    "serving"
  ],
  "estimatedCost": {
    "value": 299,
    "unit": "US Cents"
  },
  "consistency": "solid",
  "shoppingListUnits": [
    "pieces"
  ],
  "aisle": "Produce",
  "image": "pineapple.jpg",
  "meta": [],
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

 */