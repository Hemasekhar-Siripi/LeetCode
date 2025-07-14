import heapq
from collections import Counter

class Solution(object):
    def topKFrequent(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: List[int]
        """
        # Step 1: Count frequency of each element
        count = Counter(nums)

        # Step 2: Use a heap of size k
        return [item for item, freq in heapq.nlargest(k, count.items(), key=lambda x: x[1])]
