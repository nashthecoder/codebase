package com.masilotti.hikingjournal.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.masilotti.hikingjournal.BuildConfig
import com.masilotti.hikingjournal.R
import com.masilotti.hikingjournal.activities.models.mainTabs
import dev.hotwire.navigation.activities.HotwireActivity
import dev.hotwire.navigation.tabs.HotwireBottomNavigationController
import dev.hotwire.navigation.tabs.navigatorConfigurations
import dev.hotwire.navigation.util.applyDefaultImeWindowInsets

const val baseURL = BuildConfig.BASE_URL

class MainActivity : HotwireActivity() {
    private lateinit var bottomNavigationController:
            HotwireBottomNavigationController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.main).applyDefaultImeWindowInsets()

        initializeBottomTabs()
    }

    override fun navigatorConfigurations() = mainTabs.navigatorConfigurations

    private fun initializeBottomTabs() {
        val bottomNavigationView =
            findViewById<BottomNavigationView>(R.id.bottom_nav)

        bottomNavigationController =
            HotwireBottomNavigationController(this, bottomNavigationView)
        bottomNavigationController.load(mainTabs, 0)
    }

    override fun onStart() {
        super.onStart()

        handleDeepLink(intent)
    }


    private fun handleDeepLink(intent: Intent?) {
        val path = intent?.getStringExtra("path")
        path?.let {
            delegate.currentNavigator?.route("$baseURL$it")
        }
        this.intent = null
    }
}
