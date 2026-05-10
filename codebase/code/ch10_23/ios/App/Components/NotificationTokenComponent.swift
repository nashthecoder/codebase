import HotwireNative
import UIKit

class NotificationTokenComponent: BridgeComponent {
    override class var name: String { "notification-token" }

    override func onReceive(message: Message) {
        Task { await requestNotificationPermission() }
    }

    private func requestNotificationPermission() async {
    }
}
