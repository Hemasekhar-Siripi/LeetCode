class Solution {
    public int divide(int dividend, int divisor) {
       
      // Handle edge case for overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; // Overflow case
        }

        // Determine the sign of the result
        boolean isNegative = (dividend < 0) ^ (divisor < 0);

        // Convert both dividend and divisor to positive
        long dividendLong = Math.abs((long) dividend);
        long divisorLong = Math.abs((long) divisor);

        int quotient = 0;

        // Use bit manipulation to speed up the division process
        while (dividendLong >= divisorLong) {
            long temp = divisorLong, multiple = 1;
            
            // Keep doubling the divisor (using left shift) until it exceeds the dividend
            while (dividendLong >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            
            // Subtract the largest shifted divisor and add the corresponding multiple
            dividendLong -= temp;
            quotient += multiple;
        }

        // Apply the sign of the result
        return isNegative ? -quotient : quotient;
    
        
    }
}