package com.example.mvvvm_demo.model

class QuoteProvider {
    // setting the data for the app
    companion object{ // like a static class in java
        val quotes = listOf<QuoteModel>(
            QuoteModel("Ejemplo 1", "juacostar")
        )
    }
}