package codechallenges.graph;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GraphTest {

  @Test
  void graphTest() {
    Graph<String> sut = new Graph<>();

    Vertex<String> aNode = sut.addNode("A");
    Vertex<String> bNode = sut.addNode("B");
    Vertex<String> cNode = sut.addNode("C");

    sut.addEdge(aNode, bNode, 1);
    sut.addEdge(aNode, cNode, 2);
    sut.addEdge(bNode, aNode, 3);
    sut.addEdge(cNode, aNode, 4);

    String testString = "A: B(weight: 1) -> C(weight: 2) -> NULL\nB: A(weight: 3) -> NULL\nC: A(weight: 4) -> NULL\n";
    // Testing addNode() and addEdge()
    assertEquals(testString, sut.toString());
    // Testing size()
    assertEquals(3, sut.size());
    // Testing getNodes()
    Set<Vertex> testSet = new HashSet<>();
    testSet.add(aNode);
    testSet.add(bNode);
    testSet.add(cNode);
    assertEquals(testSet, sut.getNodes());
  }
}
