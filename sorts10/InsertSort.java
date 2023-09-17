package sorts10;


import java.util.*;

public class InsertSort {


  public static void insertSort(int[] array) {
    if (array == null) {
      throw new IllegalArgumentException("The input array cannot be null or empty");
    }
    if (array.length <= 1) {
      return;
    }
    int n = array.length;
    for (int i = 1; i < n; i++) {
      int baseElement = array[i];
      int j = i - 1;
      while (j >= 0 && array[j] > baseElement) {
        array[j + 1] = array[j];
        j--;
      }
      array[j + 1] = baseElement;
    }
  }

  
  public static void main(String[] args) {
    int[] unorderedArray = {2, 1, 1, 9, 8, 5};
    System.out.println(Arrays.toString(unorderedArray));
    insertSort(unorderedArray);
    System.out.println(Arrays.toString(unorderedArray));
  }
}
