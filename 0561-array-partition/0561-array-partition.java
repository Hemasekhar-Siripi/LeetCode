class Solution {
    public int arrayPairSum(int[] nums) {
        // Sort the array
        Arrays.sort(nums);

        int sum = 0;

        // Sum every second element, starting from the first element (index 0)
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }
}