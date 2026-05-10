package com.masilotti.hikingjournal.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.masilotti.hikingjournal.R
import dev.hotwire.navigation.fragments.HotwireFragment

class MapFragment : HotwireFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_map, container, false)
        return view
    }
}
