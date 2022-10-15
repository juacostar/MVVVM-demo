package com.example.mvvvm_demo.ui.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvvm_demo.data.model.QuoteModel
import com.example.mvvvm_demo.data.model.QuoteProvider
import com.example.mvvvm_demo.domain.GetQuotesUseCase
import kotlinx.coroutines.launch

class QuoteViewModel: ViewModel() {

    // live data for connect an activity with the Quote model, mutable means that it can change
    val quoteModel = MutableLiveData<QuoteModel>()
    val isLoading = MutableLiveData<Boolean>()

    val getQuotesUseCase = GetQuotesUseCase()

    fun onCreate() {
        // is a controlled coroutine
        viewModelScope.launch {
            isLoading.postValue(true)
            val result = getQuotesUseCase()

            if(!result.isNullOrEmpty()){
                quoteModel.postValue(result[0])
                isLoading.postValue(false)
            }
        }
    }

    fun getQuote(){
//        val quote = QuoteProvider.quotes[0]
//        quoteModel.postValue(quote)
    }

}