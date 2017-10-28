package nl.entreco.vom.di.application

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import nl.entreco.vom.util.Analytics
import nl.entreco.vom.util.Logger

/**
 * Created by entreco on 28/10/2017.
 */
@Module
open class ApplicationModule {

    @Provides
    @ApplicationScope
    fun provideContext(application: Application): Context {
        return application
    }

    @Provides
    @ApplicationScope
    fun provideLogger() : Logger {
        return Logger()
    }

    @Provides
    @ApplicationScope
    fun provideAnalytics() : Analytics {
        return Analytics()
    }
}