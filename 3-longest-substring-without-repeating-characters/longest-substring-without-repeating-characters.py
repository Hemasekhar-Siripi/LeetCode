class Solution(object):
    def lengthOfLongestSubstring(self,s):
        char_index = {}
        max_length = 0
        start = 0

        for end in range(len(s)):
            if s[end] in char_index and char_index[s[end]] >= start:
                start = char_index[s[end]] + 1  # move start right

            char_index[s[end]] = end  # update last seen
            max_length = max(max_length, end - start + 1)

        return max_length

        