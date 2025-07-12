class Solution(object):
    def partitionLabels(self, s):
        """
        :type s: str
        :rtype: List[int]
        """
        last = {ch: i for i, ch in enumerate(s)}  # Step 1: Last index of each character
        result = []
        start = end = 0

        for i, ch in enumerate(s):  # Step 2: Traverse string
            end = max(end, last[ch])  # Expand current partition to include current char

            if i == end:  # End of partition
                result.append(end - start + 1)
                start = i + 1  # Start new partition

        return result
