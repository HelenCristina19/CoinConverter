package com.example.coinconverter

import android.app.Application
import com.example.coinconverter.data.di.DataModules
import com.example.coinconverter.domain.di.DomainModule
import com.example.coinconverter.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class  App : Application() {
    override fun  onCreate() {
        super.onCreate()

        startKoin{
            androidContext(this@App)
        }

        DataModules.load()
        DomainModule.load()
        PresentationModule.load()

    }
}


