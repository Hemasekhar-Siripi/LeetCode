class Solution:
    def coinChange(self, coins, amount):
        # Set up DP array filled with a large value
        dp = [amount + 1] * (amount + 1)
        dp[0] = 0  # Base case: 0 coins needed for amount 0

        for coin in coins:
            for x in range(coin, amount + 1):
                dp[x] = min(dp[x], dp[x - coin] + 1)

        return dp[amount] if dp[amount] != amount + 1 else -1
