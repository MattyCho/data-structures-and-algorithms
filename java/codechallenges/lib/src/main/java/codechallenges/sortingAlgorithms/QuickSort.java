package codechallenges.sortingAlgorithms;

public class QuickSort {

  public static int[] quickSort(int[] arr, int left, int right) {
    if (left < right) {
      int position = partition(arr, left, right);
      quickSort(arr, left, position-1);
      quickSort(arr, position+1, right);
    }
    return arr;
  }

  // last element is set as the pivot, all smaller values are placed to the left and all larger values are placed to
  // the right of the pivot.
  public static int partition(int[]arr, int left, int right) {
    int pivot = arr[right];

    int low = (left-1);
    for (int i = left; i < right; i++) {
      if (arr[i] < pivot) {
        low++;
//        swap(arr, i, low);
      }
    }
    swap(arr, right, low+1);
    return low+1;
  }

  //swaps two elements.
  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
