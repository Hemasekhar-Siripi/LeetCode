public class Solution {
    public String multiply(String num1, String num2) {
        // Edge case: if either number is "0", the product is "0"
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        // Initialize result array to store the product
        int[] result = new int[num1.length() + num2.length()];

        // Multiply each digit of num1 by each digit of num2
        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                int digit1 = num1.charAt(i) - '0'; // Convert char to int
                int digit2 = num2.charAt(j) - '0'; // Convert char to int

                int mul = digit1 * digit2; // Multiply the two digits
                int p1 = i + j, p2 = i + j + 1; // Positions in result array

                int sum = mul + result[p2]; // Add the multiplication result to the current position

                result[p2] = sum % 10; // Store the current digit
                result[p1] += sum / 10; // Carry over to the next position
            }
        }

        // Convert the result array to a string
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            // Skip leading zeros
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.multiply("123", "456")); // Output: "56088"
    }
}
