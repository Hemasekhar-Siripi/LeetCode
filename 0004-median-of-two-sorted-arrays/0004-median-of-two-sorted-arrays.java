class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
       // Step 1: Merge the two arrays
        int[] merged = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, merged, 0, nums1.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);
        
        // Step 2: Sort the merged array
        Arrays.sort(merged);
        
        // Step 3: Find the median
        int n = merged.length;
        if (n % 2 == 1) {
            // If odd, return the middle element
            return merged[n / 2];
        } else {
            // If even, return the average of the two middle elements
            return (merged[n / 2 - 1] + merged[n / 2]) / 2.0;
        }
    }
}
    