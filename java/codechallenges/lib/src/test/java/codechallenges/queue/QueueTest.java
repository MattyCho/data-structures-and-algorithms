package codechallenges.queue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
  @Test void enqueueTest() {
    Queue newQueue = new Queue();
    newQueue.enqueue(1);
    newQueue.enqueue(2);
    newQueue.enqueue(3);
    assertEquals(1, newQueue.front.value, "enqueue method failed");
  }

  @Test void dequeueTest() {
    Queue newQueue = new Queue();
    newQueue.enqueue(1);
    newQueue.enqueue(2);
    newQueue.enqueue(3);
    assertEquals(1, newQueue.dequeue(), "dequeue method failed");
    assertEquals(2, newQueue.dequeue(), "dequeue method failed");
    assertEquals(3, newQueue.dequeue(), "dequeue method failed");
  }

  @Test void peekTest() {
    Queue newQueue = new Queue();
    newQueue.enqueue(1);
    newQueue.enqueue(2);
    newQueue.enqueue(3);
    assertEquals(1, newQueue.peek());
  }

  @Test void isEmpty() {
    Queue newQueue = new Queue();
    Queue nullQueue = new Queue();
    newQueue.enqueue(1);
    newQueue.enqueue(2);
    newQueue.enqueue(3);
    assertTrue(nullQueue.isEmpty());
    assertFalse(newQueue.isEmpty());
  }
}
