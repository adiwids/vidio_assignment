package exercise_interview;

import org.junit.jupiter.api.Test;

import exercise_interview.LinkedList.Node;

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

  // LinkedList#get should be added prior to remove method
  @Test
  void testGetEntryByValueWhenInTheListShouldReturnNode() {
    LinkedList list = new LinkedList();
    list.add(1);
    list.add("Ambulance");
    list.add(true);
    list.add(null);
    Node found = list.get("Ambulance");
    assertNotNull(found);
    assertEquals("Ambulance", found.value);
  }

  @Test
  void testGetEntryByValueWhenNotInTheListShouldReturnNull() {
    LinkedList list = new LinkedList();
    assertNull(list.get(1));
    list.add(1);
    list.add("Ambulance");
    list.add(true);
    list.add(null);
    assertNull(list.get(2));
  }

  @Test
  void testAddEntryWhenNotInTheListShouldIncrementCounter() {
    LinkedList list = new LinkedList();
    list.add(1);
    assertEquals(1, list.size());
    list.add("Ambulance");
    assertEquals(2, list.size());
    list.add(true);
    assertEquals(3, list.size());
    list.add(null);
    assertEquals(4, list.size());
    list.add("ambulance");
    assertEquals(5, list.size());
  }

  @Test
  void testAddEntryWhenAlreadyInTheListShouldIncrementCounter() {
    LinkedList list = new LinkedList();
    list.add(1);
    list.add("Ambulance");
    list.add(true);
    list.add(null);
    assertEquals(4, list.size());
    list.add("Ambulance");
    assertEquals(4, list.size());
  }
}
