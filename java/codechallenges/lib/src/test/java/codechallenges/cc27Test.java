package codechallenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static codechallenges.cc27.MergeSort.mergeSort;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class cc27Test {

  @Test
  public void mergeSortTest() {
    int[] testArray = {8, 3, 23, 42, 16, 15};
    System.out.println(Arrays.toString(mergeSort(testArray)));
    assertEquals("[3, 8, 15, 16, 23, 42]", Arrays.toString(mergeSort(testArray)));
  }
}
