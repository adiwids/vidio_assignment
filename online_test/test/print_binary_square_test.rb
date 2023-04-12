require "minitest/autorun"
require_relative "../src/print_binary_square.rb"

class PrintBinarySquareTest < Minitest::Test

  # PrintBinarySquare.new tests
  def test_initialize_with_positive_size
    (1..99).to_a.each do |size|
      object = PrintBinarySquare.new(size: size)
      assert_equal(object.size, size)
    end
  end

  def test_initialize_with_zero_size
    assert_raises(ArgumentError) { PrintBinarySquare.new(size: 0) }
  end

  def test_initialize_with_negative_size
    assert_raises(ArgumentError) { PrintBinarySquare.new(size: -4) }
  end

  def test_initialize_with_big_size
    assert_raises(ArgumentError) { PrintBinarySquare.new(size: 100) }
    assert_raises(ArgumentError) { PrintBinarySquare.new(size: 1000) }
  end

  def test_initialize_with_null
    assert_raises(ArgumentError) { PrintBinarySquare.new(size: nil) }
  end

  def test_initialize_with_string_size
    assert_raises(ArgumentError) { PrintBinarySquare.new(size: "4") }
  end

  def test_initialize_with_boolean
    assert_raises(ArgumentError) { PrintBinarySquare.new(size: true) }
  end

  # object.call tests
  def test_print_binary_square_output
    object = PrintBinarySquare.new(size: 4)
    assert_output(/0101\n0101\n/) { object.call }
  end
end
