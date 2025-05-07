/* DSA Week 4 Lab 2 */

import java.util.Scanner; //import the Scanner class

public class Week4Lab2 {

   public static void main(String []args) {
      
      Scanner myObj = new Scanner(System.in); //create a Scanner object
      System.out.println("Enter your name");
      
      String name = myObj.nextLine(); //reads user input
      
      //Numbers input
      System.out.println("Enter your first number");
      int x = myObj.nextInt();
      System.out.println("Enter your second number");
      int y = myObj.nextInt();
           
      int num = (x*y);
      int num2 = (x+y);
      int num3 = (x-y);
      int num4 = (x/y);
      
      System.out.println(name); //prints my name     
      System.out.println(num); //prints multiplication          
      System.out.println(num2); //prints additional
      System.out.println(num3); //prints substraction
      System.out.println(num4); //prints division
   }
}