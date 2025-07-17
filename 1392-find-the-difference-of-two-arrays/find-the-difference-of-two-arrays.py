class Solution(object):
    def findDifference(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[List[int]]
        """
        # Convert both lists to sets to remove duplicates and allow fast operations
        set1 = set(nums1)
        set2 = set(nums2)

        # Use set difference
        only_in_nums1 = list(set1 - set2)
        only_in_nums2 = list(set2 - set1)

        return [only_in_nums1, only_in_nums2]
