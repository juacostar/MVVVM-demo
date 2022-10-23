package com.example.mvvvm_demo.domain

import com.example.mvvvm_demo.data.model.QuoteModel
import com.example.mvvvm_demo.data.model.QuoteRepository
import javax.inject.Inject

// pre  pare a class for be injected
class GetQuotesUseCase @Inject constructor(
    private val repository: QuoteRepository
){
    // domain is used for cases use pattern design

    // for invoke automatically the function
    suspend operator fun invoke():List<QuoteModel>? = repository.getAllQuotes()

}