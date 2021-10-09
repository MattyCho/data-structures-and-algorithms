package codechallenges.tree;

import java.util.ArrayList;
import java.util.List;

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
}
