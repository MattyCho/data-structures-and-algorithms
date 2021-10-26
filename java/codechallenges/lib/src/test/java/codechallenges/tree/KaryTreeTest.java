package codechallenges.tree;

import org.checkerframework.checker.units.qual.K;
import org.junit.jupiter.api.Test;

public class KaryTreeTest {

  @Test
  public void KaryTreeTest() {
    KaryTree newTree = new KaryTree();
    KaryNode nodeA = new KaryNode("A");
    KaryNode nodeB = new KaryNode("B");
    KaryNode nodeC = new KaryNode("C");
    KaryNode nodeD = new KaryNode("D");
    KaryNode nodeE = new KaryNode("E");
    KaryNode nodeF = new KaryNode("F");
    KaryNode nodeG = new KaryNode("G");
    newTree.root = nodeA;
    nodeA.nodes.add(nodeB);
    nodeA.nodes.add(nodeC);
    nodeA.nodes.add(nodeD);
    nodeC.nodes.add(nodeE);
    nodeC.nodes.add(nodeF);
    nodeC.nodes.add(nodeG);

    newTree.breadthFirstTraversal(newTree);
  }
}
