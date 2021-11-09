package codechallenges.graph;

import codechallenges.queue.Node;
import codechallenges.queue.Queue;

import java.util.*;

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

  List<Vertex<T>> breadthFirst(Vertex<T> root) {
    List<Vertex<T>> outputList = new ArrayList<>();
    Queue<Vertex<T>> breadth = new Queue<>();
    HashMap<Vertex<T>, Integer> visitedVertices = new HashMap<>();

    breadth.enqueue(root);
    visitedVertices.put(root, 0);

    while (!breadth.isEmpty()) {
      Vertex<T> front = breadth.dequeue().value;
      outputList.add(front);
      for (Edge edge : this.getNeighbors(front)) {
        if (!visitedVertices.containsKey(edge.destination)) {
          visitedVertices.put(edge.destination, 0);
          breadth.enqueue(edge.destination);
        }
      }
    }
    return outputList;
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
