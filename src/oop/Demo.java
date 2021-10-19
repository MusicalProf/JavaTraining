package oop;

class Person {
  String name;
  String email;
  String phone;

  void walk() {
    System.out.println(name + " is walking");
  }

  void eat() {
    System.out.println(name + " is eating");
  }

  void sleep() {
    System.out.println(name + " is sleeping");
  }
}

public class Demo {

  public static void main(String[] args){
    // Person

    // Instantiating an object
    Person person1 = new Person();

    // Define some properties
    person1.name = "Joe";
    person1.email = "joe@testemail.com";
    person1.phone = "7088398183";

    // Abstraction
    person1.walk();

    Person person2 = new Person();
    person2.name = "Sarah";
    person2.sleep();

    // Attributes, variables, adjectivces, descriptors
  //   String name = "Joe";
  //   String email = "joe@testemail.com";
  //   String phone = "7083840292";

  //   // Action activity, behavior
  //   System.out.println(name + " is walking");
  //   System.out.println(name + " is eating");

  //   // Attributes, variables, adjectivces, descriptors
  //   String name2 = "Sarah";
  //   String email2 = "sarah@testemail.com";
  //   String phone2 = "3218382920";

  //   // Action activity, behavior
  //   walking(name2);
  //   System.out.println(name2 + " is eating");
  // }
 
  // // Enhance by adding functions to minimize code
  // static void walking(String name){
  //   System.out.println(name + " is walking.");
  // }
  
  }
}