class Solution(object):
    def longestPalindrome(self,s):
        if not s or len(s) == 1:
            return s

        start = 0
        end = 0

        for i in range(len(s)):
            # Odd-length palindrome
            len1 = expandFromCenter(s, i, i)
            # Even-length palindrome
            len2 = expandFromCenter(s, i, i + 1)

            max_len = max(len1, len2)

            if max_len > (end - start):
                start = i - (max_len - 1) // 2
                end = i + max_len // 2

        return s[start:end + 1]

def expandFromCenter(s, left, right):
        while left >= 0 and right < len(s) and s[left] == s[right]:
            left -= 1
            right += 1
        return right - left - 1  # length of the palindrome

        