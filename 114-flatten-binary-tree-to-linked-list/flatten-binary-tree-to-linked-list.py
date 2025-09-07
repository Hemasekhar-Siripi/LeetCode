# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def flatten(self, root):
        if not root:
            return

        # Flatten left and right subtrees
        self.flatten(root.left)
        self.flatten(root.right)

        # If left subtree exists, rewire connections
        if root.left:
            # Save the right subtree
            temp = root.right
            # Move left subtree to right
            root.right = root.left
            root.left = None

            # Find the tail of the new right subtree
            curr = root.right
            while curr.right:
                curr = curr.right

            # Attach saved right subtree
            curr.right = temp
