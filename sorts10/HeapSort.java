package sorts10;

import java.util.*;


public class HeapSort {

  public static void heapSort(int[] array) {
    if (array == null) {
      throw new IllegalArgumentException("The input array cannot be null");
    }
    if (array.length <= 1) {
      return;
    }
    int n = array.length;
    for (int i = n / 2 - 1; i >= 0; i--) {
      heapify(array, i, n);
    }
    for (int i = n - 1; i > 0; i--) {
      swapElementInArray(array, 0, i);
      heapify(array, 0, i);
    }
  }


  public static void heapify(int[] array, int i, int n) {
    int maxValueIndex = i;
    int leftIndex = 2 * i + 1;
    int rightIndex = 2 * i + 2;

    if (leftIndex < n && array[leftIndex] > array[maxValueIndex]) {
      maxValueIndex = leftIndex;
    }
    if (rightIndex < n && array[rightIndex] > array[maxValueIndex]) {
      maxValueIndex = rightIndex;
    }
    if (i != maxValueIndex) {
      swapElementInArray(array, i, maxValueIndex);
      heapify(array, maxValueIndex, n);
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
    heapSort(unorderedArray);
    System.out.println(Arrays.toString(unorderedArray));
  }
}
