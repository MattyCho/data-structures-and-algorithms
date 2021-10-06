package codechallenges.animalshelter;

public class Node<Animal> {
  Animal animal;
  Node<Animal> next;

  Node(Animal animal) {
    this.animal = animal;
  }
}
