class WelcomeController < ApplicationController
## es compartida con el index.html.erb
## por lo tanto una parte tiene la -lógica- 
## y la otra el -mostrar- en web
  layout 'ejemplo'
  def index
  	@creador = 'Yulay Segura'
  	@limite = 10
  	@mensaje = ':)'
  end
end
