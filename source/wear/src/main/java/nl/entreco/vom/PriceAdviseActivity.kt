package nl.entreco.vom

import android.os.Bundle
import android.support.wearable.activity.WearableActivity

class PriceAdviseActivity : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_price_advise)

        // Enables Always-on
        setAmbientEnabled()
    }
}
