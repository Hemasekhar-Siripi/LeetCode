class Solution(object):
    def getPermutation(self, n, k):
        """
        :type n: int
        :type k: int
        :rtype: str
        """
        from math import factorial

        numbers = [str(i) for i in range(1, n + 1)]
        result = []
        k -= 1  # Convert to 0-indexed

        for i in range(n, 0, -1):
            f = factorial(i - 1)
            index = k // f
            result.append(numbers.pop(index))
            k %= f

        return ''.join(result)
