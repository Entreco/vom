package nl.entreco.vom.util

import android.util.Log
import javax.inject.Inject

/**
 * Created by entreco on 28/10/2017.
 */
class Logger @Inject constructor () {

    fun log(msg: String, vararg args: Any) {
        Log.d("Aha", StringBuilder(msg)
                .apply { args.forEach { append(it).append(" ") } }.toString())
    }
}