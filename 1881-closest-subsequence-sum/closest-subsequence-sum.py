from bisect import bisect_left

class Solution:
    def minAbsDifference(self, nums, goal):
        def get_sub_sums(arr):
            res = {0}
            for num in arr:
                res |= {x + num for x in res}
            return sorted(res)
        
        n = len(nums)
        left = nums[:n//2]
        right = nums[n//2:]
        
        left_sums = get_sub_sums(left)
        right_sums = get_sub_sums(right)
        
        min_diff = float('inf')
        
        for s in left_sums:
            remain = goal - s
            i = bisect_left(right_sums, remain)
            
            if i < len(right_sums):
                min_diff = min(min_diff, abs(s + right_sums[i] - goal))
            if i > 0:
                min_diff = min(min_diff, abs(s + right_sums[i-1] - goal))
        
        return min_diff
