package codechallenges.linkedlist;

public class Node<T> {
  public T value;
  public Node next;

  Node(T value) {
    this.value = value;
    this.next = null;
  }
}
