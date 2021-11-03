package algorithms;

public class Sort {
  public static void bubbleSort(int[] data) {
    boolean swap = false;
    System.out.print("\nOriginal array: \n");
    printArr(data);
    do{
      swap = false;
      for(int i = 0; i < data.length-1; i++){
        if(data[i] > data[i+1]){
          int temp = data[i];
          data[i] = data[i+1];
          data[i+1] = temp;
          System.out.print("Swap: ");
          printArr(data);
          swap = true;
          System.out.println("Iteration\n");
        }
      }
      
    }while(swap);
  }
  private static void printArr(int[] array){
    for(int i : array){
      System.out.print(i + " ");
    }
    System.out.println();
  }
}
