## significa que la clase Base hereda de ActiveRecord
## se define en singular pero se interpreta como plural en la BD
class User < ActiveRecord::Base
	validates :nombre, presence: true, length: {maximum: 10}
	VALID_EMAIL_REGEX = /\A[\w+\-.]+@[a-z\d\-.]+\.[a-z]+\z/i
	validates :email, presence: true, format: { with:VALID_EMAIL_REGEX }
	validates :password, presence: true, length: {maximum: 16}

end
