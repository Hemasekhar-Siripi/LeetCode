class Solution(object):
    def firstMissingPositive(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)

        # Step 1: Place each number in its correct position
        for i in range(n):
            while 1 <= nums[i] <= n and nums[nums[i] - 1] != nums[i]:
                # Swap nums[i] with the number at its target index
                target = nums[i] - 1
                nums[i], nums[target] = nums[target], nums[i]

        # Step 2: Identify first index i where nums[i] != i+1
        for i in range(n):
            if nums[i] != i + 1:
                return i + 1

        return n + 1
