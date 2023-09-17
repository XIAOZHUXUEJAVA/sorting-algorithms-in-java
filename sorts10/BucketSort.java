package sorts10;

import java.util.*;


public class BucketSort {


  public static void bucketSort(float[] nums) {
    if (nums == null) {
      throw new IllegalArgumentException("The input nums cannot be null");
    }
    if (nums.length <= 1) {
      return;
    }
    int halfLength = nums.length >> 1;
    List<List<Float>> buckets = new ArrayList<>();
    for (int i = 0; i < halfLength; i++) {
      buckets.add(new ArrayList<>());
    }
    for (float num : nums) {
      int bucketIndex = (int) (num * halfLength);
      buckets.get(bucketIndex).add(num);
    }
    for (List<Float> bucket : buckets) {
      Collections.sort(bucket);
    }
    int sortedIndex = 0;
    for (List<Float> bucket : buckets) {
      for (float num : bucket) {
        nums[sortedIndex++] = num;
      }
    }
  }




  
  public static void main(String[] args) {
    float[] unorderedArray = {0.2f, 0.1f, 0.1f, 0.9f, 0.8f, 0.5f};
    System.out.println(Arrays.toString(unorderedArray));
    bucketSort(unorderedArray);
    System.out.println(Arrays.toString(unorderedArray));
  }
}
