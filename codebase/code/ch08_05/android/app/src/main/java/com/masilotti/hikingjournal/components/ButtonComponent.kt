package com.masilotti.hikingjournal.components

import androidx.compose.material3.Text
import androidx.compose.ui.platform.ComposeView
import dev.hotwire.core.bridge.BridgeComponent
import dev.hotwire.core.bridge.BridgeDelegate
import dev.hotwire.core.bridge.Message
import dev.hotwire.navigation.destinations.HotwireDestination
import dev.hotwire.navigation.fragments.HotwireFragment

class ButtonComponent(
    name: String,
    private val bridgeDelegate: BridgeDelegate<HotwireDestination>
) : BridgeComponent<HotwireDestination>(name, bridgeDelegate) {
    private val fragment: HotwireFragment
        get() = bridgeDelegate.destination.fragment as HotwireFragment

    override fun onReceive(message: Message) {
        val composeView = ComposeView(fragment.requireContext()).apply {
            setContent {
                Text("Sign in")
            }
        }
    }
}
