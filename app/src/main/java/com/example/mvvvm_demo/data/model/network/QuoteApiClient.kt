package com.example.mvvvm_demo.data.model.network

import com.example.mvvvm_demo.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET

interface QuoteApiClient {

    @GET("/.json")
    suspend fun getAllQuotes():Response<List<QuoteModel>>
}