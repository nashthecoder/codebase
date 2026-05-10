#---
# Excerpted from "Hotwire Native for Rails Developers",
# published by The Pragmatic Bookshelf.
# Copyrights apply to this code. It may not be used to create training material,
# courses, books, articles, and the like. Contact us if you are in doubt.
# We make no guarantees that this code is fit for any purpose.
# Visit https://pragprog.com/titles/jmnative for more book information.
#---
# This migration comes from noticed (originally 20231215190233)
class CreateNoticedTables < ActiveRecord::Migration[6.1]
  def change
    primary_key_type, foreign_key_type = primary_and_foreign_key_types
    create_table :noticed_events, id: primary_key_type do |t|
      t.string :type
      t.belongs_to :record, polymorphic: true, type: foreign_key_type
      if t.respond_to?(:jsonb)
        t.jsonb :params
      else
        t.json :params
      end

      t.timestamps
    end

    create_table :noticed_notifications, id: primary_key_type do |t|
      t.string :type
      t.belongs_to :event, null: false, type: foreign_key_type
      t.belongs_to :recipient, polymorphic: true, null: false, type: foreign_key_type
      t.datetime :read_at
      t.datetime :seen_at

      t.timestamps
    end
  end

  private

  def primary_and_foreign_key_types
    config = Rails.configuration.generators
    setting = config.options[config.orm][:primary_key_type]
    primary_key_type = setting || :primary_key
    foreign_key_type = setting || :bigint
    [primary_key_type, foreign_key_type]
  end
end
