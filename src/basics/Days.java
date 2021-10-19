package basics;


public class Days {
  public static void main(String[] args){
    // Execute a different block of code based on the value of a condition.

    String dayOfWeek = "Tuesday";
    
    // switch(dayOfWeek) {
    //   case "Monday": 
    //     System.out.println("Today is Monday");
    //     break;
    //   case "Tuesday": 
    //     System.out.println("Today is Tuesday");
    //     break;
    //   case "Wednesday": 
    //     System.out.println("Today is Wednesday");
    //     break;
    //   case "Thursday": 
    //     System.out.println("Today is Thursday");
    //     break;
    //   case "Friday": 
    //     System.out.println("Today is Friday");
    //     break;
    //   default:
    //     System.out.println("Hmmm something is wrong here.");
    //     break;
    // }
    String thisString = "";
    for (int i = 0; i < dayOfWeek.length(); i++) {
      thisString = thisString + dayOfWeek.charAt(dayOfWeek.length()-1-i);
    }
    System.out.println(thisString);

    checkPalindrome("racecar");
    

  }  

  // static boolean[] boundedRatio(int[] a, int l, int r) {
  //   boolean[] b = new boolean[a.length];
  //   int x = 0;
  //   for(int val = 0; val < a.length; val++) {
  //       x = (val + 1) * x;
  //       if(a[val] == x && (l <= x << r)){
  //           b[val] = true;
  //       } else {
  //           b[val] = false;
  //       }
  //   }
  //   return b;

  static boolean checkPalindrome(String inputString) {
    String newString = "";
    boolean bool;
    
    for(int i = 0; i < inputString.length(); i++) {
        newString = newString + inputString.charAt(inputString.length()-1-i);
    }

    System.out.println(newString);
    System.out.println(inputString);
    
    if(inputString.equals(newString)) {
      bool = true;  
      System.out.println(bool);       
    } else {
      bool = false;
      System.out.println(bool);
    }
    return bool;
  }
}


