package nl.entreco.vom.di.application

import dagger.Component
import nl.entreco.vom.BaseApplication

/**
 * Created by entreco on 28/10/2017.
 */
@ApplicationScope
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {
    fun inject(application: BaseApplication)
}