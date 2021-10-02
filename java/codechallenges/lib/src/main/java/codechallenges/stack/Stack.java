package codechallenges.stack;

public class Stack<T> {
  Node<T> top;

  void push(T value) {
    Node newNode = new Node<T>(value);
    newNode.next = this.top;
    this.top = newNode;
  }

  T pop() {
    if (this.top == null) {
      throw new IllegalArgumentException("Stack is already empty");
    }
    T topValue = this.top.value;
    this.top = this.top.next;
    return topValue;
  }

  T peek() {
    return this.top.value;
  }

  boolean isEmpty() {
    if (this.top == null) {
      return true;
    }
    return false;
  }
}
