package com.example.countryexample.network

import com.example.countryexample.data.Country
import retrofit2.Call
import retrofit2.http.GET

interface CountryApiService {
    @GET("v2/all")
    fun getProperties():
            Call<List<Country>>
}