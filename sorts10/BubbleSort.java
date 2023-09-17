package sorts10;

import java.util.*;


public class BubbleSort {


  public static void bubbleSort(int[] array) {
    if (array == null) {
      throw new IllegalArgumentException("The input array cannot be null");
    }  
    if (array.length <= 1) {
      return;
    }
    int n = array.length;
    for (int i = n - 1; i > 0; i--) {
      boolean hasSwapped = false;
      for (int j = 0; j < i; j++) {
        if (array[j] > array[j + 1]) {
          swapElementInArray(array, j, j + 1);
          hasSwapped = true;
        }
      }
      if (!hasSwapped) {
        break;
      }
    }
  }


  public static void swapElementInArray(int[] array, int firstIndex, int secondIndex) {
    if (array == null || array.length == 0) {
      throw new IllegalArgumentException("The input array cannot be null or empty");
    } 
    if (firstIndex < 0 || firstIndex >= array.length || secondIndex < 0 || secondIndex >= array.length) {
      throw new IndexOutOfBoundsException("Invalid index values");
    }
    if (firstIndex != secondIndex) {
      int tempElement = array[firstIndex];
      array[firstIndex] = array[secondIndex];
      array[secondIndex] = tempElement;
    }
  }
  


  


  
  public static void main(String[] args) {
    int[] unorderedArray = {2, 1, 1, 9, 8, 5};
    System.out.println(Arrays.toString(unorderedArray));
    bubbleSort(unorderedArray);
    System.out.println(Arrays.toString(unorderedArray));
  }
}
