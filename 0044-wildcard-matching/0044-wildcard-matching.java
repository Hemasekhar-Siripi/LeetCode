class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        
        // DP table where dp[i][j] means s[0..i-1] matches p[0..j-1]
        boolean[][] dp = new boolean[m + 1][n + 1];
        
        // Empty string matches empty pattern
        dp[0][0] = true;
        
        // Fill the first row (s is empty)
        for (int j = 1; j <= n; j++) {
            // Only '*' can match an empty string, otherwise it's false
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
        }
        
        // Fill the rest of the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char sChar = s.charAt(i - 1);
                char pChar = p.charAt(j - 1);
                
                if (pChar == sChar || pChar == '?') {
                    // '?' matches any single character, so take dp[i-1][j-1]
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pChar == '*') {
                    // '*' can match no character (dp[i][j-1]) or one/more characters (dp[i-1][j])
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                }
            }
        }
        
        // The answer is whether the entire string matches the entire pattern
        return dp[m][n];
    }
}