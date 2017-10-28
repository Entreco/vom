package nl.entreco.vom.di.activity

import dagger.Component

/**
 * Created by entreco on 28/10/2017.
 */
@ActivityScope
@Component(modules = arrayOf(ActivityModule::class))
interface ActivityComponent