class Solution(object):
    def findAnagrams(self,s, p):
        result = []
        p_len = len(p)
        s_len = len(s)

        if p_len > s_len:
            return result

        p_count = Counter(p)                 # Frequency of p
        window = Counter(s[:p_len])          # First window in s

        if window == p_count:
            result.append(0)                 # First window is an anagram

        for i in range(p_len, s_len):
            start_char = s[i - p_len]
            end_char = s[i]

            window[end_char] += 1            # Add new char to window
            window[start_char] -= 1          # Remove old char

            if window[start_char] == 0:
                del window[start_char]       # Clean up 0-count keys

            if window == p_count:
                result.append(i - p_len + 1)

        return result
        