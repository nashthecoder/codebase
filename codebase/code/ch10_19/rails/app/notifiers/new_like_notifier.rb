#---
# Excerpted from "Hotwire Native for Rails Developers",
# published by The Pragmatic Bookshelf.
# Copyrights apply to this code. It may not be used to create training material,
# courses, books, articles, and the like. Contact us if you are in doubt.
# We make no guarantees that this code is fit for any purpose.
# Visit https://pragprog.com/titles/jmnative for more book information.
#---
class NewLikeNotifier < ApplicationNotifier
  required_param :hike

  deliver_by :ios do |config|
    # ...
    config.device_tokens = -> {
      recipient.notification_tokens.where(platform: :iOS).pluck(:token)
    }

    config.format = ->(apn) {
      # ...
      apn.alert = "Someone liked your hike!"
      apn.custom_payload = {
        path: hike_path(params[:hike])
      }
    }

    credentials = Rails.application.credentials.ios
    config.bundle_identifier = credentials.bundle_identifier
    config.key_id = credentials.key_id
    config.team_id = credentials.team_id
    config.apns_key = credentials.apns_key
  end
end
