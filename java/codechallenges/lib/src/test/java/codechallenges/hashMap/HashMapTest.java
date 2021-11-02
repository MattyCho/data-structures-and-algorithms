package codechallenges.hashMap;

import codechallenges.linkedlist.LinkedList;
import org.junit.jupiter.api.Test;

public class HashMapTest {

  @Test
  void hashMapTest() {
    HashMap<Integer, String> testHashMap = new HashMap(10);
    testHashMap.add(1, "test");
    System.out.println(testHashMap.get(1));
    System.out.println(testHashMap.contains(1));
  }
}
