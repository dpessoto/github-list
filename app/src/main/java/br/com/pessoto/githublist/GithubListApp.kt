package br.com.pessoto.githublist

import android.app.Application
import br.com.pessoto.core.di.coreModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.loadKoinModules
import org.koin.core.context.startKoin

class GithubListApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin()
    }

    private fun startKoin() {
        startKoin {
            androidContext(this@GithubListApp)
            loadKoinModules(coreModule)
        }
    }
}