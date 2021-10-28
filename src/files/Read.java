package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {
  public static void main(String[] args) {
    // 1. Define the file (path) we want to read.
    String filename = "/Users/musicalprof/documents/coding/java/udemy/JavaTraining/Files/FileToRead.txt";

    String text = null;

    // 2. Create the file in Java.
    File file = new File(filename);

    // 3. Open the file.
    BufferedReader br; 
    
    try{
      br = new BufferedReader(new FileReader(file));

      // 4. Read the file.
    text = br.readLine();

    // 5. Close the resources.
      br.close();

    }catch(FileNotFoundException e){
      System.out.println("ERROR: File not found: " + filename);
      e.printStackTrace();
    }catch(IOException e) {
      System.out.println("ERROR: Could not read the data of file: " + filename);
    }finally{
      System.out.println("Completed reading the file.");
    }

    System.out.println(text);
  }
  
}
