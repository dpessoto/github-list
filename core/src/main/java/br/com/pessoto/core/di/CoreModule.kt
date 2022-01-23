package br.com.pessoto.core.di

import br.com.pessoto.core.resource.ResourceProvider
import br.com.pessoto.core.resource.ResourceProviderImpl
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val coreModule = module {
    single<ResourceProvider> { ResourceProviderImpl(androidApplication()) }
}