class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int count=0;
        // Shift left and right until they become the same
        while(left!=right){
            left>>=1;
            right>>=1;
            count+=1;
            
        }
        // After shifting, left and right will be equal, and we shift left back to its original position
        return left<<=count;
        
    }
}