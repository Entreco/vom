package nl.entreco.vom.priceadvise.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import nl.entreco.vom.di.application.ApplicationModule
import nl.entreco.vom.di.application.ApplicationScope
import nl.entreco.vom.priceadvise.PriceAdviseActivity

/**
 * Created by entreco on 28/10/2017.
 */
@ApplicationScope
@Component(modules = arrayOf(ApplicationModule::class, PriceAdviseModule::class))
interface PriceAdviseComponent {

    fun inject(activity: PriceAdviseActivity)

    @Component.Builder
    interface Builder {
        fun build(): PriceAdviseComponent

        @BindsInstance
        fun bindContext(context: Context): Builder
    }
}