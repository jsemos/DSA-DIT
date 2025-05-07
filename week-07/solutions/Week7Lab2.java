/* DSA Week 7 Lab 2 */

import java.util.LinkedList;  //import the LinkedList class or Java Package

class Node{
   int data;
   Node next;
   
   //constructor to create a new node
   public Node(int data){
      this.data = data;
      this.next = null;
   }
}

public class Week7Lab2 {
   Node head; //Head of the linked list
   
   //constructor
   public Week7Lab2(){
      this.head = null;
   }
   
   //create method to insert a node at the beginning
   public void insertAtHead(int data){
      Node newNode = new Node(data);
      newNode.next = head; //new node points to the previous head
      head = newNode; //head is updated to the new node
   }
   
   //create method to insert a node at the end
   public void insertAtEnd(int data){
      Node newNode = new Node(data);
      if(head == null){
         head = newNode; //if the list is empty, make new node the head
         return;
      }
      Node temp = head;
      while (temp.next != null){
         temp = temp.next; //traverse until the last node
      }
      temp.next = newNode; //link the last node to the new node
   }
   
   //method to display the list
   public void display(){
      Node temp = head;
      while (temp != null){
         System.out.print(temp.data + "->");
         temp = temp.next;
      }
      System.out.println("null"); //end of the linked list
   }
   
   //method to find the size of the linked list
   public int size(){
      int size = 0;
      Node temp = head;
      while(temp != null){
         size++;
         temp = temp.next;
      }
      return size;
   }
   
   public static void main(String[] args){
      //create Linked List object called itiCourses
      Week7Lab2 myLinkedList = new Week7Lab2();
      
      //add nodes at the head and end
      myLinkedList.insertAtHead(940);
      myLinkedList.insertAtHead(880);
      myLinkedList.insertAtHead(830);
      myLinkedList.insertAtHead(790);
      myLinkedList.insertAtHead(750);
      myLinkedList.insertAtEnd(660);
      myLinkedList.insertAtEnd(650);
      myLinkedList.insertAtEnd(590);
      myLinkedList.insertAtEnd(510);
      myLinkedList.insertAtEnd(440);
      
      //print to the console the Linked List
      System.out.println("Linked List after insertions:");
      myLinkedList.display();
      
      //print size of the list
      System.out.println("Size of the list is: " + myLinkedList.size());
   }
}