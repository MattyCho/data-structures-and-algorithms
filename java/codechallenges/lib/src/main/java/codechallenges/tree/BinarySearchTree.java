package codechallenges.tree;

public class BinarySearchTree<T extends Comparable<? super T>> extends BinaryTree<T>
{
  Node pointerNode = this.root;

  public void add(T value)
  {
    // TODO: implement me
    Node newNode = new Node(value);
    if (pointerNode == null) {
      this.root = newNode;
    }

    if (value < pointerNode.value) {
      if (pointerNode.leftNode == null) {
        pointerNode.leftNode = newNode;
      } else {
        pointerNode = pointerNode.leftNode;
      }
    } else if (value > pointerNode.value) {
      if (pointerNode.rightNode == null) {
        pointerNode.rightNode = newNode;
      } else {
        pointerNode = pointerNode.rightNode;
      }
    }
    add(value);
  }

  public boolean contains (T value)
  {
    // TODO: implement me
    return false;
  }
}
