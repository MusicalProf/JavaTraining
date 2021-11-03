package datastructures;

public class Arrays {
  public static void main(String[] args) {
    // Traversing a single Array
    String[] alphabet = {"a", "b", "c", "d", "e", "f", "g"};

    System.out.println("The old fashioned way.");
    for (int i = 0; i < 5; i++){
      System.out.print(alphabet[i] + " ");
    }

    System.out.println("\nusing the length variable.");
    for(int n = 0; n < alphabet.length; n++){
      System.out.print(alphabet[n] + " ");
    }

    System.out.println("\nusing the for-each method");
    for(String letter : alphabet){
      System.out.print(letter + " ");
    }

    System.out.println("\n\nMulti-Dimensional Arrays");
    // Traversing multi-dimensional arrays
    String[][] users = {
      {"John", "Williams", "jw@testemail.com", "7087428902"}, 
      {"Sarah", "Jackson", "sj@testemail.com", "9418087930"},
      {"Rachel", "Wallace", "rw@testemail.com", "6768127894"}
     };

    // Get the size of the array. 
    int numOfUsers = users.length;
    int numOfFields = users[0].length;

    System.out.println("Number of Users: " + numOfUsers);
    System.out.println("Number of Fields: " + numOfFields);

    // Traverse the double array
    // Using simple double for loops
    for (int i = 0; i < numOfUsers; i++){
      for(int j = 0; j< numOfFields; j++){
        System.out.println(users[i][j]);
      }
    }

    for (int i = 0; i < numOfUsers; i++){
      String firstName = users[i][0];
      String lastName = users[i][1];
      String email = users[i][2];
      String phone = users[i][3];
      System.out.println(firstName + " " + lastName + " " + email + " " + phone);
    }

    System.out.println("\n\nUsing For-Each");
    for(String[] user : users) {
      System.out.print("[");
      for(String field : user){
        System.out.print(field + " ");
      }
      System.out.println("]");
    }
  }  
}
