package nl.entreco.vom

import android.app.Application
import nl.entreco.vom.di.application.ApplicationComponent
import nl.entreco.vom.di.application.ApplicationModule
import nl.entreco.vom.di.application.DaggerApplicationComponent
import nl.entreco.vom.util.Analytics
import nl.entreco.vom.util.Logger
import javax.inject.Inject

/**
 * Created by entreco on 28/10/2017.
 */
class BaseApplication : Application() {

    @Inject lateinit var logger: Logger
    @Inject lateinit var analytics: Analytics

    val applicationComponent: ApplicationComponent by lazy {
        DaggerApplicationComponent
                .builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }

    override fun onCreate() {
        applicationComponent.inject(this)
        super.onCreate()

        logger.log("yeah baby", 1, 2, 3, 4)
    }
}