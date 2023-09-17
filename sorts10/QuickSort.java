package sorts10;

import java.util.*;


public class QuickSort {



  public static void quickSort(int[] array, int leftIndex, int rightIndex) {
    if (leftIndex >= rightIndex) {
      return;
    } 
    int pivotIndex = partition(array, leftIndex, rightIndex);

    quickSort(array, leftIndex, pivotIndex - 1);
    quickSort(array, pivotIndex + 1, rightIndex);
        
  }

  public static int partition(int[] array, int leftIndex, int rightIndex) {
    int i = leftIndex;
    int j = rightIndex;
    while (i < j) {
      while (i < j && array[j] >= array[leftIndex]) {
        j--;
      }
      while (i < j && array[i] <= array[leftIndex]) {
        i++;
      }
      swapElementInArray(array, i, j);
    }
    swapElementInArray(array, i, leftIndex);
    return i;
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
    quickSort(unorderedArray, 0, unorderedArray.length - 1);
    System.out.println(Arrays.toString(unorderedArray));
  }
}
