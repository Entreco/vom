package nl.entreco.vom

import android.app.Application
import nl.entreco.vom.di.application.ApplicationComponent
import nl.entreco.vom.di.application.ApplicationModule
import nl.entreco.vom.di.application.DaggerApplicationComponent

/**
 * Created by entreco on 28/10/2017.
 */
class BaseApplication : Application() {

    val applicationComponent : ApplicationComponent by lazy {
        DaggerApplicationComponent
                .builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }

    override fun onCreate() {
        applicationComponent.inject(this)
        super.onCreate()
    }
}