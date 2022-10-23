package com.example.mvvvm_demo.data.model.network

import com.example.mvvvm_demo.core.RetrofitHelper
import com.example.mvvvm_demo.data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class QuoteService @Inject constructor(private val api: QuoteApiClient){


    suspend fun getQuotes():List<QuoteModel>{
        // return the list in a sedondary thread
        return withContext(Dispatchers.IO){
            // call the methos in the api client m
            val response = api.getAllQuotes()
            response.body() ?: emptyList()
        }

    }
}