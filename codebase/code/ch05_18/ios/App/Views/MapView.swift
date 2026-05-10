import MapKit
import SwiftUI

struct MapView: View {
    var viewModel: HikeViewModel

    var body: some View {
        Map {
            let coordinate = CLLocationCoordinate2D(
                latitude: 45.511881,
                longitude: -122.595706
            )
            Marker("Mount Tabor", coordinate: coordinate)
        }
    }
}

#Preview {
    let url = URL(string: "https://example.com")!
    let viewModel = HikeViewModel(url: url)
    viewModel.hike = Hike(
        name: "Mount Tabor",
        latitude: 45.511881,
        longitude: -122.595706
    )
    return MapView(viewModel: viewModel)
}
