package nl.entreco.vom.di.application

import android.app.Application
import dagger.Module
import dagger.Provides
import nl.entreco.vom.util.Analytics
import nl.entreco.vom.util.Logger

/**
 * Created by entreco on 28/10/2017.
 */
@Module
open class ApplicationModule(private val application: Application) {

    @Provides
    @ApplicationScope
    fun application(): Application {
        return application
    }

    @Provides
    @ApplicationScope
    fun logger(): Logger {
        return Logger()
    }

    @Provides
    @ApplicationScope
    fun analytics(): Analytics {
        return Analytics()
    }
}