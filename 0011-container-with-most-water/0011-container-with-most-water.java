class Solution {
     public int maxArea(int[] height) {
        // Initialize two pointers
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        // Loop until the two pointers meet
        while (left < right) {
            // Calculate the current area
            int currentHeight = Math.min(height[left], height[right]);
            int width = right - left;
            int currentArea = currentHeight * width;

            // Update maxArea if the current area is larger
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer with the smaller height
            if (height[left] < height[right]) {
                left++; // Move the left pointer to the right
            } else {
                right--; // Move the right pointer to the left
            }
        }

        // Return the maximum area found
        return maxArea;
    }
}