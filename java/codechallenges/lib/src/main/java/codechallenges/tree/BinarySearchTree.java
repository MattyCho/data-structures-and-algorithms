package codechallenges.tree;

import java.util.ArrayList;

public class BinarySearchTree<T extends Comparable<? super T>> extends BinaryTree<T>
{
  Node<T> pointerNode = this.root;

  public Node<T> add(T value, Node<T> currentNode)
  {
    Node<T> newNode = new Node<>(value);
    if (this.root == null) {
      this.root = newNode;
      return newNode;
    }
    if (currentNode == null) {
      return newNode;
    }
    if (value.compareTo(currentNode.value) > 0) {
      currentNode.rightNode = this.add(value, currentNode.rightNode);
    } else if (value.compareTo(currentNode.value) < 0) {
      currentNode.leftNode = this.add(value, currentNode.leftNode);
    }
    return currentNode;
  }

  public boolean contains(T value, Node<T> currentNode){
    if(value.compareTo(currentNode.value) == 0){return true;}
    if(value.compareTo(currentNode.value) > 0){return this.contains(value, currentNode.rightNode);}
    if(value.compareTo(currentNode.value) < 0){return this.contains(value, currentNode.leftNode);}
    return false;
  }

  public Integer findMaxValue(Node<T> node){
    Integer largest = Integer.MIN_VALUE;
    ArrayList<Node<T>> pseudoQueue = new ArrayList<>();
    pseudoQueue.add(node);
    while(pseudoQueue.size() > 0){
      Node<T> currentNode = pseudoQueue.remove(0);
      largest = largest.compareTo((Integer) currentNode.value) < 0  ? (Integer) currentNode.value : largest;
      if(currentNode.leftNode != null) {pseudoQueue.add(currentNode.leftNode);}
      if(currentNode.rightNode != null) {pseudoQueue.add(currentNode.rightNode);}
    }
    return largest;
  }
}
