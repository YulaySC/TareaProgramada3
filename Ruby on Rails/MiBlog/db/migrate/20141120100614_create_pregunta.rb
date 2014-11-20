class CreatePregunta < ActiveRecord::Migration
  def change
    create_table :pregunta do |t|
      t.string :titulo
      t.text :post
      t.string :etiqueta

      t.timestamps
    end
  end
end
