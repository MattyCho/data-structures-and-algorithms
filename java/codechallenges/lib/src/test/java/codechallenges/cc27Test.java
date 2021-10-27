package codechallenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static codechallenges.cc27.MergeSort.mergeSort;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class cc27Test {

  @Test
  public void mergeSortTest() {
    int[] testArray = {8, 3, 23, 42, 16, 15};
    assertEquals("[3, 8, 15, 16, 23, 42]", Arrays.toString(mergeSort(testArray)));
    int[] testArray2 = {8, 3, 23, 42, 16, 15, 500, -1};
    System.out.println(Arrays.toString(mergeSort(testArray2)));
    assertEquals("[-1, 3, 8, 15, 16, 23, 42, 500]", Arrays.toString(mergeSort(testArray2)));

  }
}
