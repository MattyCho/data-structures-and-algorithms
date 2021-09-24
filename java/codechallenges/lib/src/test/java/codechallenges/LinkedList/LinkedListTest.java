package codechallenges.LinkedList;

import codechallenges.linkedlist.LinkedList;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

  @Test void testLL() {
    LinkedList newLL = new LinkedList();
    newLL.insert(5);
    newLL.insert(4);
    newLL.insert(3);
    newLL.insert(2);
    newLL.insert(1);
    newLL.insert(0);
    newLL.insert(74);

    System.out.println(newLL.toString());

    System.out.println(newLL.includes(3));
    System.out.println(newLL.includes(33));
  }
}
