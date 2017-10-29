package nl.entreco.vom.priceadvise.test

import android.app.Application
import android.support.test.InstrumentationRegistry
import nl.entreco.vom.priceadvise.di.DaggerTestApplicationComponent
import nl.entreco.vom.priceadvise.di.TestApplicationComponent

/**
 * Created by entreco on 29/10/2017.
 */
class TestApplication : Application() {

    private lateinit var appComponent: TestApplicationComponent

    override fun onCreate() {
        super.onCreate()
        inject()
    }

    private fun inject() {
        appComponent = DaggerTestApplicationComponent
                .builder()
                .application(this)
                .build()
        appComponent.inject(this)
    }

    companion object {

        fun appComponent(): TestApplicationComponent {
            return (InstrumentationRegistry.getTargetContext().applicationContext as TestApplication).
                    appComponent
        }

    }
}