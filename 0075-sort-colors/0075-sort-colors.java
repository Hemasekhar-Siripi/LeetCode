class Solution {
    public void sortColors(int[] nums) {
        //initialize the three pointers
        int low=0;
        int current=0;
        int high=nums.length-1;
        //continue while the current is not greater
        while(current<=high){
            //case 1:if current is 0 ,move it to the low
            if(nums[current]==0){
                //swap current with low
                int temp=nums[current];
                 nums[current]=nums[low];
                nums[low]=temp;
                //move both low and current forward since we have placed 0 correctly
                low++;
                current++;//move to the next ele to process    
            }
            //case2 if the current ele is 1,its already in correct pos
            else if(nums[current]==1){
                //no swapping is required
                current++;
            }
            //case 3 if the current element is 2,move to high region
            else{
                int temp=nums[current];
                nums[current]=nums[high];
                nums[high]=temp;
                //move high backward since we have placed 2 correctly
                high--;//the next will go before the current 2
                
            }
            
            
        }
        
       
        
    }
     
}