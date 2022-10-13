package com.example.mvvvm_demo.ui.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvvm_demo.model.QuoteModel
import com.example.mvvvm_demo.model.QuoteProvider

class QuoteViewModel: ViewModel() {

    // live data for connect an activity with the Quote model, mutable means that it can change
    val quoteModel = MutableLiveData<QuoteModel>()

    fun getQuote(){
        val quote = QuoteProvider.quotes[0]
        quoteModel.postValue(quote)
    }
}