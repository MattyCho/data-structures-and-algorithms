package codechallenges.hashMap;

import org.junit.jupiter.api.Test;

import static codechallenges.hashMap.HashMap.repeatedWords;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HashMapTest {

  @Test
  void hashMapTest() {
    HashMap<Integer, String> testHashMap = new HashMap(10);
    testHashMap.add(1, "test");
    System.out.println(testHashMap.get(1));
    System.out.println(testHashMap.contains(1));
  }

  @Test
  void repeatedWordTest() {
    String testString = "Once upon a time, there was a brave princess who...";
    String testString2 = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
    String testString3 = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";

    assertEquals("a", repeatedWords(testString));
    assertEquals("summer", repeatedWords(testString2));
    assertEquals("it", repeatedWords(testString3));
  }
}
