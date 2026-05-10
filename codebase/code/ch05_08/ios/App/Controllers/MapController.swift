import SwiftUI
import UIKit

class MapController: UIHostingController<MapView> {
    convenience init(url: URL) {
        let view = MapView()
        self.init(rootView: view)
    }
}
