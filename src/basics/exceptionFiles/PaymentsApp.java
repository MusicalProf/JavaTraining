package basics.exceptionFiles;

import java.util.Scanner;

public class PaymentsApp {
  public static void main(String[] args) {
    double payment = 0;
    boolean posPayment = true;    

    do{
      // 1. Ask the user for input.
      System.out.print("Enter the payment amount: ");

      // 2. Get the amount and test value.
      Scanner input = new Scanner(System.in);
      input.close();
      // 3. Handle exceptions appropriately
      try {
        payment = input.nextInt();
        if(payment < 0) {
            throw new NegativePaymentExceptions(payment);
        }else{
          posPayment = true;
        }
      }catch (NegativePaymentExceptions e){
        System.out.println(e.toString());
        System.out.println("Please try again.");
        posPayment = false;
      }
    }while(!posPayment);
    
    // 4. Print confirmation.
    System.out.println("Thank you for your payment of $" + payment);

  }
  
}
