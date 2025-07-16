class Solution(object):
    def magicalString(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n == 0:
            return 0
        if n <= 3:
            return 1  # magical string starts with "122"

        s = [1, 2, 2]  # initial magical string
        idx = 2        # pointer to read from
        num = 1        # the next number to append (flip between 1 and 2)

        while len(s) < n:
            count = s[idx]  # current group count
            s.extend([num] * count)  # append num `count` times
            num = 3 - num  # flip 1 ↔ 2
            idx += 1

        return s[:n].count(1)
