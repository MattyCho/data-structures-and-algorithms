package codechallenges.tree;

import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {

  @Test
  public void preOrderTraversalTest() {
    BinaryTree newTree = new BinaryTree();
    Node nodeA = new Node("A");
    Node nodeB = new Node("B");
    Node nodeC = new Node("C");
    Node nodeD = new Node("D");
    Node nodeE = new Node("E");
    Node nodeF = new Node("F");
    nodeA.leftNode = nodeB;
    nodeA.rightNode = nodeC;
    nodeB.leftNode = nodeD;
    nodeB.rightNode = nodeE;
    nodeC.leftNode = nodeF;
    newTree.root = nodeA;

    Object[] results = newTree.preOrderTraversal(nodeA);
    System.out.println(newTree.outputValues);   // [ A, B, D, E, C, F]
    assertEquals("A", results[0]);
    assertEquals("B", results[1]);
    assertEquals("C", results[4]);
    assertEquals("D", results[2]);
    assertEquals("E", results[3]);
    assertEquals("F", results[5]);

  }

  @Test
  public void inOrderTraversalTest() {
    BinaryTree newTree = new BinaryTree();
    Node nodeA = new Node("A");
    Node nodeB = new Node("B");
    Node nodeC = new Node("C");
    Node nodeD = new Node("D");
    Node nodeE = new Node("E");
    Node nodeF = new Node("F");
    nodeA.leftNode = nodeB;
    nodeA.rightNode = nodeC;
    nodeB.leftNode = nodeD;
    nodeB.rightNode = nodeE;
    nodeC.leftNode = nodeF;
    newTree.root = nodeA;

    Object[] results = newTree.inOrderTraversal(nodeA);
    System.out.println(newTree.outputValues);    // [ D, B, E, A, F, C]
    assertEquals("A", results[3]);
    assertEquals("B", results[1]);
    assertEquals("C", results[5]);
    assertEquals("D", results[0]);
    assertEquals("E", results[2]);
    assertEquals("F", results[4]);
  }

  @Test
  public void postorderTraversalTest() {
    BinaryTree newTree = new BinaryTree();
    Node nodeA = new Node("A");
    Node nodeB = new Node("B");
    Node nodeC = new Node("C");
    Node nodeD = new Node("D");
    Node nodeE = new Node("E");
    Node nodeF = new Node("F");
    nodeA.leftNode = nodeB;
    nodeA.rightNode = nodeC;
    nodeB.leftNode = nodeD;
    nodeB.rightNode = nodeE;
    nodeC.leftNode = nodeF;
    newTree.root = nodeA;

    Object[] results = newTree.postOrderTraversal(nodeA);
    System.out.println(newTree.outputValues);    // [ D, E, B, F, C, A]
    assertEquals("A", results[5]);
    assertEquals("B", results[2]);
    assertEquals("C", results[4]);
    assertEquals("D", results[0]);
    assertEquals("E", results[1]);
    assertEquals("F", results[3]);
  }

  @Test
  public void addBSTTest() {
    BinarySearchTree newTree = new BinarySearchTree();
    newTree.add(5);

    newTree.inOrderTraversal(newTree.root);
  }
}
