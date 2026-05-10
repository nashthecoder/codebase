package com.masilotti.hikingjournal.fragments

import androidx.activity.result.contract.ActivityResultContracts
import com.google.firebase.messaging.FirebaseMessaging
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
        val firebase = FirebaseMessaging.getInstance()
        firebase.token.addOnCompleteListener { task ->
            if (task.isSuccessful) {
                // POST token to server.
            }
        }
    }
}
