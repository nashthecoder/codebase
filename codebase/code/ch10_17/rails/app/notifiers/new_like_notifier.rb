#---
# Excerpted from "Hotwire Native for Rails Developers",
# published by The Pragmatic Bookshelf.
# Copyrights apply to this code. It may not be used to create training material,
# courses, books, articles, and the like. Contact us if you are in doubt.
# We make no guarantees that this code is fit for any purpose.
# Visit https://pragprog.com/titles/jmnative for more book information.
#---
class NewLikeNotifier < ApplicationNotifier
  deliver_by :ios do |config|
    config.device_tokens = -> {
      recipient.notification_tokens.where(platform: :iOS).pluck(:token)
    }

    config.format = ->(apn) {
      apn.alert = "Someone liked your hike!"
    }
  end
end
