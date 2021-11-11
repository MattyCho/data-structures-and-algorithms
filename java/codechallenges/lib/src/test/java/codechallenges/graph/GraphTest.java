package codechallenges.graph;

import org.junit.jupiter.api.Test;

import java.util.*;

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

  @Test
  void graphBreadFirstTest() {
    Graph<String> sut = new Graph<>();

    Vertex<String> pandoraNode = sut.addNode("Pandora");
    Vertex<String> arendelleNode = sut.addNode("Arendelle");
    Vertex<String> metrovilleNode = sut.addNode("Metroville");
    Vertex<String> monstropolisNode = sut.addNode("Monstropolis");
    Vertex<String> narniaNode = sut.addNode("Narnia");
    Vertex<String> nabooNode = sut.addNode("Naboo");

    sut.addEdge(pandoraNode, arendelleNode, 150);
    sut.addEdge(arendelleNode, pandoraNode, 150);
    sut.addEdge(pandoraNode, metrovilleNode, 82);
    sut.addEdge(metrovilleNode, pandoraNode, 82);
    sut.addEdge(arendelleNode, metrovilleNode, 99);
    sut.addEdge(metrovilleNode, arendelleNode, 99);
    sut.addEdge(arendelleNode, monstropolisNode, 42);
    sut.addEdge(monstropolisNode, arendelleNode, 42);
    sut.addEdge(metrovilleNode, monstropolisNode, 105);
    sut.addEdge(monstropolisNode, metrovilleNode, 105);
    sut.addEdge(metrovilleNode, narniaNode, 37);
    sut.addEdge(narniaNode, metrovilleNode, 37);
    sut.addEdge(metrovilleNode, nabooNode, 26);
    sut.addEdge(nabooNode, metrovilleNode, 26);
    sut.addEdge(monstropolisNode, nabooNode, 73);
    sut.addEdge(nabooNode, monstropolisNode, 73);
    sut.addEdge(narniaNode, nabooNode, 250);
    sut.addEdge(nabooNode, narniaNode, 250);

    String testString = "[Pandora, Arendelle, Metroville, Monstropolis, Narnia, Naboo]";
    assertEquals(testString, sut.breadthFirst(pandoraNode).toString());
  }

  @Test
  void businessTripTest() {
    Graph<String> sut = new Graph<>();

    Vertex<String> pandoraNode = sut.addNode("Pandora");
    Vertex<String> arendelleNode = sut.addNode("Arendelle");
    Vertex<String> metrovilleNode = sut.addNode("Metroville");
    Vertex<String> monstropolisNode = sut.addNode("Monstropolis");
    Vertex<String> narniaNode = sut.addNode("Narnia");
    Vertex<String> nabooNode = sut.addNode("Naboo");

    sut.addEdge(pandoraNode, arendelleNode, 150);
    sut.addEdge(arendelleNode, pandoraNode, 150);
    sut.addEdge(pandoraNode, metrovilleNode, 82);
    sut.addEdge(metrovilleNode, pandoraNode, 82);
    sut.addEdge(arendelleNode, metrovilleNode, 99);
    sut.addEdge(metrovilleNode, arendelleNode, 99);
    sut.addEdge(arendelleNode, monstropolisNode, 42);
    sut.addEdge(monstropolisNode, arendelleNode, 42);
    sut.addEdge(metrovilleNode, monstropolisNode, 105);
    sut.addEdge(monstropolisNode, metrovilleNode, 105);
    sut.addEdge(metrovilleNode, narniaNode, 37);
    sut.addEdge(narniaNode, metrovilleNode, 37);
    sut.addEdge(metrovilleNode, nabooNode, 26);
    sut.addEdge(nabooNode, metrovilleNode, 26);
    sut.addEdge(monstropolisNode, nabooNode, 73);
    sut.addEdge(nabooNode, monstropolisNode, 73);
    sut.addEdge(narniaNode, nabooNode, 250);
    sut.addEdge(nabooNode, narniaNode, 250);

    String[] testArray = {"Metroville", "Pandora"};
    assertEquals("true, $82", sut.businessTrip(sut, testArray));
    System.out.println(sut.businessTrip(sut, testArray));
    String[] testArray2 = {"Arendelle", "Monstropolis", "Naboo"};
    assertEquals("true, $115", sut.businessTrip(sut, testArray2));
    System.out.println(sut.businessTrip(sut, testArray2));
    String[] testArray3 = {"Naboo", "Pandora"};
    assertEquals("false, $0", sut.businessTrip(sut, testArray3));
    System.out.println(sut.businessTrip(sut, testArray3));
    String[] testArray4 = {"Narnia", "Arendelle", "Naboo"};
    assertEquals("false, $0", sut.businessTrip(sut, testArray4));
    System.out.println(sut.businessTrip(sut, testArray4));
  }

  @Test
  void graphDepthFirstTest() {
    Graph<String> sut = new Graph<>();

    Vertex<String> aNode = sut.addNode("A");
    Vertex<String> bNode = sut.addNode("B");
    Vertex<String> cNode = sut.addNode("C");
    Vertex<String> dNode = sut.addNode("D");
    Vertex<String> eNode = sut.addNode("E");
    Vertex<String> fNode = sut.addNode("F");
    Vertex<String> gNode = sut.addNode("G");
    Vertex<String> hNode = sut.addNode("H");

    sut.addEdge(aNode, bNode, 0);
    sut.addEdge(bNode, aNode, 0);
    sut.addEdge(bNode, dNode, 0);
    sut.addEdge(dNode, bNode, 0);
    sut.addEdge(aNode, dNode, 0);
    sut.addEdge(dNode, aNode, 0);
    sut.addEdge(bNode, cNode, 0);
    sut.addEdge(cNode, bNode, 0);
    sut.addEdge(cNode, gNode, 0);
    sut.addEdge(gNode, cNode, 0);
    sut.addEdge(dNode, eNode, 0);
    sut.addEdge(eNode, dNode, 0);
    sut.addEdge(dNode, fNode, 0);
    sut.addEdge(fNode, dNode, 0);
    sut.addEdge(dNode, hNode, 0);
    sut.addEdge(hNode, dNode, 0);
    sut.addEdge(fNode, hNode, 0);
    sut.addEdge(hNode, fNode, 0);

    sut.depthFirst(aNode);
  }
}
