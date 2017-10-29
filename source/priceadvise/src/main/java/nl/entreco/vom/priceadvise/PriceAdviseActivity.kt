package nl.entreco.vom.priceadvise

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_price_advise.*
import nl.entreco.vom.priceadvise.di.DaggerPriceAdviseComponent
import nl.entreco.vom.util.Analytics
import nl.entreco.vom.util.Logger
import javax.inject.Inject

class PriceAdviseActivity : AppCompatActivity() {

    @Inject lateinit var logger : Logger
    @Inject lateinit var analytics : Analytics
    @Inject lateinit var poep: Poep

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        DaggerPriceAdviseComponent.builder().bindContext(this.applicationContext).build().inject(this)
        setContentView(R.layout.activity_price_advise)
        setSupportActionBar(toolbar)

        logger.log("Shizzle", "1", 2, "2", true, poep, "done", analytics.getString())
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_price_advise, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return when (item.itemId) {
            R.id.action_settings ->
                return true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
