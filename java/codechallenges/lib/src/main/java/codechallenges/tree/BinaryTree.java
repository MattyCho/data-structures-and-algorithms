package codechallenges.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree<T>
{
  Node<T> root;
  List outputValues = new ArrayList();

  public Object[] preOrderTraversal(Node node)
  {
    if (node == null) {
      throw new IllegalArgumentException("The root node is null");
    }

    outputValues.add(node.value);
    if (node.leftNode != null) {
      preOrderTraversal(node.leftNode);
    }
    if (node.rightNode != null) {
      preOrderTraversal(node.rightNode);
    }
    Object[] outputArray = outputValues.toArray();
    return outputArray;
  }

  public Object[] inOrderTraversal(Node node)
  {
    if (node == null) {
      throw new IllegalArgumentException("The root node is null");
    }
    if (node.leftNode != null) {
      inOrderTraversal(node.leftNode);
    }
    outputValues.add(node.value);
    if (node.rightNode != null) {
      inOrderTraversal(node.rightNode);
    }
    Object[] outputArray = outputValues.toArray();
    return outputArray;
  }

  public Object[] postOrderTraversal(Node node)
  {
    if (node == null) {
      throw new IllegalArgumentException("The root node is null");
    }

    if (node.leftNode != null) {
      postOrderTraversal(node.leftNode);
    }
    if (node.rightNode != null) {
      postOrderTraversal(node.rightNode);
    }
    outputValues.add(node.value);

    Object[] outputArray = outputValues.toArray();
    return outputArray;
  }

  public int maxValue() {
    return 0;
  }

  public List<T> breadthFirst(BinaryTree tree) {
    if (tree.root == null) {
      throw new IllegalArgumentException("This tree is empty");
    }
    Queue<Node> newQueue = new LinkedList<Node>();
    newQueue.add(tree.root);
    List<T> outputList = new ArrayList<>();
    while (!newQueue.isEmpty()) {
      Node frontNode = newQueue.poll();
      outputList.add((T) frontNode.value);

      if (frontNode.leftNode !=null) {
        newQueue.add(frontNode.leftNode);
      }
      if (frontNode.rightNode !=null) {
        newQueue.add(frontNode.rightNode);
      }
    }
    System.out.println(outputList.toString());
    return outputList;
  }
}
