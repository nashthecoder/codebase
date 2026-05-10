import Foundation

@Observable class HikeViewModel {
    var hike: Hike?

    private let url: URL

    init(url: URL) {
        self.url = url.appendingPathExtension("json")
    }
}
