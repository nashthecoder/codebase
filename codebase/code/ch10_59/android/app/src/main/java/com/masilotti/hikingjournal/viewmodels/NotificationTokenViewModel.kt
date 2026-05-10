package com.masilotti.hikingjournal.viewmodels

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class NotificationTokenViewModel {
    suspend fun registerToken(token: String) = withContext(Dispatchers.IO) {
    }
}
