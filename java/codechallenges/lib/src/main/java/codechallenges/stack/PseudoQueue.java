package codechallenges.stack;

public class PseudoQueue<T> {
  Stack<T> stackOne = new Stack();
  Stack<T> stackTwo = new Stack();

  void enqueue(T value) {
    stackOne.push(value);
  }

  T dequeue() {
    if (stackOne.isEmpty() && stackTwo.isEmpty()) {
      System.out.println("Queue is already empty!");
      throw new IllegalArgumentException();
    } else if (stackTwo.isEmpty()) {
      while (!stackOne.isEmpty()) {
        T frontValue = stackOne.pop();
        stackTwo.push(frontValue);
      }
    }
    T frontValue = stackTwo.pop();
    return frontValue;
  }
}
