package lessons;

import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    int[] unsortedArray = {5, 12, -25, 0, 5, 16, -100, 1000};
    int[] unsortedArrayEmpty = {};//as a test data
    int[] unsortedArrayOneValue = {0}; //as a test data

    System.out.println("Entered array                           " + Arrays.toString(unsortedArray));
    System.out.println("Sorted array                            " + Arrays.toString(bubbleSort(unsortedArray)));
    System.out.println("Test, that entered arrey is not changed " + Arrays.toString(unsortedArray));
  }

  private static int[] bubbleSort(int[] unsortedArray) {
    int[] sortedArray = unsortedArray.clone();
    for (int i = 0; i < sortedArray.length - 1; ++i) {
      for (int j = 0; j < sortedArray.length - 1; ++j) {
        int min = sortedArray[j];
        int max = sortedArray[j + 1];
        if (min > max) {
          sortedArray[j] = max;
          sortedArray[j + 1] = min;
        }
      }
    }
    return sortedArray;
  }
}
