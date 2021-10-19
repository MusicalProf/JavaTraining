package basics;

public class NumbersCalc {
  public static void main(String[] args){
    printName();

    int numA = 10;
    int numB = 20;
    addNumbers(numA, numB);

    multiplyNumbers(numA, numB);
  }

  static void printName() {
    System.out.println("My name is Ra'mar");
  }

  static void addNumbers(int x, int y) {
    int sum = x + y;
    System.out.println("The sum of " + x + " and " + y + " is " + sum);
  }

  static int multiplyNumbers(int x, int y) {
    int product = x * y;
    addNumbers(product, product);
    return product; 
  }
}
