class Solution(object):
    def maxDistance(self, arrays):
        """
        :type arrays: List[List[int]]
        :rtype: int
        """
        res = 0
        min_val = arrays[0][0]
        max_val = arrays[0][-1]

        for i in range(1, len(arrays)):
            arr = arrays[i]
            # Possible max distances with current array vs global min/max so far
            res = max(res, abs(arr[-1] - min_val), abs(max_val - arr[0]))

            # Update global min and max
            min_val = min(min_val, arr[0])
            max_val = max(max_val, arr[-1])

        return res
