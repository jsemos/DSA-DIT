/* DSA Week 8 Lab 1 */

import java.util.Stack;

public class Week8Lab1 {

   public static void main(String[] args) {
      // Create a stack object called itiCourses
      Stack<String> itiCourses = new Stack<>();
   
      // Push elements onto the stack
      itiCourses.push("DIT");
      itiCourses.push("DHRM");
      itiCourses.push("DACC");
      itiCourses.push("DICT");
   
      // Peek or see the top element of the stack
      System.out.println("Top element: " + itiCourses.peek());
   
      //if stack is empty print message stack is empty, else print elements in the stack
      if(itiCourses.isEmpty()){
         System.out.print("Stack is empty");        
      }else{
         // Print the stack (it will display elements in LIFO order)
         System.out.print("Stack contents: " + itiCourses);   
      }
   }
}