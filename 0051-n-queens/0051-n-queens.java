class Solution {
    public List<List<String>> solveNQueens(int n) {
         List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        
        // Initialize the board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        
        // Start the backtracking algorithm from the first row
        backtrack(result, board, 0, n);
        return result;
    }

    // Backtracking function to try placing queens
    private void backtrack(List<List<String>> result, char[][] board, int row, int n) {
        // If all queens are placed, add the board to the result
        if (row == n) {
            result.add(construct(board));
            return;
        }
        
        // Try placing a queen in each column of the current row
        for (int col = 0; col < n; col++) {
            if (isValid(board, row, col, n)) {
                // Place the queen
                board[row][col] = 'Q';
                
                // Move to the next row
                backtrack(result, board, row + 1, n);
                
                // Backtrack by removing the queen
                board[row][col] = '.';
            }
        }
    }

    // Function to check if placing a queen at board[row][col] is valid
    private boolean isValid(char[][] board, int row, int col, int n) {
        // Check the same column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        
        // Check the upper left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        
        // Check the upper right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        
        return true;
    }

    // Function to construct the board representation as a list of strings
    private List<String> construct(char[][] board) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            result.add(new String(board[i]));
        }
        return result;
    }
}