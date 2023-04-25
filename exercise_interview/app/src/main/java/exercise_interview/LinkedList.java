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
    if(contains(value)) {
      return;
    }

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
    Node found = findByValue(value);

    return found != null;
  }

  void remove(Object value) {
    Node toBeRemoved = findByValue(value);
    if(toBeRemoved != null) {
      updateRemovedLink(toBeRemoved);
      entriesCount -= 1;
    }
  }

  Node get(Object value) {
    return findByValue(value);
  }

  private Node findByValue(Object value) {
    Node current = headNode;
    while(current != null) {
      if(current.value == value) {
        return current;
      }
      current = current.nextNode;
    }

    return null;
  }

  private void updateRemovedLink(Node current) {
    Node tmpPrevNode = current.prevNode;
    Node newNextNode = current.nextNode;
    if(tmpPrevNode != null) {
      tmpPrevNode.nextNode = newNextNode;
    }
    if(newNextNode != null) {
      newNextNode.prevNode = tmpPrevNode;
    }
  }

  void addAfter(Object value, Object afterValue) {
    Node pivot = findByValue(afterValue);
    Node oldNextNode = pivot.nextNode;
    pivot.nextNode = null;
    add(value);
    add(oldNextNode);
  }
}
