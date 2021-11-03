package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreditCardStatement {
  public static void main(String[] args) {
    // This method will read data from a CSV file and update the balance based on the field read from the file.
    // Declaring an initial balance of zero.
    float balance = 0;

    // Initializing a new array list to store the data.
    List<String[]> statement = new ArrayList<String[]>();
    String fileName = "/Users/musicalprof/documents/Coding/Java/Udemy/JavaTraining/Files/CardStatement.csv";

    File file = new File(fileName);
    String data = null;

    try {
      // Open the file
      BufferedReader br = new BufferedReader(new FileReader(file));

      // Read data from the file, as long as it's not empty, and store it into the array list.
      while ((data = br.readLine()) != null){
        String[] line = data.split(",");
        // Adding to the collection
        statement.add(line);
      }
      br.close();
    }catch(FileNotFoundException e){
      e.printStackTrace();
    }catch(IOException e) {
      e.printStackTrace();
    }
    
    for (String[] account : statement) {
      String accountFormat = String.format("Date: %s, Transaction: %s, Amount: $%s", account[0], account[1], account[3]);
      String transaction = account[1];
      float amount = Float.valueOf(account[3]);
      System.out.println(accountFormat);
      if(transaction.equalsIgnoreCase("credit")){
        balance += amount;
        System.out.println("Your balance is: $" + Math.round(balance*100.0)/100.0);
      }else if(transaction.equalsIgnoreCase("debit")){
        balance -= amount;
        System.out.println("Your balance is: $" + Math.round(balance*100.0)/100.0);
      }
      
      }
    if (balance > 0) {
      float fee = (float)(balance * 1.10);
      System.out.println("Your balance is greater than 0, you will be charged a 10% fee in the amount of: $" + Math.round(fee*100.0)/100.0 + ". \nYour new balance with the fee applied is: $" + Math.round(balance*100.0)/100.0);
    }else if(balance == 0){
      System.out.println("Thank you for your payments. Have a great day!");
    }else{
      System.out.println("Thank you for your payments. You have over paid by: $" + Math.abs(Math.round(balance*100.0)/100.0));
    }
  }
}
  

