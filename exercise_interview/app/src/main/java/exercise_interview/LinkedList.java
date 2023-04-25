package exercise_interview;

public class LinkedList {
  class Node {
    Object value = null;

    Node prevNode = null;
    Node nextNode = null;
  }

  Node headNode = null;

  int size() {
    return countNodes();
  }

  void add(Object value) {
    Node newEntry = new Node();
    newEntry.value = value;

    if(headNode == null) {
      headNode = newEntry;
    } else {
      appendNext(newEntry);
    }
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

  private int countNodes() {
    int count = 0;
    Node current = headNode;
    while(current != null) {
      count += 1;
      current = current.nextNode;
    }

    return count;
  }
}
