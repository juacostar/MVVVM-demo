package com.example.mvvvm_demo.data.model

import com.google.gson.annotations.SerializedName

// serialized is used in case of params names of database are different of param names of model
data class QuoteModel (@SerializedName("quote") val quote: String, @SerializedName("author") val author: String)