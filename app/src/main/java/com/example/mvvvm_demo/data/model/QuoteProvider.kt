package com.example.mvvvm_demo.data.model

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class QuoteProvider @Inject constructor(){
    // setting the data for the app
    var quotes:List<QuoteModel> = emptyList()
}