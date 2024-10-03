class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0]; // Initialize maxSum with the first element
        int currentSum = nums[0]; // Initialize currentSum with the first element

        for (int i = 1; i < nums.length; i++) {
            // Update currentSum to be the maximum of current element or currentSum + current element
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update maxSum if currentSum is greater
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum; // Return the maximum sum found
    }
}
