package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
  public static void main(String[] args) {
    // 1. Define the pathe of the file.
    String filename = "/Users/musicalprof/documents/coding/java/udemy/JavaTraining/Files/FileToWrite.txt";
    String message = "I'm writing information to a file from Java.";


    // 2. Create the file in Java.
    File file = new File(filename);

    // 3. Open the file.
    try{
      FileWriter fw = new FileWriter(file);

       // 4. Write to the file.
       fw.write(message);

       // 5. Close the resources.
       fw.close();
    }catch(IOException e){
      System.out.println("ERROR: Unable to write to file." + filename);
    }finally{
      System.out.println("Closing file writer.");
    }    
  }
}
