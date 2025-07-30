# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
# Definition for a binary tree node.
class Solution(object):
    def isValidBST(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        def validate(node, low, high):
            # An empty subtree is valid
            if not node:
                return True

            # Current node must be strictly between low and high
            if not (low < node.val < high):
                return False

            # Left subtree: upper bound becomes node.val
            # Right subtree: lower bound becomes node.val
            return (validate(node.left, low, node.val) and
                    validate(node.right, node.val, high))

        # Use infinities as initial unbounded range
        return validate(root, float('-inf'), float('inf'))

        