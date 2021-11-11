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

  List<Vertex<T>> depthFirst(Vertex<T> startingVertex) {
    List<Vertex<T>> outputList = new ArrayList<>();
    Stack<Vertex> vertexStack = new Stack<>();
    HashMap<Vertex<T>, Integer> visitedVertices = new HashMap<>();

    vertexStack.push(startingVertex);
    while (!vertexStack.empty()) {
      Vertex<T> currentVertex = vertexStack.peek();
      vertexStack.pop();

      if(!visitedVertices.containsKey(currentVertex)) {
        outputList.add(currentVertex);
        visitedVertices.put(currentVertex, 0);
      }
      List<Edge<T>> edgeList = getNeighbors(currentVertex);
      for (Edge<T> edge : edgeList) {
        Vertex<T> neighborVertex = edge.destination;
        if (!visitedVertices.containsKey(neighborVertex)) {
          vertexStack.push(neighborVertex);
        }
      }
    }
    System.out.println(outputList);
    return outputList;
  }

  String businessTrip(Graph<T> graph, String[] cityNames) {
    int totalCost = 0;
    boolean isDirectFlight = false;
    int arrayLength = cityNames.length;
    String outputString = "";
    Set<Vertex<T>> vertexSet = graph.getNodes();

    for (int i = 0; i < arrayLength; i++) {
      if (i + 1 >= arrayLength) {
        break;
      }
      for (Vertex<T> vertex : vertexSet) {
        if (vertex.value.equals(cityNames[i])) {
          List<Edge<T>> edgeList = getNeighbors(vertex);
          for (Edge<T> edge : edgeList) {
            if(edge.destination.value.equals(cityNames[i+1])) {
              totalCost += edge.weight;
              isDirectFlight = true;
              break;
            }
          }
          break;
        }
      }
    }
    outputString = isDirectFlight + ", $" + totalCost;
    return outputString;
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
