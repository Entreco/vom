package nl.entreco.vom.di.activity

import android.app.Activity
import android.content.Context
import android.support.v4.app.FragmentActivity
import dagger.Module
import dagger.Provides

/**
 * Created by entreco on 28/10/2017.
 */
@Module
class ActivityModule (private val activity: FragmentActivity){

    @ActivityScope
    @Provides
    fun provideContext() : Context {
        return activity
    }

    @ActivityScope
    @Provides
    fun provideActivity() : Activity {
        return activity
    }
}