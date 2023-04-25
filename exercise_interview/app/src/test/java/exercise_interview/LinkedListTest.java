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

  @Test
  void testFindEntryByValueWhenEntryNotFoundShouldReturnFalse() {
    LinkedList list = new LinkedList();
    assertFalse(list.contains(1));
    list.add("Ambulance");
    assertFalse(list.contains("Indonesia"));
    list.add(true);
    assertFalse(list.contains(false));
  }

  @Test
  void testFindEntryByValueWhenEntryFoundShouldReturnTrue() {
    LinkedList list = new LinkedList();
    assertFalse(list.contains("Ambulance"));
    list.add("Ambulance");
    assertTrue(list.contains("Ambulance"));
    assertFalse(list.contains("Indonesia"));
    list.add(true);
    assertFalse(list.contains(false));
    assertTrue(list.contains(true));
  }

  @Test
  void testRemoveEntryByValuWhenValueIsInTheListShouldReduceCount() {
    LinkedList list = new LinkedList();
    list.add(1);
    list.add("Ambulance");
    list.add(true);
    list.add(null);
    assertEquals(4, list.size());
    list.remove(null);
    assertEquals(3, list.size());
  }
  @Test
  void testRemoveEntryByValueWhenValueIsInTheListShouldNotContainRemovedEntry() {
    LinkedList list = new LinkedList();
    list.add(1);
    list.add("Ambulance");
    list.add(true);
    list.add(null);
    list.remove(null);
    assertFalse(list.contains(null));
    list.remove("Ambulance");
    assertFalse(list.contains("Ambulance"));
  }

  @Test
  void testRemoveEntryByValueWhenValueIsNotInTheListShouldNotReduceCount() {
    LinkedList list = new LinkedList();
    list.add(1);
    list.add("Ambulance");
    list.add(true);
    list.add(null);
    assertEquals(4, list.size());
    list.remove(2);
    assertEquals(4, list.size());
  }
}
