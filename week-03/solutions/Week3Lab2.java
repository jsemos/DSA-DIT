/* DSA Week 3 Lab 2 */

public class Week3Lab2 {
  
   public static void main(String []args) {
      
      //example of if else statement
      int x = 2;
      int y = 1;
      
      if(x > y){
         System.out.println("x is greater than y");
      }else{
         System.out.println("y is greater than x");
      }
      
      //example of switch statement
      int day = 1;
      
      switch(day){
         case 1:
            System.out.println("Monday");
            break;
         case 2:
            System.out.println("Tuesday");
            break;
         case 3:
            System.out.println("Wednesday");
            break;
         case 4:
            System.out.println("Thursday");
            break;
         case 5:
            System.out.println("Friday");
            break;
       }
       
       //example of while loop
       int i = 0;
       while(i<5){
         System.out.println(i);
         i++;
       }
       
       //example of for loop
       for(int j = 0; j<5; j++){
         System.out.println(j);
       }
   }
}