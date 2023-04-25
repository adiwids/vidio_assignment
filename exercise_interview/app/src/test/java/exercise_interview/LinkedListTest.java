package exercise_interview;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
  @Test
  void testCountEntriesWhenInitializedShouldReturnZero() {
    LinkedList list = new LinkedList();
    assertEquals(0, list.size());
  }

  @Test
  void testCountEntriesWhenObjectAddedShouldReturnNumOfEntries() {
    LinkedList list = new LinkedList();
    list.add("Ambulance");
    assertEquals(1, list.size());
    list.add(1);
    assertEquals(2, list.size());
    list.add(true);
    assertEquals(3, list.size());
    list.add(null);
    assertEquals(4, list.size());
  }
}
