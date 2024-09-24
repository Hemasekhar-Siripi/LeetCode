class Solution {//insertion sort
    public int[] sortArray(int[] nums) {
        int a = nums.length;

        // Start with the second element (since the first element is trivially sorted)
        for (int i = 1; i < a; i++) {
            int key = nums[i]; // Current element to be inserted
            int j = i - 1;

            // Move elements of the sorted part that are greater than the key, one position ahead
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            
            // Insert the key at the correct position
            nums[j + 1] = key;
        }

        // Return the sorted array
        return nums;
    }
}
