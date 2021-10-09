package codechallenges.LinkedList;

import codechallenges.linkedlist.LinkedList;
import org.junit.jupiter.api.Test;

import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

  @Test void kthFromEndTest() {
    LinkedList newLL = new LinkedList();
    newLL.insert(5);
    newLL.insert(4);
    newLL.insert(3);
    newLL.insert(2);
    newLL.insert(1);
    newLL.insert(0);
    newLL.insert(74);

    int k = 6;
    System.out.println(newLL.toString());
    System.out.println(k + " from the end = " + newLL.kthFromEnd(k));
  }

  @Test void zipListTest() {
    LinkedList list1 = new LinkedList();
    list1.insert(3);
    list1.insert(2);
    list1.insert(1);
    LinkedList list2 = new LinkedList();
    list2.insert(8);
    list2.insert(7);
    list2.insert(6);
    list2.insert(5);
    list2.insert(4);

    LinkedList newLL = LinkedList.zipLists(list1, list2);
    String output = newLL.toString();

    assertEquals("{ 1 } -> { 4 } -> { 2 } -> { 5 } -> { 3 } -> { 6 } -> { 7 } -> { 8 } -> NULL", output);
  }

  @Test void reverseListTest() {
    LinkedList list1 = new LinkedList();
    list1.insert(5);
    list1.insert(4);
    list1.insert(3);
    list1.insert(2);
    list1.insert(1);

    String output = LinkedList.reverseList(list1).toString();
    assertEquals("{ 5 } -> { 4 } -> { 3 } -> { 2 } -> { 1 } -> NULL", output, "Reverse List Method fails");
  }

}
