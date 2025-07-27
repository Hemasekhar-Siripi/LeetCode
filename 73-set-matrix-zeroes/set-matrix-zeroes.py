class Solution(object):
    def setZeroes(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None. Modify matrix in-place.
        """
        if not matrix:
            return

        m, n = len(matrix), len(matrix[0])
        first_row_zero = any(matrix[0][j] == 0 for j in range(n))  # Check if first row has a zero
        first_col_zero = any(matrix[i][0] == 0 for i in range(m))  # Check if first column has a zero

        # Use first row and first column as flags for the rest of the matrix
        for i in range(1, m):
            for j in range(1, n):
                if matrix[i][j] == 0:
                    matrix[i][0] = 0  # Mark the row
                    matrix[0][j] = 0  # Mark the column

        # Set cells to 0 based on flags in first row and column
        for i in range(1, m):
            for j in range(1, n):
                if matrix[i][0] == 0 or matrix[0][j] == 0:
                    matrix[i][j] = 0

        # Handle the first row
        if first_row_zero:
            for j in range(n):
                matrix[0][j] = 0

        # Handle the first column
        if first_col_zero:
            for i in range(m):
                matrix[i][0] = 0
