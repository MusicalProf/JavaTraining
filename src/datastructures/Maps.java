package datastructures;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
  public static void main(String[] args) {
    // Implement map interfaces
    Map<Integer, String> hMap = new TreeMap<Integer, String>();
    mapUtil(hMap);
  }

  public static void mapUtil(Map<Integer, String> map){
    // 1. Add key value pairs
    map.put(101, "Steve");
    map.put(502, "Roger");
    map.put(22, "Jennifer");
    map.put(315, "Mike");
    map.put(36, "Elle");
    map.put(750, "Kelly");

    // Expose // access elements
    System.out.println("See all the keys: " + map.keySet());  
    System.out.println("See all the key - value pairs: " + map); 
    System.out.println(map.get(502));
    
    // 3. Iterate through a map of key value pairs
    for(int key : map.keySet()){
      System.out.println("[Key: " + key + " - Value: " + map.get(key) + "]");
    }
  }
}
