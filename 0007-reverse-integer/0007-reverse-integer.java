class Solution {
    public int reverse(int x) {
        //int temp=x;
        int result = 0;

        while (x != 0) {
            int lastDigit = x % 10;  // Extract the last digit
            x = x / 10;  // Remove the last digit

            // Check for overflow before updating result
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
                return 0;  // Overflow condition for positive numbers
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
                return 0;  // Overflow condition for negative numbers
            }

            // Append the last digit to the result
            result = result * 10 + lastDigit;
        }

        return result;
        
    }
}