#---
# Excerpted from "Hotwire Native for Rails Developers",
# published by The Pragmatic Bookshelf.
# Copyrights apply to this code. It may not be used to create training material,
# courses, books, articles, and the like. Contact us if you are in doubt.
# We make no guarantees that this code is fit for any purpose.
# Visit https://pragprog.com/titles/jmnative for more book information.
#---
class NotificationTokensController < ApplicationController
  def create
    current_user.notification_tokens.find_or_create_by!(notification_token)
  end

  private

  def notification_token
    params.require(:notification_token).permit(:token, :platform)
  end
end
