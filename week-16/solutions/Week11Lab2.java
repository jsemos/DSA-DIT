/* DSA Week 11 Lab 2 */

class BinaryTreeNode {
    String value;
    BinaryTreeNode left;   // First child
    BinaryTreeNode right;  // Next sibling

    BinaryTreeNode(String value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    //method to add child using left-child right-sibling nodes
    void addChild(BinaryTreeNode child) {
        if (left == null) {
            left = child;
        } else {
            BinaryTreeNode current = left;
            while (current.right != null) {
                current = current.right;
            }
            current.right = child;
        }
    }
}

public class Week11Lab2 {

    //printTree method for binary tree using left-child right-sibling 
    static void printTree(BinaryTreeNode node, int level) {
        if (node == null) return;

        // Indentation loop
        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }
        System.out.println(node.value);

        // First child (left) goes to next level
        printTree(node.left, level + 1);

        // Sibling (right) stays on same level
        printTree(node.right, level);
    }

    public static void main(String[] args) {
        // Create root
        BinaryTreeNode root = new BinaryTreeNode("Diploma Programs");

        // Add children to root
        BinaryTreeNode dit = new BinaryTreeNode("DIT");
        BinaryTreeNode dhrm = new BinaryTreeNode("DHRM");
        BinaryTreeNode dacc = new BinaryTreeNode("DACC");
        BinaryTreeNode dict = new BinaryTreeNode("DICT");

        root.addChild(dit);
        root.addChild(dhrm);
        root.addChild(dacc);
        root.addChild(dict);

        // Add children to DIT (first one)
        dit.addChild(new BinaryTreeNode("D1"));
        dit.addChild(new BinaryTreeNode("D2"));

        // Print the binary tree
        printTree(root, 0);
    }
}
