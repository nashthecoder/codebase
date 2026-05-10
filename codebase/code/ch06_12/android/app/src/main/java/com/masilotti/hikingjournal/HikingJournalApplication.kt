package com.masilotti.hikingjournal

import android.app.Application
import com.masilotti.hikingjournal.activities.baseURL
import dev.hotwire.core.config.Hotwire
import dev.hotwire.core.turbo.config.PathConfiguration

class HikingJournalApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        Hotwire.loadPathConfiguration(
            context = this,
            location = PathConfiguration.Location(
                remoteFileUrl = "$baseURL/configurations/android_v1.json"
            )
        )
    }
}
