package com.masilotti.hikingjournal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.hotwire.core.navigation.activities.HotwireActivity
import dev.hotwire.core.navigation.activities.HotwireActivityDelegate
import dev.hotwire.core.navigation.session.SessionConfiguration

const val baseURL = "http://10.0.2.2:3000"

class MainActivity : AppCompatActivity(), HotwireActivity {
    override val appCompatActivity = this
    override val delegate = HotwireActivityDelegate(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun sessionConfigurations() = listOf(
        SessionConfiguration(
            name = "main",
            startLocation = "$baseURL/hikes",
            navHostFragmentId = R.id.main_nav_host
        )
    )
}
