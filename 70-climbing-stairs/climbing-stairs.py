class Solution(object):
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n <= 2:
            return n

        a, b = 1, 2  # base cases: 1 way for step 1, 2 ways for step 2

        for i in range(3, n + 1):
            a, b = b, a + b  # Fibonacci update

        return b

        