package codechallenges.linkedlist;

public class LinkedList<T> {
  Node head = null;

  public void insert(T value) {
    Node newNode = new Node(value);
    newNode.next = this.head;
    this.head = newNode;
  }

  public boolean includes(T searchValue) {
    Node currentNode = this.head;
    while (currentNode != null) {
      if (currentNode.value.equals(searchValue)) {
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

  public void append(T newValue) {
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
      if (currentNode.next.value.equals(nextValue)) {
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
      if (currentNode.value.equals(beforeValue)) {
        newNode.next = currentNode.next;
        currentNode.next = newNode;
      }
      currentNode = currentNode.next;
    }
  }

  public int listSize() {
    Node currentNode = this.head;
    int listSize = 0;
    while (currentNode != null) {
      listSize++;
      currentNode = currentNode.next;
    }
    return listSize;
  }

  public T kthFromEnd (int k) {
    int listSize = this.listSize();
    int index = listSize - 1 - k;
    Node currentNode = this.head;
    if (index < 0 ) {
      throw new IllegalArgumentException("The index you are looking for is greater than the length of the list");
    }
    while (index >= 0) {
      if (index == 0 ) {
        //maybe broke after convert to generic T
        return (T) currentNode.value;
      } else {
        currentNode = currentNode.next;
        index--;
      }
    }
    //maybe broke after convert to generic T
    return (T) currentNode.value;
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

  public static LinkedList reverseList(LinkedList list) {
    Node previousNode = null;
    Node currentNode = list.head;
    while (currentNode != null) {
      Node nextNode = currentNode.next;
      currentNode.next = previousNode;
      previousNode = currentNode;
      currentNode = nextNode;
    }
    list.head = previousNode;
    return list;
  }
}
