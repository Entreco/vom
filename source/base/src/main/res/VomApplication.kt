import android.app.Application
import android.util.Log

/**
 * Created by entreco on 28/10/2017.
 */
class VomApplication : Application() {

    private val TAG = "VomApplication"

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "onCreate")
    }
}