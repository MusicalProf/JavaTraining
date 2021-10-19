package labs;

public class StudentDatabaseApp {
  public static void main(String[] args){
    StudentDatabase student1 = new StudentDatabase("Ra'mar", "Leach", "426-92-9084");
    StudentDatabase student2 = new StudentDatabase("Robinette", "Nickson", "423-83-1908");

    student1.enroll("Math 341");
    student1.enroll("Science 292");
    student2.enroll("CriLaw 201");
    student2.enroll("Philosophy 300");
    student1.showCourses();
    student1.pay(500);
    System.out.println(student1.toString()); 
  }  
}

class StudentDatabase {
  // Properties of the student
  private static int id = 100;
  private String userID;
  private String firstName;
  private String lastName;
  private String email;
  private String ssn;
  private String courses = "";
  private static final int courseCost = 1300;
  private int balance = 0; 
  private String phone;
  private String city;
  private String state;

  public StudentDatabase(String firstName, String lastName, String ssn) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.ssn = ssn;
    id++;
    generateUserID();
    generateEmail();
  }

  public String getPhoneNum(){
    return phone;
  }
  public void setPhoneNum(String phone){
    this.phone = phone;
  }

  public String getCity(){
    return city;
  }
  public void setCity(String city){
    this.city = city;
  }
  
  public String getState(){
    return state;
  }
  public void setState(String state){
    this.state = state;
  }

  private void generateEmail() {
    email = (firstName + "." + lastName + "@javauniversity.edu").toLowerCase();
    System.out.println("Your new email address is: " + email);
  }

  private void generateUserID() {
    int max = 9000;
    int min = 1000;
    int random = (int)(Math.random() * ((max - min)));
    random = random + min;
    userID = id + "" + random + ssn.substring(7, 11);
    System.out.println("Your new user ID is: " + userID);
  }

  public void enroll(String course) {
    this.courses = this.courses + " " + course;
    System.out.println(firstName + ", Congratulations! You have completed your enrollment for this course: " + course + ".");
    balance = courseCost + balance;
  }

  public void pay(int payment) {
    balance = balance - payment;
    System.out.println("Thank you for your payment of $" + payment + ".");
  }

  public void checkBalance(){
    System.out.println("Your balance is: " + balance + ".");
  }
  
  public void showCourses(){
    System.out.println("You are currently enrolled in: " + courses);
  }

  public String toString() {
    return "[Name: " + firstName + " " + lastName + "]\n[Courses: " + courses + "]\n[Balance: " + balance + "]";
  }

}


