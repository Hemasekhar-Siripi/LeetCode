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
class Solution{
    public boolean isSameTree(TreeNode p,TreeNode q){
        //if both cases are null then return true
        if(p==null && q==null){
            return true;
        }
        //if only one tree is null other values are diff they are not identical
        if(p==null || q==null || p.val!=q.val){
            return false;
        }
        //recursively check if left and right subtrees are identical
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
