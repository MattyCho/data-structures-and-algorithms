package codechallenges.queue;

import codechallenges.linkedlist.LinkedList;

public class Queue<T> {
  Node<T> front;
  Node<T> back;

  public void enqueue(T value) {
    Node<T> newNode = new Node<T>(value);
    if (this.front == null && this.back == null) {
      this.front = newNode;
      this.back = newNode;
      this.front.next = null;
    } else {
      this.back.next = newNode;
      this.back = newNode;
    }
  }

  public Node<T> dequeue() {
    if (this.front == null) {
      throw new IllegalArgumentException("Queue is already empty");
    }
    Node<T> frontNode = this.front;
    this.front = this.front.next;
    if (this.front == null) {
      this.back = null;
    }
    return frontNode;
  }

  public T peek() {
    return this.front.value;
  }

  public boolean isEmpty() {
    if (this.front == null && this.back == null) {
      return true;
    }
    return false;
  }
}
