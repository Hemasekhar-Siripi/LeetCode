class Solution(object):
    def solveNQueens(self, n):
        """
        :type n: int
        :rtype: List[List[str]]
        """
        result = []
        board = ['.' * n for _ in range(n)]

        def backtrack(row, cols, diag1, diag2):
            if row == n:
                result.append(list(board))
                return

            for col in range(n):
                if col in cols or (row - col) in diag1 or (row + col) in diag2:
                    continue

                # Place queen
                board[row] = board[row][:col] + 'Q' + board[row][col + 1:]
                cols.add(col)
                diag1.add(row - col)
                diag2.add(row + col)

                backtrack(row + 1, cols, diag1, diag2)

                # Backtrack
                board[row] = board[row][:col] + '.' + board[row][col + 1:]
                cols.remove(col)
                diag1.remove(row - col)
                diag2.remove(row + col)

        backtrack(0, set(), set(), set())
        return result
