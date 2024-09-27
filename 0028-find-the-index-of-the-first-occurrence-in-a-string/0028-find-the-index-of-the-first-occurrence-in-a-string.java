public class Solution {
    public int strStr(String haystack, String needle) {
        // If the needle is empty, return 0 as per LeetCode's edge case
        if (needle.isEmpty()) {
            return 0;
        }
        
        // Use the indexOf method to find the first occurrence of needle in haystack
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String haystack = "hello";
        String needle = "ll";
        System.out.println(solution.strStr(haystack, needle)); // Output: 2
    }
}
