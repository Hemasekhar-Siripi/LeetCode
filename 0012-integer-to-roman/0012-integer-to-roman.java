class Solution {
    public String intToRoman(int num) {
      // Define values and corresponding Roman numerals
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        StringBuilder roman = new StringBuilder();
        
        // Iterate through each value-symbol pair
        for (int i = 0; i < values.length && num > 0; i++) {
            // Append the symbol while subtracting the value
            while (num >= values[i]) {
                roman.append(symbols[i]);
                num -= values[i];
            }
        }
        
        return roman.toString();  
    }
}