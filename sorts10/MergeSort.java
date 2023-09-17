package sorts10;


import java.util.*;


public class MergeSort {


  public static int[] mergeSort(int[] array) {
    if (array.length <= 1) {
      return array;
    }
    int midIndex = array.length >> 1;
    int[] leftArray = Arrays.copyOfRange(array, 0, midIndex);
    int[] rightArray = Arrays.copyOfRange(array, midIndex, array.length);
    return merge(mergeSort(leftArray), mergeSort(rightArray));
  }


  

  public static int[] merge(int[] leftArray, int[] rightArray) {
    if (leftArray == null || leftArray.length == 0) {
      return rightArray;
    } 
    if (rightArray == null || rightArray.length == 0) {
      return leftArray;
    }


    int leftIndex = 0;
    int rightIndex = 0;
    int mergedIndex = 0;
    int[] mergedArray = new int[leftArray.length + rightArray.length];

    while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
      if (leftArray[leftIndex] < rightArray[rightIndex]) {
        mergedArray[mergedIndex++] = leftArray[leftIndex++]; 
      } else {
        mergedArray[mergedIndex++] = rightArray[rightIndex++];
      }
    }

    while (leftIndex < leftArray.length) {
      mergedArray[mergedIndex++] = leftArray[leftIndex++]; 
    }
    while (rightIndex < rightArray.length) {
      mergedArray[mergedIndex++] = rightArray[rightIndex++];
    }
    return mergedArray;


    
  }



  
  public static void main(String[] args) {
    int[] unorderedArray = {2, 1, 1, 9, 8, 5};
    System.out.println(Arrays.toString(unorderedArray));
    int[] mergedArray = mergeSort(unorderedArray);
    System.out.println(Arrays.toString(mergedArray));
  }
}
