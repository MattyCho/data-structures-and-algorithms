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
}
