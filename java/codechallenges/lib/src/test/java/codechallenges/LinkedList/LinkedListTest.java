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

    System.out.println("toString test:");
    System.out.println(newLL.toString());

    System.out.println("List includes 3: " + newLL.includes(3));
    System.out.println("List includes 33: " + newLL.includes(33));

    System.out.println("Add 100 to the end of the list: ");
    newLL.append(100);
    System.out.println(newLL.toString());

    System.out.println("insert 15 after 2:");
    newLL.insertAfter(2, 15);
    System.out.println(newLL.toString());

    System.out.println("insert 44 before 5:");
    newLL.insertBefore(5, 44);
    System.out.println(newLL.toString());
  }
}
