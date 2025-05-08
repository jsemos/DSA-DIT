/* DSA Week 15 Lab 1 */

import java.util.HashMap;
import java.util.Map;

public class Week15Lab1 {

   public static void main(String[] args) {
      // Create a Map to store course codes with index keys
      Map<Integer, String> itiCourses = new HashMap<>();
   
      // Simulate "pushing" elements with incremental keys
      itiCourses.put(0, "DIT");
      itiCourses.put(1, "DHRM");
      itiCourses.put(2, "DACC");
      itiCourses.put(3, "DICT");
   
      // Get the top element (the last inserted one)
      int topKey = itiCourses.size() - 1;
      String topElement = itiCourses.get(topKey);
      System.out.println("Top element: " + topElement);
   
      // Check if the map is empty
      if (itiCourses.isEmpty()) {
         System.out.println("Map is empty");
      } else {
         // Print the contents of the map
         System.out.print("Map contents: " + itiCourses);
      }
   }
}
