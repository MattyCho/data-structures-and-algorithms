package codechallenges.hashMap;

import codechallenges.tree.BinaryTree;
import codechallenges.tree.Node;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static codechallenges.hashMap.HashMap.repeatedWords;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HashMapTest {

  @Test
  void hashMapTest() {
    HashMap<Integer, String> testHashMap = new HashMap(10);
    testHashMap.add(1, "test");
    System.out.println(testHashMap.get(1));
    System.out.println(testHashMap.contains(1));
  }

  @Test
  void repeatedWordTest() {
    String testString = "Once upon a time, there was a brave princess who...";
    String testString2 = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
    String testString3 = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";

    assertEquals("a", repeatedWords(testString));
    assertEquals("summer", repeatedWords(testString2));
    assertEquals("it", repeatedWords(testString3));
  }

  @Test
  void treeIntersectionTest() {
    BinaryTree<Integer> testTreeOne = new BinaryTree<>();
    Node node1 = new Node(1);
    Node node2 = new Node(2);
    Node node3 = new Node(3);
    Node node4 = new Node(4);
    Node node5 = new Node(5);
    testTreeOne.root = node1;
    node1.leftNode = node2;
    node1.rightNode = node3;
    node2.leftNode = node4;
    node2.rightNode = node5;

    BinaryTree<Integer> testTreeTwo = new BinaryTree<>();
    Node node11 = new Node(6);
    Node node22 = new Node(7);
    Node node33 = new Node(8);
    Node node44 = new Node(9);
    Node node55 = new Node(3);
    testTreeTwo.root = node11;
    node11.leftNode = node22;
    node11.rightNode = node33;
    node22.leftNode = node44;
    node22.rightNode = node55;

    HashMap newHashMap = new HashMap<>(10);
    List testList = new ArrayList();
    testList.add(3);
    assertEquals(testList, newHashMap.treeIntersection(testTreeOne, testTreeTwo));
  }
}
