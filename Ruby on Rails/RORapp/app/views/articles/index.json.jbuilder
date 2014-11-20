json.array!(@articles) do |article|
  json.extract! article, :id, :itle, :body
  json.url article_url(article, format: :json)
end
