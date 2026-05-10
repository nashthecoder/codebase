import HotwireNative
import UIKit

class NotificationTokenComponent: BridgeComponent {
    override class var name: String { "notification-token" }

    override func onReceive(message: Message) {
        Task { await requestNotificationPermission() }
    }

    private func requestNotificationPermission() async {
        let center = UNUserNotificationCenter.current()
        let options: UNAuthorizationOptions = [.alert, .sound, .badge]
        if try await center.requestAuthorization(options: options) {
            UIApplication.shared.registerForRemoteNotifications()
        }
    }
}
