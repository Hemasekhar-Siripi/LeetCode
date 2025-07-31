class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)
        if n <= 2:
            return n  # Already satisfies the condition

        insert_pos = 2  # Start from index 2

        for i in range(2, n):
            # Compare current number with the number two positions behind
            if nums[i] != nums[insert_pos - 2]:
                nums[insert_pos] = nums[i]
                insert_pos += 1

        return insert_pos  # Length of valid array
