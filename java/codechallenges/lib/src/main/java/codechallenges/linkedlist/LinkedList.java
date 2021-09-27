package codechallenges.linkedlist;

public class LinkedList {
  Node head = null;

  public void insert(int value) {
    Node newNode = new Node(value);
    newNode.next = this.head;
    this.head = newNode;
  }

  public boolean includes(int searchValue) {
    Node currentNode = this.head;
    boolean hasValue = false;
    while (currentNode != null) {
      if (currentNode.value == searchValue) {
        hasValue = true;
      }
      currentNode = currentNode.next;
    }
    return hasValue;
  }

  @Override
  public String toString() {
    Node currentNode = this.head;
    String stringLL = "";
    while (currentNode != null) {
      stringLL = stringLL + "{ " + currentNode.value + " } -> ";
      currentNode = currentNode.next;
    }
    stringLL = stringLL + "NULL";
    return stringLL;
  }

  public void append(int newValue) {
    Node newNode = new Node(newValue);
    newNode.next = null;
    Node currentNode = this.head;
    while (currentNode.next != null) {
      currentNode = currentNode.next;
    }
    currentNode.next = newNode;
  }

  public void insertBefore(int nextValue, int newValue) {
    Node newNode = new Node(newValue);
    Node currentNode = this.head;
    while (currentNode.next != null) {
      if (currentNode.next.value == nextValue) {
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        currentNode = newNode.next;
      } else {
        currentNode = currentNode.next;
      }
    }
  }

  public void insertAfter (int beforeValue, int newValue) {
    Node newNode = new Node(newValue);
    Node currentNode = this.head;
    while (currentNode.next != null) {
      if (currentNode.value == beforeValue) {
        newNode.next = currentNode.next;
        currentNode.next = newNode;
      }
      currentNode = currentNode.next;
    }
  }
}
