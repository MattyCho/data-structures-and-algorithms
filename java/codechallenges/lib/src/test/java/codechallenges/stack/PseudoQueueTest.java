package codechallenges.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PseudoQueueTest {

  @Test void enqueueTest() {
    PseudoQueue testPseudo = new PseudoQueue();
    testPseudo.enqueue(1);
    testPseudo.enqueue(2);
    testPseudo.enqueue(3);
    assertEquals(3, testPseudo.stackOne.top.value);
  }

  @Test void dequeueTest() {
    PseudoQueue testPseudo = new PseudoQueue();
    testPseudo.enqueue(1);
    testPseudo.enqueue(2);
    testPseudo.enqueue(3);

    assertEquals(1, testPseudo.dequeue());

    testPseudo.enqueue(4);
    assertEquals(2, testPseudo.dequeue());
    assertEquals(3, testPseudo.dequeue());
    assertEquals(4, testPseudo.dequeue());
  }
}
