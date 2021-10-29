package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PasswordCriteria {
  public static void main(String[] args) {
    // This will check a file of passwords against a number of criteria.

    // 1. Declare a filename variable to reaad the file.
    String fileName = "/Users/musicalprof/documents/coding/java/udemy/JavaTraining/Files/passwords.txt";

    // 2. Declare an array to hold the various passwords to check.
    String[] passwords = new String[13];
    

    // 3. Bringing in the File IO.
    File file = new File(fileName);

    // Instatiating variables to hold test criteria.
    String numbers = "0123456789";
    String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String characters = "!@#$%^&*()-=_+";
    
    // 4. Establishing the intial Try/Catch block to read through the file.
    try {
      BufferedReader readIn = new BufferedReader(new FileReader(file));
      for(int i = 0; i < passwords.length; i++) {
        passwords[i] = readIn.readLine();
      }
      readIn.close();
    }catch(FileNotFoundException e) {
      System.out.println("ERROR: File not found.");
    } catch (IOException e) {
      System.out.println("ERROR: Cannot read file.");
    }
    
    // 5. Checking the passwords for validity.
    for (String password : passwords) {
      boolean validNumber = false;
      boolean validLetter = false;
      boolean validCharacter = false;
      boolean invalidCharacter = false;
      System.out.println("***** \n" + password);
      // 1. Contains a number
      for(int i = 0; i < password.length(); i++){
        if(numbers.contains(password.substring(i, i+1))){
          // System.out.println("Position " + i + " contains the number: " + password.charAt(i));          
          validNumber = true;
      // 2. Contains a letter
        }else if(letters.contains(password.substring(i, i+1))){
          // System.out.println("Position " + i + " contains the letter: " + password.charAt(i));          
          validLetter = true;
      // 3. Contains a character
        }else if(characters.contains(password.substring(i, i+1))){
          // System.out.println("Position " + i + " contains the special character: " + password.charAt(i));
          validCharacter = true;
        }else{
          // System.out.println("Position " + i + " contains an invalid character: " + password.charAt(i));
          invalidCharacter = true;
          try {
            throw new InvalidCharacterException((password.substring(i, i+1)));
          } catch (InvalidCharacterException e) {
            e.toString();
          }
        }          
      }

      // Exception handling
      try{
        if(!validLetter){        
          throw new NoLetterException(password);      
        }else if(!validNumber){
          throw new NoNumberExceptions(password);
        }else if(!validCharacter){
          throw new InvalidSpecialCharacter(password);
        }else if(invalidCharacter){
          throw new InvalidCharacterException(password);
        }else{
          System.out.println("Valid Password.");
        }
      }catch(NoNumberExceptions | NoLetterException | InvalidSpecialCharacter | InvalidCharacterException e){
        System.out.println(e.toString());
        System.out.println("Invalid Password. Please try again.");
      }
    }
  }  
}

class InvalidCharacterException extends Exception{
  String password;
  InvalidCharacterException(String password){
    this.password = password;
  }
  public String toString(){
    return "Invalid Character: " + password;
  }
}

class NoNumberExceptions extends Exception{
  String password;
  NoNumberExceptions(String password) {
    this.password = password;
  }
  public String toString() {
    return "NoNumberExceptions: " + password;
  }
}

class NoLetterException extends Exception{
  String password;
  NoLetterException(String password) {
    this.password = password;
  }
  public String toString() {
    return "NoLetterException: " + password;
  }
}

class InvalidSpecialCharacter extends Exception{
  String password;
  InvalidSpecialCharacter(String password) {
    this.password = password;
  }
  public String toString() {
    return "InvalidSpecialCharacter: " + password;
  }
}
