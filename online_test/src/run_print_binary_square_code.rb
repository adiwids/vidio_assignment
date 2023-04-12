require_relative "./print_binary_square.rb"

object = PrintBinarySquare.new(size: ARGV[0].to_i)
object.call
