package com.example.mvvvm_demo.data.model

import com.example.mvvvm_demo.data.model.network.QuoteService
import javax.inject.Inject


// @Inject constructor for dependencies injection
class QuoteRepository @Inject constructor(
    private val api: QuoteService,
    private val quoteProvider: QuoteProvider
) {

    suspend fun getAllQuotes():List<QuoteModel>{
        val response = api.getQuotes()
        quoteProvider.quotes = response
        return response
    }
}