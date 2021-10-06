package codechallenges.animalshelterTest;

import codechallenges.animalshelter.AnimalShelter;
import codechallenges.animalshelter.Cat;
import codechallenges.animalshelter.Dog;
import org.junit.jupiter.api.Test;

public class AnimalShelterTest {

  @Test void enqueueTest() {
    AnimalShelter newShelter = new AnimalShelter();
    Dog newDog = new Dog("Spot");
    Cat newCat = new Cat("Mittens");
    newShelter.enqueue(newDog);
    newShelter.enqueue(newCat);
  }

  @Test void dequeueTest() {
    AnimalShelter newShelter = new AnimalShelter();
    Dog newDog1 = new Dog("Spot");
    Dog newDog2 = new Dog("Sparky");
    Dog newDog3 = new Dog("Lassie");
    Cat newCat1 = new Cat("Mittens");
    Cat newCat2 = new Cat("Snowball");
    Cat newCat3 = new Cat("Leo");
    newShelter.enqueue(newDog1);
    newShelter.enqueue(newDog2);
    newShelter.enqueue(newDog3);
    newShelter.enqueue(newCat1);
    newShelter.enqueue(newCat2);
    newShelter.enqueue(newCat3);

    newShelter.dequeue("Dog");
    newShelter.dequeue("Dog");
    newShelter.dequeue("Dog");
    newShelter.dequeue("Cat");
    newShelter.dequeue("Cat");
    newShelter.dequeue("llama");

  }
}
