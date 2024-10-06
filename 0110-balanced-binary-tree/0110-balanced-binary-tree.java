/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     public boolean isBalanced(TreeNode root) {
        // If the checkHeight returns -1, the tree is not balanced
        return checkHeight(root) != -1;
    }
     private int checkHeight(TreeNode node) {
        // Base case: empty node has a height of 0
        if (node == null) {
            return 0;
        }
        
        // Recursively check the height of the left subtree
        int leftHeight = checkHeight(node.left);
        if (leftHeight == -1) {
            return -1;  // Not balanced
        }
        
        // Recursively check the height of the right subtree
        int rightHeight = checkHeight(node.right);
        if (rightHeight == -1) {
            return -1;  // Not balanced
        }
        
        // If the difference in height between left and right subtree is more than 1, return -1 (not balanced)
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;  // Not balanced
        }
        
        // Otherwise, return the height of the subtree rooted at this node
        return Math.max(leftHeight, rightHeight) + 1;
    }
    
    // Main method to determine if the binary tree is balanced
   
}