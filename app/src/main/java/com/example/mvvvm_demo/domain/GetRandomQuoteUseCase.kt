package com.example.mvvvm_demo.domain

import com.example.mvvvm_demo.data.model.QuoteModel
import com.example.mvvvm_demo.data.model.QuoteProvider
import com.example.mvvvm_demo.data.model.QuoteRepository
import javax.inject.Inject

class GetRandomQuoteUseCase @Inject constructor(
    private val quoteProvider: QuoteProvider
) {


    operator fun invoke():QuoteModel?{
        val quotes = quoteProvider.quotes
        if(!quotes.isNullOrEmpty()){
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }
}