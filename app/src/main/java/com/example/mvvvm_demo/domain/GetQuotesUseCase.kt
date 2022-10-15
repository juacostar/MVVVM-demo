package com.example.mvvvm_demo.domain

import com.example.mvvvm_demo.data.model.QuoteModel
import com.example.mvvvm_demo.data.model.QuoteRepository

class GetQuotesUseCase {
    // domain is used for cases use pattern design

    private val repository = QuoteRepository()

    // for invoke automatically the function
    suspend operator fun invoke():List<QuoteModel>? = repository.getAllQuotes()

}