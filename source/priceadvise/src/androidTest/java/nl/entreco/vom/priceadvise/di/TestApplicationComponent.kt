package nl.entreco.vom.priceadvise.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import nl.entreco.vom.di.application.ApplicationComponent
import nl.entreco.vom.di.application.ApplicationScope
import nl.entreco.vom.priceadvise.test.TestApplication
import nl.entreco.vom.util.Analytics

/**
 * Created by entreco on 29/10/2017.
 */
@ApplicationScope
@Component(modules = arrayOf(TestApplicationModule::class))
interface TestApplicationComponent : ApplicationComponent {

    fun analytics() : Analytics

    fun inject(application: TestApplication)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): TestApplicationComponent.Builder

        fun build(): TestApplicationComponent
    }
}