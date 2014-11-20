class CreateExamples < ActiveRecord::Migration
  # gracias al método change se puede ir de atrás
  # hacia delante en la BD ya que funciona como una pila
  
  def change
    create_table :examples do |t|
      t.string :nombre
      t.timestamps
      ## crea created_at & updated_at
    end
  end
end
