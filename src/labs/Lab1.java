package labs;


public class Lab1 {
  public static void main(String[] args){
    // 1. Write a function that takes a value n and returns the sum of numbers 1 to n.
    // System.out.println(sumNumbers(10)); 

    // 2. Write a function that computes the factorial value
    int i = 0;
    while(i <= 15){
      System.out.println(factorial(i));
      i++;
    }
    System.out.println(factorial(10));

    // 3. Write 3 functions that take an array as a parameter and return the minimum, average, and maximum values of that array.
    // int[] arr = new int[] {4, 6, 10, 5, 20, 2, 13, 3, 8, 16};
    // System.out.println(Arrays.toString(arr));
    // System.out.println("The max is: " + max(arr));
    // System.out.println("The min is: " + min(arr));
    // System.out.println("The average is: " + avg(arr));
    
  } 

  public static int sumNumbers(int n) {
    int sum = 0;
    for(int i = 1; i <= n; i++) {
      sum = sum + i;
      // System.out.println(sum);
    }
    return sum;
  }

  public static long factorial(long n) {
    if(n == 0) {
      return 1; 
    }
    // System.out.println(n);
    return n * factorial(n - 1);
  }

  public static int max(int[] array) {
    int max = array[0];
    for(int i = 0; i <array.length; i++) {
      if (max < array[i]) {
        max = array[i];
      }
    }
    return max;
  }

  public static int min(int[] array) {
    int min = array[0];
    for(int i = 0; i <array.length; i++) {
      if (min > array[i]) {
        min = array[i];
      }
    }
    return min;
  }

  public static int avg(int[] array){
    int sum = 0;
    for(int i = 0; i <array.length; i++) {
      sum = sum + array[i];
    }
    return sum/array.length;
  }
}
