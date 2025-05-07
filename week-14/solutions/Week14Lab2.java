/* DSA Week 14 Lab 2 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Week14Lab2 extends JFrame {
   private ArrayList<String> todoListData;
   private JList<String> todoList;
   private JTextField inputField;
   private DefaultListModel<String> listModel;

   //create a constructor that contains most of the programming logic
   public Week14Lab2() {
      setTitle("To-Do List (Using ArrayList)");
      setSize(400, 300);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setLayout(new BorderLayout());
   
      //Initialize ArrayList data structure for tasks
      todoListData = new ArrayList<>();
      listModel = new DefaultListModel<>();
      todoList = new JList<>(listModel);
   
      //Create input field and add button at the top UI
      JPanel inputPanel = new JPanel();
      inputField = new JTextField(20);
      JButton addButton = new JButton("Add");
      inputPanel.add(inputField);
      inputPanel.add(addButton);
   
      //Position list in the center
      JScrollPane scrollPane = new JScrollPane(todoList);
   
      //Create a remove button at the bottom UI
      JButton removeButton = new JButton("Remove Selected");
   
      add(inputPanel, BorderLayout.NORTH);
      add(scrollPane, BorderLayout.CENTER);
      add(removeButton, BorderLayout.SOUTH);
   
      //Add button which adds a new task
      addButton.addActionListener(
         e -> {
            String task = inputField.getText().trim();
            if (!task.isEmpty()) {
               todoListData.add(task);  // Add to ArrayList
               listModel.addElement(task);  // Update the GUI list
               inputField.setText("");  // Clear input field
            } else {
               JOptionPane.showMessageDialog(this, "Please enter a task.");
            }
         });
   
      //Remove button which removes a selected task
      removeButton.addActionListener(
         e -> {
            int selectedIndex = todoList.getSelectedIndex();
            if (selectedIndex != -1) {
               todoListData.remove(selectedIndex);  // Remove from ArrayList
               listModel.remove(selectedIndex);  // Remove from GUI list
            } else {
               JOptionPane.showMessageDialog(this, "Select a task to remove.");
            }
         });
   }
   
   //main method 
   public static void main(String[] args) {
      SwingUtilities.invokeLater(() -> new Week14Lab2().setVisible(true));
   }
}
