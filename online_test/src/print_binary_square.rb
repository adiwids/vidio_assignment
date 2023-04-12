class PrintBinarySquare
  attr_reader :size

  def initialize(size: 4)
    raise ArgumentError.new("Size is undefined") if size.nil?
    raise ArgumentError.new("Size must be greater than zero and less than 100") if size <= 0 || size > 99
    @size = size
  end

  def call
    added = []

    size.times do |x|
      size.times do |y|
        char = added.last == '0' ? '1' : '0'
        added << char
        print char
      end
      puts "\n"
    end
  end
end
