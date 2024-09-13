class Solution {
    public int[] decode(int[] encoded, int first) {
        int n=encoded.length+1;// The length of the original array is n
        int arr[]=new int[n];// Create an array of size n to store the original array
        arr[0]=first;
        // Iterate through the encoded array and decode each element
        for(int i=0;i<encoded.length;i++){
            arr[i+1]=arr[i]^encoded[i];// arr[i + 1] = arr[i] XOR encoded[i]
            
        }
        return arr;// Return the decoded original array
        
    }
}