package codechallenges;

import codechallenges.cc26.InsertionSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static codechallenges.cc26.InsertionSort.insertionSort;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class cc26Test {

  @Test
  public void insertionSortTest() {
    int[] testArray = {8,4,23,42,16,15};
    assertEquals("[4, 8, 15, 16, 23, 42]", Arrays.toString(insertionSort(testArray)));
  }
}
