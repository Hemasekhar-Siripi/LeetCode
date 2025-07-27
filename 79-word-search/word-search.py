class Solution(object):
    def exist(self, board, word):
        """
        :type board: List[List[str]]
        :type word: str
        :rtype: bool
        """
        rows, cols = len(board), len(board[0])

        # DFS function to search the word
        def dfs(r, c, i):
            # If we've matched all letters
            if i == len(word):
                return True
            # Out of bounds or character mismatch
            if r < 0 or c < 0 or r >= rows or c >= cols or board[r][c] != word[i]:
                return False

            # Save the current character and mark cell as visited
            temp = board[r][c]
            board[r][c] = '#'  # Mark as visited

            # Explore all 4 directions
            found = (
                dfs(r + 1, c, i + 1) or
                dfs(r - 1, c, i + 1) or
                dfs(r, c + 1, i + 1) or
                dfs(r, c - 1, i + 1)
            )

            # Backtrack: restore the character
            board[r][c] = temp

            return found

        # Try to start DFS from every cell
        for r in range(rows):
            for c in range(cols):
                if dfs(r, c, 0):  # Start searching from board[r][c]
                    return True

        return False
