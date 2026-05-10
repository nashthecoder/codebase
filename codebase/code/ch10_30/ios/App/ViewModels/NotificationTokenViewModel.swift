import Foundation

class NotificationTokenViewModel {
    func register(_ token: String) async {
        let url = baseURL.appending(path: "notification_tokens")

        var req = URLRequest(url: url)
        req.httpMethod = "POST"
        req.setValue("application/json", forHTTPHeaderField: "Accept")
        req.setValue("application/json", forHTTPHeaderField: "Content-Type")
    }
}
