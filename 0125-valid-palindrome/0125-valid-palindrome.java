class Solution {
    public boolean isPalindrome(String s) {
       // Step 1: Convert string to lowercase and filter out non-alphanumeric characters
        StringBuilder filtered = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filtered.append(Character.toLowerCase(c));
            }
        }
        
        // Step 2: Check if the filtered string is a palindrome
        String filteredString = filtered.toString();
        String reversedString = filtered.reverse().toString();
        
        return filteredString.equals(reversedString);
    }
}