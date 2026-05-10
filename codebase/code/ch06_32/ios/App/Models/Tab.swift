class Tab {
    let title: String
    let image: String
    let path: String

    var isStarted = false

    static var all = [
        Tab(title: "Hikes", image: "map", path: "hikes"),
        Tab(title: "Hikers", image: "figure.hiking", path: "users")
    ]

    init(title: String, image: String, path: String) {
        self.title = title
        self.image = image
        self.path = path
    }
}
