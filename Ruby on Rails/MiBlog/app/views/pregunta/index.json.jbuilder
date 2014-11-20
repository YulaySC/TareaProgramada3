json.array!(@pregunta) do |preguntum|
  json.extract! preguntum, :id, :titulo, :post, :etiqueta
  json.url preguntum_url(preguntum, format: :json)
end
