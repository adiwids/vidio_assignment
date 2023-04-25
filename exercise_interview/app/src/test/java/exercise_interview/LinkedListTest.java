package exercise_interview;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
  @Test
  void testCountEntriesWhenInitializedShouldReturnZero() {
    LinkedList list = new LinkedList();
    assertEquals(0, list.size());
  }
}
