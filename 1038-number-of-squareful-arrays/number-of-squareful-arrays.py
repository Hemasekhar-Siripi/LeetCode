import math
from collections import Counter

class Solution:
    def numSquarefulPerms(self, nums):
        def is_square(num):
            root = int(num ** 0.5)
            return root * root == num
        
        def backtrack(path, counter):
            if len(path) == len(nums):
                self.count += 1
                return
            
            for x in counter:
                if counter[x] > 0:
                    if not path or is_square(path[-1] + x):
                        counter[x] -= 1
                        path.append(x)
                        backtrack(path, counter)
                        path.pop()
                        counter[x] += 1

        self.count = 0
        counter = Counter(nums)
        backtrack([], counter)
        return self.count
