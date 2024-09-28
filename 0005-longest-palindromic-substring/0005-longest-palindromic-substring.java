class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n == 0) return "";
        
        boolean[][] dp = new boolean[n][n];  // dp[i][j] will be true if s[i...j] is a palindrome
        int start = 0;  // The starting index of the longest palindromic substring
        int maxLength = 1;  // The length of the longest palindromic substring found
        
        // Single character substrings are always palindromes
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        
        // Check for two-character substrings
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }
        
        // Check for substrings of length 3 and more
        for (int len = 3; len <= n; len++) {  // len is the length of the current substring
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;  // Endpoint of the current substring
                
                // Check if s[i...j] is a palindrome
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    start = i;
                    maxLength = len;
                }
            }
        }
        
        // Return the longest palindromic substring
        return s.substring(start, start + maxLength);
    }
}
