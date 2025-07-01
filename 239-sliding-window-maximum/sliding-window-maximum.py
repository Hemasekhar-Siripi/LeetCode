from collections import deque

class Solution(object):
    def maxSlidingWindow(self,nums, k):
        q = deque()  # Store indices of useful elements
        result = []

        for i in range(len(nums)):
            # Remove indices out of window
            while q and q[0] < i - k + 1:
                q.popleft()

            # Remove smaller elements as they won't be needed
            while q and nums[q[-1]] < nums[i]:
                q.pop()

            q.append(i)

            # Record result starting from when window is full
            if i >= k - 1:
                result.append(nums[q[0]])

        return result
