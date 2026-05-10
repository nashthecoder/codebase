import Foundation

@Observable class HikeViewModel {
    var hike: Hike?

    private let url: URL

    init(url: URL) {
        self.url = url.appendingPathExtension("json")
    }

    func fetchCoordinates() async {
        do {
            let (data, _) = try await URLSession.shared.data(from: url)
        } catch {
            print("Failed to fetch hike: \(error.localizedDescription)")
        }
    }
}
