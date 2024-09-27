public class Solution {
    public int strStr(String haystack, String needle) {
        // Edge case: if the needle is empty, return 0
        if (needle.isEmpty()) {
            return 0;
        }

        int haystackLen = haystack.length();
        int needleLen = needle.length();

        // Loop through haystack, but only up to a point where needle can still fit
        for (int i = 0; i <= haystackLen - needleLen; i++) {
            // Check if the substring in haystack starting from i matches the needle
            if (haystack.substring(i, i + needleLen).equals(needle)) {
                return i;  // Return the starting index of the match
            }
        }

        // If no match was found, return -1
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String haystack = "hello";
        String needle = "ll";
        System.out.println(solution.strStr(haystack, needle)); // Output: 2
    }
}

