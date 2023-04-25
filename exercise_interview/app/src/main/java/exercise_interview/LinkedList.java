package exercise_interview;

public class LinkedList {
  class Node {
    Object value = null;

    Node prevNode = null;
    Node nextNode = null;
  }

  Node headNode = null;
  int entriesCount = 0;

  int size() {
    return entriesCount;
  }

  void add(Object value) {
    Node newEntry = new Node();
    newEntry.value = value;

    if(headNode == null) {
      headNode = newEntry;
    } else {
      appendNext(newEntry);
    }
    entriesCount += 1;
  }

  private void appendNext(Node entry) {
    Node lastNode = findLastNode();
    entry.prevNode = lastNode;
    lastNode.nextNode = entry;
  }

  private Node findLastNode() {
    if(headNode == null) {
      return null;
    }

    Node current = headNode;
    while(current != null) {
      if(current.nextNode == null) {
        return current;
      }
      current = current.nextNode;
    }

    return null;
  }

  boolean contains(Object value) {
    Node current = headNode;
    while(current != null) {
      if(current.value == value) {
        return true;
      }
      current = current.nextNode;
    }

    return false;
  }
}
