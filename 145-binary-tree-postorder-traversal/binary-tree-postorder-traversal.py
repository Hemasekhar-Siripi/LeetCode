# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def postorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        result = []

        def dfs(node):
            if not node:
                return
            dfs(node.left)       # 1. Traverse left
            dfs(node.right)      # 2. Traverse right
            result.append(node.val)  # 3. Visit root

        dfs(root)
        return result
