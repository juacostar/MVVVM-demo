package com.example.mvvvm_demo.data.model.network

import com.example.mvvvm_demo.core.RetrofitHelper
import com.example.mvvvm_demo.data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class QuoteService {

    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getQuotes():List<QuoteModel>{
        // return the list in a sedondary thread
        return withContext(Dispatchers.IO){
            // call the methos in the api client m
            val response = retrofit.create(QuoteApiClient::class.java).getAllQuotes()
            response.body() ?: emptyList()
        }

    }
}