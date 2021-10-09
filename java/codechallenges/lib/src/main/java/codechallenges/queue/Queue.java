package codechallenges.queue;

import codechallenges.linkedlist.LinkedList;

public class Queue<T> {
  Node<T> front;
  Node<T> back;

  void enqueue(T value) {
    Node<T> newNode = new Node<T>(value);
    if (this.front == null && this.back == null) {
      this.front = newNode;
      this.back = newNode;
    }
    this.back.next = newNode;
    this.back = newNode;
  }

  T dequeue() {
    if (this.front == null) {
      throw new IllegalArgumentException("Queue is already empty");
    }
    T frontValue = this.front.value;
    this.front = this.front.next;
    return frontValue;
  }

  T peek() {
    return this.front.value;
  }

  boolean isEmpty() {
    if (this.front == null && this.back == null) {
      return true;
    }
    return false;
  }
}
