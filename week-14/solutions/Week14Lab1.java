/* DSA Week 10 Lab 1 */

import java.util.ArrayList; //import the ArrayList class

public class Week14Lab1 {

   public static void main(String []args) {
      ArrayList<Integer> intArray = new ArrayList<Integer>();
      intArray.add(940);
      intArray.add(880);
      intArray.add(830);
      intArray.add(790);
      intArray.add(750);
      intArray.add(660);
      intArray.add(650);
      intArray.add(590);
      intArray.add(510);
      intArray.add(440);
      
      //print element 0 of the Arraylist
      System.out.println("First element of the Arraylist is " + intArray.get(0));
      
      //print the size of the ArrayList
      System.out.println("Size of the Arraylist is " + intArray.size());
      
      intArray.remove(0);
      
      //loop through the element of the Arraylist
      for(int i =0; i<intArray.size(); i++){      
         System.out.println(intArray.get(i));
      }
   }
}