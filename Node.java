/*
*   *** Binary Search Tree (BST) Basic Functions ***
*
*   In a BST the left node of a subtree is always less than its root node, and its ancestors
*   The right node of a subtree is always more than its root node, and its ancestors
*   The left and right subtree each must also be a binary search tree
*/

public class Node {

    Node left, right; // Create left and right node references
    int data; // Data for each node

    Node(int data) { // Constructor
        this.data = data;
    }

    public void insert(int value) { // Insert a value in the BST
        if (value <= data) { // If the value you are wanting to add is greater than the current nodes data, e.g., Node head = new Node(10); head.insert(7); 7 is less than data of the node you are referring to
            if (left == null) { // If there is no left node
                left = new Node(value); // Create a node with the value in the argument of the function
            } else {
                left.insert(value); // Recursively call the function on the left node
            }
        } else { // If the value is greater than data
            if (right == null) { // If there is no right node
                right = new Node(value); // Create a new node with value in the argument of the function
            } else {
                left.insert(value); // Recursively call the function on the right node

            }
        }
    }

    public boolean contains(int value) { // See if the tree contains a certain value
        if (value == data) { // If the value you are looking for is the current node return true
            return true;
        } else if (value < data) { // If the value you are looking for is less than the value of the node you are at
            if (left == null) { // If there is no left node return false
                return false;
            } else { // If there is a left node
                return left.contains(value); // Recursively call the function on the left node
            }
        } else { // If the value you are looking for is greater than the value of the node you are at
            if (right == null) { // If there isn't a right node return false
                return false;
            } else { // If there is a right node
                return right.contains(value); // Recursively call the function on the right node
            }
        }
    }

    public void printInOrder() {
        if (left != null) { // If there is a left node in the tree
            left.printInOrder(); // Recursively call the function on the left subtree
        }
        System.out.println(data); // Print the root value (Middle value)
        if (right != null) { // If there is a right node in the tree
            right.printInOrder(); // Recursively call the function on the right subtree
        }
    }

}
