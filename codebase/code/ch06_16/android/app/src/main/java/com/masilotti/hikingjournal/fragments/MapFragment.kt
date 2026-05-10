package com.masilotti.hikingjournal.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.runtime.Composable
// ...
import androidx.compose.ui.platform.ComposeView
import com.google.maps.android.compose.GoogleMap
import com.masilotti.hikingjournal.R
import dev.hotwire.navigation.destinations.HotwireDestinationDeepLink
import dev.hotwire.navigation.fragments.HotwireFragment

@HotwireDestinationDeepLink(uri = "hotwire://fragment/map")
class MapFragment : HotwireFragment() {
    // ...
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_map, container, false)
        view.findViewById<ComposeView>(R.id.compose_view).apply {
            setContent {
                MapView()
            }
        }
        return view
    }
}

@Composable
fun MapView() {
    GoogleMap()
}
