import HotwireNative
import UIKit

class TabBarController: UITabBarController {
    private var navigators = [Navigator]()
    private let pathConfiguration = PathConfiguration(sources: [
        .server(baseURL.appending(path: "configurations/ios_v1.json"))
    ])

    override func viewDidLoad() {
        super.viewDidLoad()

        delegate = self
        viewControllers = makeViewControllers()
        tabBarController(self, didSelect: viewControllers!.first!)
    }

    private func makeViewControllers() -> [UIViewController] {
        return Tab.all.map { tab in
            let navigator = Navigator(
                pathConfiguration: pathConfiguration,
                delegate: self
            )
            navigators.append(navigator)

            let controller = navigator.rootViewController
            controller.tabBarItem.title = tab.title
            controller.tabBarItem.image = UIImage(systemName: tab.image)
            return controller
        }
    }
}


extension TabBarController: UITabBarControllerDelegate {
    func tabBarController(
        _ tabBarController: UITabBarController,
        didSelect viewController: UIViewController
    ) {
        guard let index = viewControllers?.firstIndex(of: viewController)
        else { return }

        let tab = Tab.all[index]
        if !tab.isStarted {
            navigators[index].route(baseURL.appending(path: tab.path))
            tab.isStarted = true
        }
    }
}

extension TabBarController: NavigatorDelegate {
    func handle(proposal: VisitProposal) -> ProposalResult {
        switch proposal.viewController {
        case "map": .acceptCustom(MapController(url: proposal.url))
        default: .accept
        }
    }
}
