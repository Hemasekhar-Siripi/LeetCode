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
    public TreeNode sortedArrayToBST(int[] nums) {
         if (nums == null || nums.length == 0) {
            return null;
        }
        return convertToBST(nums, 0, nums.length - 1);
    }

    // Helper function to convert part of the array into a BST
    private TreeNode convertToBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;  // Base case: if no elements left, return null
        }

        // Find the middle element to be the root
        int mid = left + (right - left) / 2;  // Avoids overflow in large arrays

        // Create a new TreeNode with the middle element
        TreeNode node = new TreeNode(nums[mid]);

        // Recursively build the left and right subtrees
        node.left = convertToBST(nums, left, mid - 1);  // Left subtree
        node.right = convertToBST(nums, mid + 1, right); // Right subtree

        return node;  // Return the node as root o the subtree
    
        
        
    }
}