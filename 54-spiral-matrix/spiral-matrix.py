class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        result = []
        if not matrix or not matrix[0]:
            return result

        top = 0
        bottom = len(matrix) - 1
        left = 0
        right = len(matrix[0]) - 1

        while top <= bottom and left <= right:

            # Traverse from left to right
            for col in range(left, right + 1):
                result.append(matrix[top][col])
            top += 1  # move top boundary down

            # Traverse from top to bottom
            for row in range(top, bottom + 1):
                result.append(matrix[row][right])
            right -= 1  # move right boundary left

            # Traverse from right to left (only if there's a remaining row)
            if top <= bottom:
                for col in range(right, left - 1, -1):
                    result.append(matrix[bottom][col])
                bottom -= 1  # move bottom boundary up

            # Traverse from bottom to top (only if there's a remaining column)
            if left <= right:
                for row in range(bottom, top - 1, -1):
                    result.append(matrix[row][left])
                left += 1  # move left boundary right

        return result
