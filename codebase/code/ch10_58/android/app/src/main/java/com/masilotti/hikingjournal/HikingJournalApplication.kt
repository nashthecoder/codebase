package com.masilotti.hikingjournal

import android.app.Application
import com.google.firebase.FirebaseApp
import com.masilotti.hikingjournal.activities.baseURL
import com.masilotti.hikingjournal.components.ButtonComponent
import com.masilotti.hikingjournal.components.NotificationTokenComponent
import com.masilotti.hikingjournal.fragments.MapFragment
import com.masilotti.hikingjournal.fragments.WebFragment
import dev.hotwire.core.bridge.BridgeComponentFactory
import dev.hotwire.core.bridge.KotlinXJsonConverter
import dev.hotwire.core.config.Hotwire
// ...
import dev.hotwire.core.turbo.config.PathConfiguration
import dev.hotwire.navigation.config.registerBridgeComponents
import dev.hotwire.navigation.config.registerFragmentDestinations

class HikingJournalApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        FirebaseApp.initializeApp(this)

        Hotwire.loadPathConfiguration(
            // ...
            context = this,
            location = PathConfiguration.Location(
                remoteFileUrl = "$baseURL/configurations/android_v1.json"
            )
        )

        Hotwire.registerFragmentDestinations(
            MapFragment::class,
            WebFragment::class,
        )

        Hotwire.registerBridgeComponents(
            BridgeComponentFactory("button", ::ButtonComponent),
            BridgeComponentFactory(
                "notification-token",
                ::NotificationTokenComponent
            )
        )

        Hotwire.config.jsonConverter = KotlinXJsonConverter()
    }
}
