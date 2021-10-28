package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberApp {
  public static void main(String[] args) {
    // Will read a txt file and retreive the phone number.
    
    String fileName = "/Users/musicalprof/documents/coding/java/udemy/JavaTraining/Files/PhoneNumber.txt";
    String[] phoneNums = new String[9];
    File file = new File(fileName);
    String phoneNum = null;

    try {
      BufferedReader br = new BufferedReader(new FileReader(file));
      for(int i = 0; i < phoneNums.length; i++){
        phoneNums[i] = br.readLine();
      }
      br.close(); 
    }catch (FileNotFoundException e) {
        System.out.println("Error: File not found.");
    }catch (IOException e) {
        System.out.println("ERROR: Could not read file.");
    }
      
    // Valid phone number:
      // 10 Digits long
      // Area code cannot start in 9 or 0
      // 911 cannot be a 911 in the phone number. 
    for(int i = 0; i < phoneNums.length; i++){
      try{
        phoneNum = phoneNums[i];
        if(phoneNum.length() != 10) {
          throw new TenDigitsExceptions(phoneNum);
        }
  
        if((phoneNum.substring(0,1).equals("0")) || (phoneNum.substring(0,1).equals("9"))){
          throw new AreaCodeExceptions(phoneNum);
        }
  
        if(phoneNum.contains("911")){
          throw new EmergencyContactExceptions(phoneNum);
        }
      }catch (TenDigitsExceptions e) {
        System.out.println("ERROR: Phone number must be ten digits.");
        System.out.println(e.toString());
      }catch (AreaCodeExceptions e){
        System.out.println("ERROR: Area code cannot start a 0 or a 9.");
        System.out.println(e.toString());
      }catch(EmergencyContactExceptions e){
        System.out.println("ERROR: 911 cannot be apart of your phone number.");
        System.out.println(e.toString());
      }
    }
  }
}

class TenDigitsExceptions extends Exception{
  String number;
  TenDigitsExceptions(String number) {
    this.number = number;
  }
  public String toString() {
    return "TenDigitsException: " + number;
  }
}

class AreaCodeExceptions extends Exception {
  String number;
  AreaCodeExceptions(String number) {
    this.number = number;
  }
  public String toString(){
    return "AreaCodesException: " + number;
  }

}

class EmergencyContactExceptions extends Exception {
  String number;
  public EmergencyContactExceptions(String number) {
    this.number = number;
  }

  public String toString(){
    return "AreaCodesException: " + number;
  }

}