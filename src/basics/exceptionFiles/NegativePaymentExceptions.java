package basics.exceptionFiles;

public class NegativePaymentExceptions extends Exception {
  double payment;
  
  // Constructor that takes a value that would throw the exception.
  // Assign value of local variable to class variable
  public NegativePaymentExceptions(double payment){
    this.payment = payment;
  }

  // Override toString method to include exception message.
  public String toString() {
    return "ERROR: Cannot take negative payments. " + "$" + payment;

  }
}
