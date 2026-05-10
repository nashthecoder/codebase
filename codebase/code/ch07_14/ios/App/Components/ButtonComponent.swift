import HotwireNative
import UIKit

class ButtonComponent: BridgeComponent {
    override class var name: String { "button" }

    override func onReceive(message: Message) {
        let action = UIAction(title: "Sign in") { _ in
            self.reply(to: message.event)
        }
        let button = UIBarButtonItem(primaryAction: action)

        let viewController = delegate?.destination as? UIViewController
        viewController?.navigationItem.rightBarButtonItem = button
    }
}

private extension ButtonComponent {
    struct MessageData: Decodable {
        let title: String
    }
}
