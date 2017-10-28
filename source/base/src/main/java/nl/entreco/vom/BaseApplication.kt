package nl.entreco.vom

import android.app.Application
import android.util.Log

/**
 * Created by entreco on 28/10/2017.
 */
class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Log.d("TAG", "onCreate")
    }
}