package com.masilotti.hikingjournal.fragments

import androidx.activity.result.contract.ActivityResultContracts
import dev.hotwire.navigation.destinations.HotwireDestinationDeepLink
import dev.hotwire.navigation.fragments.HotwireWebFragment

@HotwireDestinationDeepLink("hotwire://fragment/web")
class WebFragment : HotwireWebFragment() {
    private val contract = ActivityResultContracts.RequestPermission()
    private val requestPermissionLauncher =
        registerForActivityResult(contract) { isGranted ->
            if (isGranted) registerForTokenChanges()
        }

    private fun registerForTokenChanges() {
    }
}
