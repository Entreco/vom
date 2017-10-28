package nl.entreco.vom

import android.app.Application
import nl.entreco.vom.di.application.DaggerApplicationComponent

/**
 * Created by entreco on 28/10/2017.
 */
class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        inject()
    }

    private fun inject() {
        DaggerApplicationComponent
                .builder()
                .application(this)
                .build()
                .inject(this)
    }
}