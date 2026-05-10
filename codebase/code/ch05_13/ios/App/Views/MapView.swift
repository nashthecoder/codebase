import MapKit
import SwiftUI

struct MapView: View {
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
    MapView()
}
