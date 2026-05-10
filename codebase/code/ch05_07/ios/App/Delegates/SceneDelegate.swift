import HotwireNative
import UIKit

let baseURL = URL(string: "http://localhost:3000")!

class SceneDelegate: UIResponder, UIWindowSceneDelegate {
    // ...
    var window: UIWindow?

    private let tabBarController = HotwireTabBarController()

    func scene(
        _ scene: UIScene,
        willConnectTo session: UISceneSession,
        options connectionOptions: UIScene.ConnectionOptions
    ) {
        window?.rootViewController = tabBarController
        tabBarController.load(HotwireTab.all)
    }
}

extension SceneDelegate: NavigatorDelegate {
    func handle(
        proposal: VisitProposal,
        from navigator: Navigator
    ) -> ProposalResult {
        switch proposal.viewController {
        case "map": .acceptCustom(MapController(url: proposal.url))
        }
    }
}
