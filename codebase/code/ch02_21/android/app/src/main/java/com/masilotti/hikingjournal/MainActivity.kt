package com.masilotti.hikingjournal

// ...


import android.os.Bundle
import dev.hotwire.navigation.activities.HotwireActivity
import dev.hotwire.navigation.navigator.NavigatorConfiguration

// NOTE: Your ngrok URL will be different.
const val baseURL = "https://0b25dc656725.ngrok.app"

class MainActivity : HotwireActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun navigatorConfigurations() = listOf(
        NavigatorConfiguration(
            name = "main",
            startLocation = "$baseURL/hikes",
            navigatorHostId = R.id.main_nav_host
        )
    )
}
