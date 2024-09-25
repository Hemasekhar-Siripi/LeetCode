class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size=nums.length;
        for(int i=0;i<size-1;i++){//here i starts from oth indes
            for(int j=i+1;j<size;j++){//here j starts from 1st index
                if(nums[i]+nums[j]==target){
                     return new int[]{i,j};//return index values
                    
                }
            }
        }
        return new int[]{};//return nothing
    }     
    
}