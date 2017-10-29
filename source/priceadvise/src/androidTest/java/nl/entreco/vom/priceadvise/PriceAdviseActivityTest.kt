package nl.entreco.vom.priceadvise

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.nhaarman.mockito_kotlin.whenever
import nl.entreco.vom.priceadvise.test.TestApplication
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Created by entreco on 29/10/2017.
 */
@RunWith(AndroidJUnit4::class)
class PriceAdviseActivityTest {

    @Rule
    @JvmField
    val activity = ActivityTestRule<PriceAdviseActivity>(PriceAdviseActivity::class.java, false, false)

    @Test
    fun activityLaunches() {
        stubAnalytics()
        activity.launchActivity(null)
    }

    private fun stubAnalytics() {
        whenever(TestApplication.appComponent().analytics().getString()).thenReturn("Fake")
    }
}