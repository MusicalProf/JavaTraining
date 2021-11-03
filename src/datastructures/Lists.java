package datastructures;

import java.util.ArrayList;

public class Lists {
  public static void main(String[] args) {
    // 1. Create a collection
    ArrayList<String> cities = new ArrayList<String>();

    // 2. Add some elements
    cities.add("Chicago");
    cities.add("Indianapolis");
    cities.add("Houston");
    cities.add("Las Vegas");
    

    // 3. Iterate through the collection
    for(String city : cities){
      System.out.println(city);
    }
    
    // 4. Get the size of the Collection
    int size = cities.size();
    System.out.println("There are " + size + " elements in the collection.");

    // 5. Retrieve specfic elements
    System.out.println("Showing the first city in the collection: " + cities.get(0));

    // 6. Remove elements
    System.out.println("Removing " + cities.remove(3) + " from the collection");
    size = cities.size();
    System.out.println("Now there are " + size + " elements in the collection.");
    for(String city : cities) {
      System.out.println(city);
    }
  }
}
