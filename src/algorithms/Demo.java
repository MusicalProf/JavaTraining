package algorithms;

public class Demo {
  public static void main(String[] args) {
    
    int[] nums = {15, 62, 24, 4, 13, 75, 71};
    int[] sorted = {5, 9, 11, 12, 18, 20, 25, 27, 32, 33, 38, 40, 45, 48, 52, 53, 56, 57, 59, 61, 62, 64, 69, 73, 74, 78, 79, 82, 90};

    // System.out.println(sorted.length);

    // Call the Linear Search
    int pos = algorithms.Search.linearSearch(nums, 15);
    // System.out.println("Found at the position of " + pos);

    // Call the binary search.
    int index = algorithms.Search.binarySearch(sorted, 56, 0, sorted.length-1);
    System.out.println("Found at position: " + index);

    // Call the bubble sorty function
    Sort.bubbleSort(nums);
  }

}
