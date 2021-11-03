package datastructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {
  public static void main(String[] args) {
    // This method will read data from a CSV file.
    List<String[]> data = new ArrayList<String[]>();
    String fileName = "/Users/musicalprof/documents/Coding/Java/Udemy/JavaTraining/Files/useraccounts.csv";

    File file = new File(fileName);
    String content = null;

    try {
      // Open the file.
      BufferedReader br = new BufferedReader(new FileReader(file));
      
      // Read the data as long it's not empty
      while((content = br.readLine()) != null) {  
        String[] line = content.split(",");
        // Add the data to the collection.
        data.add(line);
      }
      br.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    for(String[] account : data) {
      System.out.print("[ ");
      for(String field : account){
        System.out.print(field + " ");
      }
      System.out.println(" ]");
    }
  }
}
