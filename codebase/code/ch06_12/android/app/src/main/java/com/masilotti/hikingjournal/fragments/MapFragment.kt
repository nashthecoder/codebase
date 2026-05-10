package com.masilotti.hikingjournal.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
// ...
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
// ...
import com.masilotti.hikingjournal.R
import dev.hotwire.navigation.fragments.HotwireFragment


class MapFragment : HotwireFragment() {
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
    Text(text = "Hello, World!")
}
