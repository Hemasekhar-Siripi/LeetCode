class Solution(object):
    def searchRange(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """

        # Helper function to find the first or last position
        def binarySearch(left):
            low, high = 0, len(nums) - 1
            res = -1
            while low <= high:
                mid = (low + high) // 2

                if nums[mid] < target:
                    low = mid + 1
                elif nums[mid] > target:
                    high = mid - 1
                else:
                    res = mid
                    if left:
                        high = mid - 1  # keep searching on the left side
                    else:
                        low = mid + 1   # keep searching on the right side
            return res

        # Find first and last positions
        start = binarySearch(left=True)
        end = binarySearch(left=False)
        return [start, end]
