package br.com.pessoto.di

import br.com.pessoto.data.BuildConfig
import br.com.pessoto.data.remote.RetrofitClientGenerator
import br.com.pessoto.data.remote.RetrofitServiceGenerator
import org.koin.dsl.module
import retrofit2.converter.gson.GsonConverterFactory

val dataModule = module {
    single {
        RetrofitClientGenerator().create(
            baseUrl = BuildConfig.BASE_URL,
            converterFactory = GsonConverterFactory.create()
        )
    }
    single { RetrofitServiceGenerator(retrofit = get()) }
}