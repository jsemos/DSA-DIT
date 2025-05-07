/* DSA Week 5 Lab 1 */

import java.util.Arrays; //import the Arrays class

public class Week5Lab1 {

   public static void main(String []args) {
            
      //Create an array called intArray
      int intArray[] = {940, 880, 830, 790, 750, 660, 650, 590, 510, 440};
      
          
      //print element 0 of the array
      System.out.println("First element of the array is " + intArray[0]);
      
      //print element 0 of the array
      System.out.println("Length of the Array is " + intArray.length);
      
      
      
      // Loop through the elements of the array
      for (int i = 0; i<intArray.length; i++){
        System.out.println(intArray[i]);
      }
   }
}