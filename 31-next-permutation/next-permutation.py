class Solution(object):
    def nextPermutation(self, nums):
        """
        :type nums: List[int]
        :rtype: None. Modifies nums in-place.
        """
        n = len(nums)
        i = n - 2

        # Step 1: Find first decreasing index from the end
        while i >= 0 and nums[i] >= nums[i + 1]:
            i -= 1

        if i >= 0:
            # Step 2: Find rightmost element greater than nums[i]
            j = n - 1
            while nums[j] <= nums[i]:
                j -= 1
            # Step 3: Swap nums[i] and nums[j]
            nums[i], nums[j] = nums[j], nums[i]

        # Step 4: Reverse nums[i+1:]
        left, right = i + 1, n - 1
        while left < right:
            nums[left], nums[right] = nums[right], nums[left]
            left += 1
            right -= 1
