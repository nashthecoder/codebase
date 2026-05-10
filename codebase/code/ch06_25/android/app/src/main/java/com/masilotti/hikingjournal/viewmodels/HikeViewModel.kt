package com.masilotti.hikingjournal.viewmodels

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.masilotti.hikingjournal.models.Hike
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONObject
import java.net.URL

class HikeViewModel(private val url: String) : ViewModel() {
    var hike = mutableStateOf<Hike?>(null)
        private set

    suspend fun fetchCoordinates() {
        val data = withContext(Dispatchers.IO) {
            URL(url).readText()
        }
        val json = JSONObject(data)
        hike.value = Hike(
            name = json.getString("name"),
            latitude = json.getDouble("latitude"),
            longitude = json.getDouble("longitude")
        )
    }
}
