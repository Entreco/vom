package nl.entreco.vom.priceadvise.di

import dagger.Module
import dagger.Provides
import nl.entreco.vom.di.activity.ActivityScope
import nl.entreco.vom.priceadvise.Poep

/**
 * Created by entreco on 28/10/2017.
 */
@Module
class PriceAdviseModule {

    @Provides
    fun providePoep() : Poep {
        return Poep()
    }
}