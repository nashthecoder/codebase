package com.masilotti.hikingjournal.activities

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.masilotti.hikingjournal.R
import com.masilotti.hikingjournal.models.Tab
import dev.hotwire.navigation.activities.HotwireActivity
import dev.hotwire.navigation.navigator.NavigatorConfiguration
import dev.hotwire.navigation.util.applyDefaultImeWindowInsets

const val baseURL = "http://10.0.2.2:3000"

class MainActivity : HotwireActivity() {
    private val tabs = Tab.all

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.main).applyDefaultImeWindowInsets()

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_nav)
        bottomNav.setOnItemSelectedListener { tab ->
            val selectedTab = tabs.first { it.menuId == tab.itemId }
            showTab(selectedTab)
            true
        }
        showTab(tabs.first())
    }

    override fun navigatorConfigurations() = tabs.map { tab ->
        NavigatorConfiguration(
            name = tab.name,
            startLocation = "$baseURL/${tab.path}",
            navigatorHostId = tab.navigatorHostId
        )
    }

    private fun showTab(tab: Tab) {
        tabs.forEach {
            val view = findViewById<View>(it.navigatorHostId)
            view.visibility = if (it == tab) View.VISIBLE else View.GONE
        }
    }
}
