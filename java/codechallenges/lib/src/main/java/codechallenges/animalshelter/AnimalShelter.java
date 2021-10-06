package codechallenges.animalshelter;

import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter {
  Node<Animal> front;
  Node<Animal> back;
  Queue<Dog> dogQueue = new LinkedList<>();
  Queue<Cat> catQueue = new LinkedList<>();

  public void enqueue(Dog dog) {
    dogQueue.add(dog);
  }
  public void enqueue(Cat cat) {
    catQueue.add(cat);
  }

  public Animal dequeue(String pref) {
    if (pref.toLowerCase().equals("dog")) {
      Dog newDog = dogQueue.remove();
      System.out.println("Name: " + newDog.name);
      System.out.println("Type: " + newDog.type);
      return newDog;
    } else if (pref.toLowerCase().equals("cat")) {
      Cat newCat = catQueue.remove();
      System.out.println("Name: " + newCat.name);
      System.out.println("Type: " + newCat.type);
      return newCat;
    } else {
      throw new IllegalArgumentException("Unknown animal preference. Please pick a dog or a cat.");
    }
  }
}
