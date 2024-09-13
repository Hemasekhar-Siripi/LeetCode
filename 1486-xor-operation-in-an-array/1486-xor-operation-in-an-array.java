class Solution {
    public int xorOperation(int n, int start) {
        int result=0;
            // Calculate the XOR of all elements in nums
            for(int i=0;i<n;i++){
                result^=(start+2*i);
            }
        return result;
        
    }
}