/* DSA Week 5 Lab 2 */

import java.util.Arrays; //import the Arrays class

public class Week5Lab2 {

   public static void main(String []args) {
            
      //Create an array called intArray
      int intArray[] = {940, 880, 830, 790, 750, 660, 650, 590, 510, 440};
      int n = intArray.length;
      
      
      //using bubble sort algorithm on the created Array (intArray)
      for (int i = 0; i < n - 1; i++)
         for (int j = 0; j < n - i - 1; j++)
            if (intArray[j] > intArray[j + 1]) {
            
               // swap temp and intArray[i]
               int temp = intArray[j];
               intArray[j] = intArray[j + 1];
               intArray[j + 1] = temp;
            }
      
      //print array for smallest to largest number
      for (int i = 0; i < n; i++)
         System.out.print(intArray[i] + " ");
         System.out.println('\n');
   }
}