/* DSA Week 4 Lab 1 */

public class Week4Lab1 {
   
   //define variables
   int payJerome;
   int payOdilia;
   int payMakali;
   
   //create a constructor
   public Week4Lab1() {
      payJerome = 8;
      payOdilia = 10;
      payMakali = 12;
   }
   
   //create a method called myMethod with no parameter
   static void myMethod(){
      System.out.println("My first Java Method works!");
   }
   
   //create a method called myMethod2 with parameter fname
   static void myMethod2(String fname){
      System.out.println(fname);
   }

   public static void main(String []args) {
      Week4Lab1 obj = new Week4Lab1();
   
      myMethod();
      myMethod2("Jerome");
      System.out.println(obj.payJerome);
      myMethod2("Odilia");
      System.out.println(obj.payOdilia);
      myMethod2("Makali");
      System.out.println(obj.payMakali);
   }
}