package codechallenges.tree;

public class Node<T> {
  public T value;
  public Node<T> leftNode;
  public Node<T> rightNode;

  public Node(T value) {
    this.value = value;
  }
}
