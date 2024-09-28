class Solution {
    public boolean isPalindrome(int n) {
        int reverse=0;
        int temp=n;
        while(n>0){
            int r=n%10;
            reverse=reverse*10;
            reverse=reverse+r;
            n=n/10;
        }
        if(reverse==temp){
            return true;
        }else{
            return false;
        }
        
    }
}