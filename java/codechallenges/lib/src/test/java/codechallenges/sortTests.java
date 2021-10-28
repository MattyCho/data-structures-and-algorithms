package codechallenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static codechallenges.cc26.InsertionSort.insertionSort;
import static codechallenges.cc27.MergeSort.mergeSort;
import static codechallenges.cc28.QuickSort.quickSort;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class sortTests {

  @Test
  public void insertionSortTest() {
    int[] testArray = {8,4,23,42,16,15};
    assertEquals("[4, 8, 15, 16, 23, 42]", Arrays.toString(insertionSort(testArray)));
  }

  @Test
  public void mergeSortTest() {
    int[] testArray = {8, 3, 23, 42, 16, 15};
    assertEquals("[3, 8, 15, 16, 23, 42]", Arrays.toString(mergeSort(testArray)));
    int[] testArray2 = {8, 3, 23, 42, 16, 15, 500, -1};
    System.out.println(Arrays.toString(mergeSort(testArray2)));
    assertEquals("[-1, 3, 8, 15, 16, 23, 42, 500]", Arrays.toString(mergeSort(testArray2)));
  }

  @Test
  public void quickSortTest() {
    int[] testArray = {8, 4, 23, 42, 16, 15};
    int x = testArray.length-1;
    System.out.println(Arrays.toString(quickSort(testArray, 0, x)));
    assertEquals("[4, 8, 15, 16, 23, 42]", Arrays.toString(quickSort(testArray, 0, x)));
  }
}
