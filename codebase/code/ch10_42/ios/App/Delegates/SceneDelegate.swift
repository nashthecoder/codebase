import HotwireNative
import UIKit

#if DEBUG
let baseURL = URL(string: "http://localhost:3000")!
#else
// NOTE: Your IP address will be different.
let baseURL = URL(string: "http://192.168.50.139:3000")!
#endif

class SceneDelegate: UIResponder, UIWindowSceneDelegate {
    var window: UIWindow?

    private let tabBarController = TabBarController()

    func scene(
        _ scene: UIScene,
        willConnectTo session: UISceneSession,
        options connectionOptions: UIScene.ConnectionOptions
    ) {
        window?.rootViewController = tabBarController
    }
}
