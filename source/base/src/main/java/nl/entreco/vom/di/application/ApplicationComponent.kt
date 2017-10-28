package nl.entreco.vom.di.application

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import nl.entreco.vom.BaseApplication

/**
 * Created by entreco on 28/10/2017.
 */
@ApplicationScope
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): ApplicationComponent
    }

    fun inject(app: BaseApplication)
}