package algorithms;

public class Search {
  public static int linearSearch(int[] array, int num){
    // Iterate through dataset searching for the target.
    for(int i = 0; i < array.length; i++){
      if(array[i] == num){
        return i;
      }
    }
    return -1;
  }

  public static int binarySearch(int[] array, int target, int start, int end){
    // binary search assumes a sorted array and can therefore continually split our search domain in half.
    int middle = (int) Math.floor((start + end)/2);
    System.out.println("Searching between " + array[start] + " & " + array[end] + ". Mid point is: " + middle);
    int value = array[middle];

    if(target > value){
      System.out.println(target + " > " + value);
      return binarySearch(array, target, middle + 1, end);
    }else if(target < value){
      System.out.println(target + " < " + value);
      return binarySearch(array, target, start, middle - 1);
    }else{
      System.out.println(target + " = " + value);
      return middle;
    }
  }
}


