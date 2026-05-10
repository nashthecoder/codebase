import HotwireNative
import UserNotifications

class NotificationRouter: NSObject, UNUserNotificationCenterDelegate {
    @MainActor
    func userNotificationCenter(
        _ center: UNUserNotificationCenter,
        didReceive response: UNNotificationResponse
    ) async {
    }
}
