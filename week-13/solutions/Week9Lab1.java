import java.util.LinkedList;
import java.util.Queue;

public class Week9Lab1 {

   public static void main(String[] args) {
      // Create a Queue object called itiCourses
      Queue<String> itiCourses = new LinkedList<>();
   
      // Enqueue elements into the queue
      itiCourses.add("DIT");
      itiCourses.add("DHRM");
      itiCourses.add("DACC");
      itiCourses.add("DICT");
   
      // Peek or see the front element of the queue
      System.out.println("Front element: " + itiCourses.peek());
   
      // If queue is empty, print message; else print elements in the queue
      if(itiCourses.isEmpty()) {
         System.out.println("Queue is empty");        
      } else {
         // Print the queue (it will display elements in FIFO order)
         System.out.println("Queue contents: " + itiCourses);   
      }
   }
}
