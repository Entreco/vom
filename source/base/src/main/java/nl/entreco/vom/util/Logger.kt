package nl.entreco.vom.util

import android.util.Log

/**
 * Created by entreco on 28/10/2017.
 */
class Logger(private val tag: String) {

    fun log(msg: String, vararg args: Any) {
        Log.d(tag, StringBuilder(msg)
                .apply { args.forEach { append(it) } }.toString())
    }
}