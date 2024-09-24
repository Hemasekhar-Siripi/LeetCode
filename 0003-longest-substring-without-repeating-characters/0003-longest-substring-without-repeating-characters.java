class Solution {
    public int lengthOfLongestSubstring(String s) {
         int n = s.length();
        int maxLength = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();

        // Iterate through the string using a sliding window
        for (int right = 0; right < n; right++) {
            // If the character is already in the set, remove the leftmost character
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            // Add the current character to the set and update the max length
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}