package labs;

public class BankAccountApp {
  public static void main(String[] args){
    BankAccount acct1 = new BankAccount("456922687", 1000);
    // BankAccount acct2 = new BankAccount("378729971", 2000);
    // BankAccount acct3 = new BankAccount("237964881", 2500);

    acct1.setName("Jim");
    System.out.println(acct1.getName());
    acct1.makeDeposit(500);
    acct1.makeDeposit(600);
    acct1.payBill(1000);
    acct1.accrue();
    System.out.println(acct1.toString()); 
  }
}
  
class BankAccount implements IInterest{
    // Properties of a Bank account
    private static int iD = 1000; // Internal ID
    private String accountNumber; // ID + random 2-digit number + first 2 of SSN.
    private static final String routingNumber = "005786908";
    private String name;
    private String SSN;
    private double balance;

    // Constructor
    public BankAccount(String SSN, double initDeposit) {
      this.SSN = SSN;
      balance = initDeposit;
      iD++;
      setAccountNumber();
    } 

    private void setAccountNumber() {
      int random = (int)(Math.random() * 100);
      accountNumber = iD + "" + random + SSN.substring(0, 2);
      System.out.println("Your Account Number: " + accountNumber);
    }

    public void setName(String name) {
      this.name = name;
    }
    public String getName() {
      return name;
    }

    public void payBill(double amount) {
      System.out.println("Paying bill " + amount);
      balance = balance - amount;
      showBalance();
    }

    public void makeDeposit(double amount) {
      System.out.println("Making deposit " + amount);
      balance = balance + amount;
      showBalance();
    }

    public void showBalance() {
      System.out.println("Balance: $" + balance);
    }

    @Override
    public void accrue() {
      balance = balance * (rate/100 + 1);
      System.out.println("* ACCRUING INTEREST *");
      showBalance();
    }

    @Override
    public String toString() {
    return "[Name: " + name + "]\n[Account Number: " + accountNumber + "]\n[Routing Number: " + routingNumber + "]\n[Balance: $" + balance + "]";
  }
}


