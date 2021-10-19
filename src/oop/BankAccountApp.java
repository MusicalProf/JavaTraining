package oop;

public class BankAccountApp {
  public static void main(String[] args){
    BankAccount acct1 = new BankAccount();
    
    // acct1.name = "Roger Hue";
    // with Encapsulation
    acct1.setName("Roger Hue");
    System.out.println(acct1.getName());
    acct1.setSsn("256-38-0928");
    System.out.println("SSN: " + acct1.getSsn()); 

    acct1.accountNumber = "01039084180";
    acct1.balance = 10000;
    acct1.setRate();
    acct1.increaseRate();

    acct1.deposit(1500);
    
    // Polymorphism through overridding
    System.out.println(acct1.toString());

    // Polymorphism through overloading.
    BankAccount acct2 = new BankAccount("Checking Account");
    acct2.accountNumber = "83081070822";

    BankAccount acct3 = new BankAccount("Savings Account", 5000);
    acct3.accountNumber = "83085356128";
    acct3.checkBalance();

    // Demo for Inheritance
    // CDAccount cd1 = new CDAccount();
    // cd1.balance = 3000;
    // cd1.interestRate = "4.5";
    // cd1.name = "Juan";
    // cd1.accountType = "CD Account";
    // System.out.println(cd1.toString()); 
    // cd1.compound();
  }

  
}

