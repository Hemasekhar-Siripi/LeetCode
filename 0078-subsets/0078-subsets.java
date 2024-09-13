import java.util.ArrayList;
import java.util.List;

public class Solution {
    
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        int numOfSubsets = 1 << n; // 2^n subsets
        List<List<Integer>> result = new ArrayList<>();
        
        // Generate all subsets
        for (int mask = 0; mask < numOfSubsets; mask++) {
            List<Integer> currentSubset = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                // If the i-th bit of mask is 1, include nums[i]
                if ((mask & (1 << i)) != 0) {
                    currentSubset.add(nums[i]);
                }
            }
            result.add(currentSubset);
        }
        
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = sol.subsets(nums);
        System.out.println(subsets);
    }
}
