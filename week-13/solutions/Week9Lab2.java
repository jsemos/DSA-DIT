import java.util.LinkedList;
import java.util.Queue;

public class Week9Lab2<E> {

   private Queue<E> queue; // Change Stack to Queue

   // Constructor
   public Week9Lab2() {
      this.queue = new LinkedList<>();
   }

   // Enqueue method (add elements to the queue)
   public void enqueue(E item) {
      queue.add(item);
   }

   // Dequeue method (remove elements from the front of the queue)
   public E dequeue() {
      if (!queue.isEmpty()) {
         return queue.poll();
      } else {
         System.out.println("Queue is empty.");
         return null;
      }
   }

   // Peek method (check front element)
   public E peek() {
      if (!queue.isEmpty()) {
         return queue.peek();
      } else {
         System.out.println("Queue is empty.");
         return null;
      }
   }

   // Check if queue is empty
   public boolean isEmpty() {
      return queue.isEmpty();
   }

   // Print queue elements
   public void printQueue() {
      if (queue.isEmpty()) {
         System.out.println("Queue is empty.");
      } else {
         System.out.println("Queue contents:");
         for (E item : queue) {
            System.out.println(item);
         }
      }
   }

   public static void main(String[] args) {
      // Create a generic queue for Strings
      Week9Lab2<String> stringQueue = new Week9Lab2<>();
      stringQueue.enqueue("DIT");
      stringQueue.enqueue("DHRM");
      stringQueue.enqueue("DACC");
      stringQueue.enqueue("DICT");
   
      System.out.println("String Queue:");
      System.out.println("Front element: " + stringQueue.peek());
      stringQueue.printQueue();
   
      // Create a generic queue for Integers
      Week9Lab2<Integer> intQueue = new Week9Lab2<>();
      intQueue.enqueue(10);
      intQueue.enqueue(20);
      intQueue.enqueue(30);
   
      System.out.println("\nInteger Queue:");
      System.out.println("Front element: " + intQueue.peek());
      intQueue.printQueue();
   
      // Create a generic queue for Doubles
      Week9Lab2<Double> doubleQueue = new Week9Lab2<>();
      doubleQueue.enqueue(10.5);
      doubleQueue.enqueue(20.75);
      doubleQueue.enqueue(30.25);
   
      System.out.println("\nDouble Queue:");
      System.out.println("Front element: " + doubleQueue.peek());
      doubleQueue.printQueue();
   }
}
