public class Solution {

    public int removeElement(int[] nums, int val) {
        int k = 0; // This will track the number of elements not equal to val
        
        // Traverse the entire array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val
            if (nums[i] != val) {
                nums[k] = nums[i]; // Place it in the correct position
                k++; // Increment k as this is a valid element
            }
        }
        
        // Return the number of valid elements
        return k;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int result = sol.removeElement(nums, val);
        System.out.println("New length: " + result);
        // Output the modified array (first 'result' elements)
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
