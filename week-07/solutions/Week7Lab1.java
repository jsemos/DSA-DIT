/* DSA Week 7 Lab 1 */

import java.util.LinkedList;  //import the LinkedList class or Java Package


public class Week7Lab1 {

   public static void main(String[] args){
      //create Linked List object called itiCourses
      LinkedList<String> itiCourses = new LinkedList<String>();
      
      //add nodes into the Linked List
      itiCourses.add("DIT");
      itiCourses.add("DHRM");
      itiCourses.add("DACC");
      itiCourses.add("DICT");
      
      //print to the console the Linked List
      System.out.println(itiCourses);
   }
}