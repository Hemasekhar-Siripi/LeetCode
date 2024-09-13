class Solution {
    public int removeDuplicates(int[] nums) {
         // Edge case: If the array is empty, return 0
        if (nums.length == 0) 
            return 0;
        
        // Initialize the first pointer (slow pointer)
        int i = 0;
        
        // Traverse the array with the second pointer (fast pointer)
        for (int j = 1; j < nums.length; j++) {
            // If a new unique element is found
            if (nums[j] != nums[i]) {
                i++;  // Move the slow pointer
                nums[i] = nums[j];  // Copy the unique element
            }
        }
        
        // The number of unique elements is `i + 1`
        return i + 1;
        
    }
}