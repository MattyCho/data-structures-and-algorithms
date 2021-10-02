package codechallenges.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
  @Test void pushTest() {
    Stack newStack = new Stack();
    newStack.push(1);
    newStack.push(2);
    newStack.push(3);
    assertEquals(3, newStack.top.value, "push method failed");
  }

  @Test void popTest() {
    Stack newStack = new Stack();
    newStack.push(1);
    newStack.push(2);
    newStack.push(3);
    assertEquals(3, newStack.pop(), "pop method failed");
    assertEquals(2, newStack.pop(), "pop method failed");
    assertEquals(1, newStack.pop(), "pop method failed");
  }

  @Test void peekTest() {
    Stack newStack = new Stack();
    newStack.push(1);
    newStack.push(2);
    newStack.push(3);
    assertEquals(3, newStack.peek(), "peek method failed");
  }

  @Test void isEmptyTest() {
    Stack newStack = new Stack();
    Stack nullStack = new Stack();
    newStack.push(1);
    newStack.push(2);
    newStack.push(3);
    assertTrue(nullStack.isEmpty(), "isEmpty method failed");
    assertFalse(newStack.isEmpty(), "isEmpty method failed");
  }
}
