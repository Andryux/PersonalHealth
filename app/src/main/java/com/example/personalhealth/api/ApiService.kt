package com.example.personalhealth.api

import com.example.personalhealth.BASE_URL
import com.example.personalhealth.GET_NUTRIENTS_URL
import com.example.personalhealth.api.responses.DietListApiResponse
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

private val retrofit = Retrofit.Builder()
    .baseUrl(BASE_URL)
    .addConverterFactory(MoshiConverterFactory.create())
    .build()

interface ApiService{
    @GET(GET_NUTRIENTS_URL)
    suspend fun getAllNutrients(): DietListApiResponse
}

object DietsApi{
    val retrofitService: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}