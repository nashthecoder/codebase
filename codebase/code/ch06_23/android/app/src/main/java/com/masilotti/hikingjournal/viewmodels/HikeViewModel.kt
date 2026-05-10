package com.masilotti.hikingjournal.viewmodels

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.masilotti.hikingjournal.models.Hike

class HikeViewModel(private val url: String) : ViewModel() {
    var hike = mutableStateOf<Hike?>(null)
        private set
}
