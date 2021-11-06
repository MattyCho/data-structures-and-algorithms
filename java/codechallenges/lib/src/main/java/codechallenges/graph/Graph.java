package codechallenges.graph;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Graph<T extends Comparable<? super T>> {

  private int size = 0;
  private LinkedHashMap<Vertex<T>, LinkedList<Edge<T>>> adjacencyListsMap;

  public Graph() {
    this.adjacencyListsMap = new LinkedHashMap<Vertex<T>, LinkedList<Edge<T>>>();
  }

  Vertex<T> addNode(T value) {
    Vertex<T> newVertex = new Vertex<>(value);
    LinkedList<Edge<T>> newAdjacencyList = new LinkedList<>();
    adjacencyListsMap.put(newVertex, newAdjacencyList);
    size++;
    return newVertex;
  }

  void addEdge(Vertex<T> sourceVertex, Vertex<T> destinationVertex, int weight) {
    Edge<T> newEdge = new Edge<>(destinationVertex, weight);
    LinkedList<Edge<T>> adjacencyList = adjacencyListsMap.get(sourceVertex);
    adjacencyList.add(newEdge);
  }

  Set<Vertex<T>> getNodes() {
    return adjacencyListsMap.keySet();
  }

  List<Edge<T>> getNeighbors(Vertex<T> sourceVertex) {
    LinkedList<Edge<T>> adjacencyList = adjacencyListsMap.get(sourceVertex);
    return adjacencyList;
  }

  int size() {
    return this.size;
  }

  @Override
  public String toString() {
    Set<Vertex<T>> vertices = adjacencyListsMap.keySet();
    String graphString = "";
    for (Vertex<T> vertex : vertices) {
      List<Edge<T>> adjacencyList = adjacencyListsMap.get(vertex);
      graphString += vertex + ": ";
      for (Edge<T> edge : adjacencyList) {
        graphString += edge.destination + "(weight: " + edge.weight + ") -> ";
      }
      graphString += "NULL\n";
    }
    return graphString;
  }
}
