package nl.entreco.vom.priceadvise.di

import android.app.Application
import android.content.Context
import com.nhaarman.mockito_kotlin.mock
import dagger.Module
import dagger.Provides
import nl.entreco.vom.di.application.ApplicationScope
import nl.entreco.vom.util.Analytics
import nl.entreco.vom.util.Logger

/**
 * Created by entreco on 29/10/2017.
 */
@Module
class TestApplicationModule {
    @Provides
    @ApplicationScope
    fun provideContext(application: Application): Context {
        return application
    }

    @Provides
    @ApplicationScope
    fun provideLogger() : Logger {
        return mock()
    }

    @Provides
    @ApplicationScope
    fun provideAnalytics() : Analytics {
        return mock()
    }
}