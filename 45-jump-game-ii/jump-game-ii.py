class Solution(object):
    def jump(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)
        jumps = 0
        farthest = 0
        current_end = 0

        for i in range(n - 1):  # we don't need to jump from the last index
            farthest = max(farthest, i + nums[i])  # Update farthest index we can reach
            if i == current_end:
                # We must jump now
                jumps += 1
                current_end = farthest  # Set new end for next jump

        return jumps
