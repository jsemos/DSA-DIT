/* DSA Week 8 Lab 2 */

import java.util.Stack; //import the Stack class or Java Package

public class Week8Lab2<E> {

    private Stack<E> stack;

    // Constructor
    public Week8Lab2() {
        this.stack = new Stack<>();
    }

    // Push method
    public void push(E item) {
        stack.push(item);
    }

    // Peek method
    public E peek() {
        if (!stack.isEmpty()) {
            return stack.peek();
        } else {
            System.out.println("Stack is empty.");
            return null;
        }
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Print stack elements
    public void printStack() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack contents:");
            for (E item : stack) {
                System.out.println(item);
            }
        }
    }

    public static void main(String[] args) {
        // Create a generic stack for Strings
        Week8Lab2<String> stringStack = new Week8Lab2<>();
        stringStack.push("DIT");
        stringStack.push("DHRM");
        stringStack.push("DACC");
        stringStack.push("DICT");

        System.out.println("String Stack:");
        System.out.println("Top element: " + stringStack.peek());
        stringStack.printStack();

        // Create a generic stack for Integers
        Week8Lab2<Integer> intStack = new Week8Lab2<>();
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);

        System.out.println("\nInteger Stack:");
        System.out.println("Top element: " + intStack.peek());
        intStack.printStack();

        // Create a generic stack for Doubles
        Week8Lab2<Double> doubleStack = new Week8Lab2<>();
        doubleStack.push(10.5);
        doubleStack.push(20.75);
        doubleStack.push(30.25);

        System.out.println("\nDouble Stack:");
        System.out.println("Top element: " + doubleStack.peek());
        doubleStack.printStack();
    }
}