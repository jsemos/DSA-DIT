/* DSA Week 11 Lab 1 */

//import Arraylist and list classes
import java.util.ArrayList; 
import java.util.List;

class TreeNode {
    String value;
    List<TreeNode> children;

    TreeNode(String value) {
        this.value = value;
        this.children = new ArrayList<>();
    }

    void addChild(TreeNode child) {
        children.add(child);
    }
}

public class Week11Lab1 {

    static void printTree(TreeNode node, int level) {
        // Indent based on tree level
        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }

        System.out.println(node.value);

        for (TreeNode child : node.children) {
            printTree(child, level + 1);
        }
    }

    public static void main(String[] args) {
        // Create the root node
        TreeNode root = new TreeNode("Diploma Programs");
        
        // Add children in the same order as stack push
        TreeNode node1 = new TreeNode("DIT");
        root.addChild(node1);
        
        TreeNode child1 = new TreeNode("D1");
        node1.addChild(child1);
        
        TreeNode child2 = new TreeNode("D2");
        node1.addChild(child2);
        
        TreeNode node2 = new TreeNode("DHRM");
        root.addChild(node2);

        TreeNode node3 = new TreeNode("DACC");
        root.addChild(node3);

        TreeNode node4 = new TreeNode("DICT");
        root.addChild(node4);
        
        // Print tree recursively
        printTree(root, 0);
    }
}
