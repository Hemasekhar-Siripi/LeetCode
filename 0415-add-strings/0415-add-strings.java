class Solution {
    public String addStrings(String num1, String num2) {
       StringBuilder result = new StringBuilder();

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        // Loop through both strings from the last character to the first
        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0; // Get the digit from num1 or 0 if exhausted
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0; // Get the digit from num2 or 0 if exhausted

            int sum = digit1 + digit2 + carry; // Calculate sum with carry
            carry = sum / 10; // Update carry
            result.append(sum % 10); // Append the last digit of sum to result

            i--; // Move to the next digit in num1
            j--; // Move to the next digit in num2
        }

        // The result is in reverse order, so reverse it back
        return result.reverse().toString();
    }
}