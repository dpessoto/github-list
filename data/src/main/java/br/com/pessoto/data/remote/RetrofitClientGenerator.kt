package br.com.pessoto.data.remote

import retrofit2.Converter
import retrofit2.Retrofit

class RetrofitClientGenerator {

    fun create(baseUrl: String, converterFactory: Converter.Factory): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(converterFactory)
            .build()
    }
}