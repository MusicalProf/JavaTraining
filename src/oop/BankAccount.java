package oop;

public class BankAccount implements IRate{
  // Define Variables
  String accountNumber;

  // static >> belongs to the CLASS not the object instance
  // final >> constant (often static final)
  private static final String routingNumber  = "048027013";

  // Instance variables
  private String name;
  private String ssn;
  String accountType;
  double balance;

  // Constructor definitions: unique methods
    // 1. They are used to define/setup/initialize properties of and object.
    // 2. Constructors are IMPLICITLY called upon INSTANTIATION
    // 3. The same name as the class itself
    // 4. Constructors have NO return type

  BankAccount() {
    System.out.println("New account has been created.");
  }

  // Overloading: call same method name with different arguments
  BankAccount(String accountType){
    System.out.println("NEW ACCOUNT: " + accountType);
  }

  BankAccount(String accountType, double initDeposit) {

    // initDeposit, accountType, Msg are all local variables
    System.out.println("NEW ACCOUNT: " + accountType);
    System.out.println("Initial Deposit of: $" + initDeposit);
    String Msg = null;

    if(initDeposit < 1000) {
      Msg = "ERROR: Minimum deposit must be at least $1,000";
    } else {
      Msg = "Thanks for your initial deposit of: $" + initDeposit;
    }
      System.out.println(Msg);
      balance = initDeposit;
    }

    // Getters/Setters
    // Allow the user to define the name
    public void setName(String name) {
      this.name = "Mr. " + name;
    }

    public String getName() {
      return name;
    }

    public void setSsn(String ssn) {
      this.ssn = ssn;
    }

    public String getSsn() {
      return ssn;
    }

    // Interface Methods
    public void setRate() {
      System.out.println("SETTING RATE");
    }

    public void increaseRate() {
      System.out.println("INCREASING RATE");
    }

  // Define Methods
  public void deposit(double amount) {  
    balance = balance + amount;
    showActivity("DEPOSIT");
  
  }
  void withdraw(double amount) {
    balance = balance - amount;
    showActivity("WITHDRAW");
  }

  // Private: can only be called from within the class
  private void showActivity(String Activity) {
    System.out.println("YOUR RECENT ACTIVITY: *" 
    + Activity + "*" );
    System.out.println("YOUR NEW BALANCE IS: $" + balance);
  }

  void checkBalance() { 
    System.out.println("Your Balance is: $" + balance);
  }

  void getStatus() {

  }

  @Override
  public String toString() {
    return "[ NAME:" + name +  ", ACCOUNT#: " + accountNumber + ", ROUTING#: " + routingNumber + ", BALANCE: $" + balance + " ]";
}
}

