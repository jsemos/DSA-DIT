/* DSA Week 15 Final Lab */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentDirectoryApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //use map <hashmap> data structure to store data
        Map<String, String> studentDirectory = new HashMap<>();

        while (true) {
            System.out.println("\n=== Student Directory Menu ===");
            System.out.println("1. Add a Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search by StudentID#");
            System.out.println("4. Remove a Student");
            System.out.println("5. Exit application");
            System.out.print("Choose an option from the Menu (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter a studentID#: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter a student name: ");
                    String name = scanner.nextLine();
                    studentDirectory.put(id, name);
                    System.out.println("Student added.");
                    break;
                case 2:
                    System.out.println("\nView All students:");
                    for (Map.Entry<String, String> entry : studentDirectory.entrySet()) {
                        System.out.println("ID: " + entry.getKey() + " | Name: " + entry.getValue());
                    }
                    break;
                case 3:
                    System.out.print("Enter a studentID# to search: ");
                    String searchId = scanner.nextLine();
                    if (studentDirectory.containsKey(searchId)) {
                        System.out.println("Student Name: " + studentDirectory.get(searchId));
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter a studentID# to remove: ");
                    String removeId = scanner.nextLine();
                    if (studentDirectory.remove(removeId) != null) {
                        System.out.println("Student removed.");
                    } else {
                        System.out.println("Student ID not found.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
