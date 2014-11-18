##Con el timestamp en YYMMDDHHMMSS;

class CreateUsers < ActiveRecord::Migration
  def change
  	## con el se guardarán los datos de todos los usuarios
    create_table :users do |t| #t: columna
      t.string :nombre
      t.string :email
      t.string :password
      t.timestamps # comando para crear created y updated
      # se crea automaticamente id
    end
  end
end
