package sorts10;

import java.util.*;

public class CountSort {




  public static void countSort(int[] nums) {
    if (nums == null) {
      throw new IllegalArgumentException("The input nums cannot be null");
    }
    if (nums.length <= 1) {
      return;
    }
    int maxValue = 0;
    for (int num : nums) {
      maxValue = Math.max(maxValue, num);
    }
    int[] counts = new int[maxValue + 1];
    
    for (int num : nums) {
      counts[num]++;
    }

    int sortedIndex = 0;
    for (int value = 0; value < counts.length; value++) {
      for (int i = 0; i < counts[value]; i++) {
        nums[sortedIndex++] = value;
      }     
    }

    
  }


  
  public static void main(String[] args) {
    int[] unorderedArray = {2, 1, 1, 9, 8, 5};
    System.out.println(Arrays.toString(unorderedArray));
    countSort(unorderedArray);
    System.out.println(Arrays.toString(unorderedArray));
  }
}
