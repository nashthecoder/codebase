import HotwireNative
import UIKit

@main
class AppDelegate: UIResponder, UIApplicationDelegate {
    func application(
        _ application: UIApplication,
        didFinishLaunchingWithOptions launchOptions:
        [UIApplication.LaunchOptionsKey: Any]?
    ) -> Bool {
        // ...
        Hotwire.loadPathConfiguration(from: [
            .server(baseURL.appending(path: "configurations/ios_v1.json"))
        ])

        Hotwire.registerBridgeComponents([
            ButtonComponent.self,
            NotificationTokenComponent.self
        ])

        return true
    }

    func application(
        _ application: UIApplication,
        didRegisterForRemoteNotificationsWithDeviceToken deviceToken: Data
    ) {
        // POST token to server.
    }

    func application(
        _ application: UIApplication,
        didFailToRegisterForRemoteNotificationsWithError error: any Error
    ) {
        print("Failed to register token: \(error.localizedDescription)")
    }
}
