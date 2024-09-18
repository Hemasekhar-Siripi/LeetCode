class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        // Start the backtracking process
        backtrack(result, "", 0, 0, n);
        return result;
    }
    
    private void backtrack(List<String> result, String currentString, int open, int close, int max) {
        // If the current string has reached the maximum length, add it to the result list
        if (currentString.length() == max * 2) {
            result.add(currentString);
            return;
        }
        
        // If we can still add an open parenthesis, add it and backtrack
        if (open < max) {
            backtrack(result, currentString + "(", open + 1, close, max);
        }
        
        // If we can still add a close parenthesis, add it and backtrack
        if (close < open) {
            backtrack(result, currentString + ")", open, close + 1, max);
        
        }
    }
}