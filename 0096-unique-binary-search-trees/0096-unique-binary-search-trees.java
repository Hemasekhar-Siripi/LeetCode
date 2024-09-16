class Solution {
    public int numTrees(int n) {
        // DP array to store number of unique BSTs for each number of nodes
        int[] dp = new int[n + 1];

        // Base cases
        dp[0] = 1; // One unique BST for zero nodes (empty tree)
        dp[1] = 1; // One unique BST for one node

        // Fill dp array for all n from 2 to the given n
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // dp[i] is the sum of dp[left subtree] * dp[right subtree]
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }

        return dp[n]; // Number of unique BSTs for n nodes
    
    }
}