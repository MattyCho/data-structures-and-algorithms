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
    while (currentNode != null) {
      if (currentNode.value == searchValue) {
        return true;
      }
      currentNode = currentNode.next;
    }
    return false;
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
    if (this.head == null) {
      this.head = newNode;
    } else {
      Node currentNode = this.head;
      while (currentNode.next != null) {
        currentNode = currentNode.next;
      }
      currentNode.next = newNode;
    }
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

//  public Node reverseList() {
//    Node previousNode = null;
//    Node currentNode = this.head;
//    Node nextNode;
//    while (currentNode != null) {
//      nextNode = currentNode.next;
//      currentNode.next = previousNode;
//      previousNode = currentNode;
//      currentNode = nextNode;
//    }
//    return previousNode;
//  }

  public int listSize() {
    Node currentNode = this.head;
    int listSize = 0;
    while (currentNode != null) {
      listSize++;
      currentNode = currentNode.next;
    }
    return listSize;
  }

  public int kthFromEnd (int k) {
    int listSize = this.listSize();
    int index = listSize - 1 - k;
    Node currentNode = this.head;
    if (index < 0 ) {
      throw new IllegalArgumentException("The index you are looking for is greater than the length of the list");
    }
    while (index >= 0) {
      if (index == 0 ) {
        return currentNode.value;
      } else {
        currentNode = currentNode.next;
        index--;
      }
    }
    return currentNode.value;
  }

  public static LinkedList zipLists(LinkedList list1, LinkedList list2) {
    LinkedList newList = new LinkedList();
    Node currentNode1 = list1.head;
    Node currentNode2 = list2.head;
    while (currentNode1 != null || currentNode2 != null) {
      if (currentNode1 != null) {
        newList.append(currentNode1.value);
        currentNode1 = currentNode1.next;
      }
      if (currentNode2 != null) {
        newList.append(currentNode2.value);
        currentNode2 = currentNode2.next;
      }
    }
    return newList;
  }
}
