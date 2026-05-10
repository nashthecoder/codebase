import HotwireNative
import UIKit

class ButtonComponent: BridgeComponent {
    override class var name: String { "button" }

    override func onReceive(message: Message) {
        let button = UIBarButtonItem(title: "Sign in")

        let viewController = delegate?.destination as? UIViewController
        viewController?.navigationItem.rightBarButtonItem = button
    }
}
