package codechallenges.sortingAlgorithms;

import java.util.Arrays;

public class MergeSort {

  public static int[] mergeSort(int[] arr) {
    int n = arr.length;

    if (n > 1) {
      int mid = n/2;
      int[] left;
      left = Arrays.copyOfRange(arr, 0, mid);
//      for (int i = 0; i < left.length; i++) {
//        left[i] = arr[i];
//      }
      int[] right;
      right = Arrays.copyOfRange(arr, mid, n);
//      for (int i = 0; i < right.length; i++) {
//        right[i] = arr[mid+i];
//      }
      mergeSort(left);
      mergeSort(right);
      merge(left, right, arr);
    }
    return arr;
  }

  public static int[] merge(int[] left, int[] right, int[] arr){
    int i = 0;
    int j = 0;
    int k = 0;

    while (i < left.length && j < right.length) {
      if (left[i] <= right[j]) {
        arr[k] = left[i];
        i++;
      } else {
        arr[k] = right[j];
        j++;
      }
      k++;
    }

    if (i == left.length) {
      for (;j < right.length; j++) {
        arr[k] = right[j];
        k++;
      }
    } else {
      for (;i < left.length; i++) {
        arr[k] = left[i];
        k++;
      }
    }
    return arr;
  }
}
