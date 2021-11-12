package codechallenges.tree;

import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

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
    BinaryTree<String> newTree = new BinaryTree<>();
    Node<String> nodeA = new Node<>("A");
    Node<String> nodeB = new Node<>("B");
    Node<String> nodeC = new Node<>("C");
    Node<String> nodeD = new Node<>("D");
    Node<String> nodeE = new Node<>("E");
    Node<String> nodeF = new Node<>("F");
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
  public void breadthFirstTest() {
    BinaryTree<String> newTree = new BinaryTree<>();
    Node<String> nodeA = new Node<>("A");
    Node<String> nodeB = new Node<>("B");
    Node<String> nodeC = new Node<>("C");
    Node<String> nodeD = new Node<>("D");
    Node<String> nodeE = new Node<>("E");
    Node<String> nodeF = new Node<>("F");
    nodeA.leftNode = nodeB;
    nodeA.rightNode = nodeC;
    nodeB.leftNode = nodeD;
    nodeB.rightNode = nodeE;
    nodeC.leftNode = nodeF;
    newTree.root = nodeA;

    newTree.breadthFirst(newTree);
  }

  @Test
  void add_root_node_test(){
    BinarySearchTree<Integer> newTree = new BinarySearchTree<>();
    newTree.add(8, newTree.root);
    assertEquals(8, newTree.root.value);
  }

  @Test
  void add_left_node_test(){
    BinarySearchTree<Integer> newTree = new BinarySearchTree<>();
    newTree.add(8, newTree.root);
    newTree.add(3, newTree.root);
    assertEquals(3, newTree.root.leftNode.value);
  }

  @Test
  void add_right_node_test(){
    BinarySearchTree<Integer> newTree = new BinarySearchTree<>();
    newTree.add(8, newTree.root);
    newTree.add(30, newTree.root);
    assertEquals(30, newTree.root.rightNode.value);
  }

  @Test
  void contains_test(){
    BinarySearchTree<Integer> newTree = new BinarySearchTree<>();
    newTree.add(8, newTree.root);
    newTree.add(3, newTree.root);
    newTree.add(30, newTree.root);
    newTree.add(1, newTree.root);
    newTree.add(5, newTree.root);
    newTree.add(44, newTree.root);
    assertEquals(true, newTree.contains(30, newTree.root));
  }

  @Test
  void find_max_value_test(){
    BinarySearchTree<Integer> newTree = new BinarySearchTree<>();
    newTree.add(8, newTree.root);
    newTree.add(3, newTree.root);
    newTree.add(30, newTree.root);
    newTree.add(1, newTree.root);
    newTree.add(5, newTree.root);
    newTree.add(44, newTree.root);
    newTree.add(100, newTree.root);

    ArrayList<Integer> values = new ArrayList<>();
    assertEquals(100, newTree.findMaxValue(newTree.root));
  }
}
