import HotwireNative
import UserNotifications

class NotificationDelegate: NSObject, UNUserNotificationCenterDelegate {
    private unowned let router: Router

    init(router: Router) {
        self.router = router
    }

    func userNotificationCenter(
        _ center: UNUserNotificationCenter,
        willPresent notification: UNNotification
    ) async -> UNNotificationPresentationOptions {
        .banner
    }

    @MainActor
    func userNotificationCenter(
        _ center: UNUserNotificationCenter,
        didReceive response: UNNotificationResponse
    ) async {
        let userInfo = response.notification.request.content.userInfo
        if let path = userInfo["path"] as? String {
            let url = baseURL.appending(path: path)
            router.route(url)
        }
    }
}
