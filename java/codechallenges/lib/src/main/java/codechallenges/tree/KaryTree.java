package codechallenges.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KaryTree<T> {
  KaryNode<T> root;

  public List<T> breadthFirstTraversal(KaryTree tree) {
    if (tree.root == null) {
      throw new IllegalArgumentException("This tree is empty");
    }

    Queue<KaryNode> newQueue = new LinkedList<>();
    newQueue.add(tree.root);
    List<T> outputList = new ArrayList<>();
    while (!newQueue.isEmpty()) {
      KaryNode frontNode = newQueue.poll();
      outputList.add((T) frontNode.value);
      for (Object node: frontNode.nodes) {
        newQueue.add((KaryNode) node);
      }
    }
    System.out.println(outputList.toString());
    return outputList;
  }
}
