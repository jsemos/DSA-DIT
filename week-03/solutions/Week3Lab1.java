/* DSA Week 3 Lab 1 */

public class Week3Lab1 {

   //create a method called addition with a parameter called num
   static void addition(int num){
      System.out.println(num);
   }
   
   static void multiplication(int num){
      System.out.println(num);
   }
   
   static void subtraction(int num){
      System.out.println(num);
   }
   
   
   public static void main(String []args) {
      
      //create local variable names and align values to each
      String name = "Jerome";
      char gender ='M'; 
      int x = 5; 
      int y = 2;
      
      int year = 2025;
      int num1 = (2*5);
      int num2 = (2+5);
      int num3 = (x - y);
      
      System.out.println("My Name is " + name + " my gender is " + gender);
      System.out.println("It's " + year);    
      addition(num2); //prints aditional
      multiplication(num1); //prints multiplication
      subtraction(num3); //prints subtraction
      
   }
}