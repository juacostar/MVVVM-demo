package com.example.mvvvm_demo.di

import com.example.mvvvm_demo.data.model.network.QuoteApiClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

// module means that this class provides dependencies
@Module
@InstallIn(SingletonComponent::class) // limit oor approach, activity level in this case
object NetworkModule {

    @Singleton // only one instance for retrofit
    @Provides
    fun provideRetrofit(): Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://drawsomething-59328-default-rtdb.europe-west1.firebasedatabase.app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun provideQuoteApiClient(retrofit: Retrofit): QuoteApiClient{
        return retrofit.create(QuoteApiClient::class.java) // providing an interface
    }


}