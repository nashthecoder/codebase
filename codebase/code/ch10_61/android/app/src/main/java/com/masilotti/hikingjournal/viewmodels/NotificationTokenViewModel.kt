package com.masilotti.hikingjournal.viewmodels

import android.webkit.CookieManager
import com.masilotti.hikingjournal.activities.baseURL
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.net.HttpURLConnection
import java.net.URL

class NotificationTokenViewModel {
    suspend fun registerToken(token: String) = withContext(Dispatchers.IO) {
        val url = URL("$baseURL/notification_tokens")

        val connection = url.openConnection() as HttpURLConnection
        connection.requestMethod = "POST"
        connection.setRequestProperty("Content-Type", "application/json")

        CookieManager.getInstance().getCookie(baseURL)?.let {
            connection.setRequestProperty("Cookie", it)
        }
    }
}
