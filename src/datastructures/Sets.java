package datastructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
  public static void main(String[] args) {
    // 1. Define the collection
    // Hashset is a random order Data Structure. Doesn't take duplicates
    // LinkedHash - in order that they are created.
    // TreeSet - Unique order (Alphabetical order).
    Set<String> animals = new TreeSet<String>();
    
    animals.add("Dog");
    animals.add("Cat");
    animals.add("Horse");
    animals.add("Bearded Dragon");
    animals.add("Bird");
    animals.add("Fox");
    animals.add("Squirrel");

    System.out.println(animals.size() + " " + animals);

    animals.add("Cat");
    animals.add("Dog");
    animals.add("Goose");

    System.out.println(animals.size() + " " + animals);

    // Create a new set which we can use for comparison.
    Set<String> farmAnimals = new HashSet<String>();

    farmAnimals.add("Chicken");
    farmAnimals.add("Cow");
    farmAnimals.add("Pig");
    farmAnimals.add("Horse");
    farmAnimals.add("Dog");

    // What is the intersection between animals and farm animals? (only animals and farmAnimals. "AND")
    // 1. Copy existing set into a new set.
    Set<String> intersection = new HashSet<String>(animals);
    System.out.println(intersection);
    
    // 2. Retain ONLY the elements that are also in the other set.
    intersection.retainAll(farmAnimals);
    System.out.println("The intersection is: " + intersection);

    // What is the Union (are both animals and farm "OR")
    Set<String> union = new HashSet<String>(farmAnimals);
    union.addAll(animals);
    System.out.println("The union is: " + union + ". And the size is: " + union.size());

    // What is the difference (animals but NOT farm animals. = in 1 but not the other.)
    Set<String> difference = new HashSet<String>(animals);
    difference.removeAll(farmAnimals);
    System.out.println("The difference is: " + difference);
  }
}
