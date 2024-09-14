class Solution {
    // Create a HashMap to store Roman numeral symbols and their corresponding values.
    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int previousValue = 0;

        // Iterate over the string characters in reverse order.
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanMap.get(s.charAt(i));

            // If the current value is smaller than the previous value, subtract it from the total.
            if (currentValue < previousValue) {
                total -= currentValue;
            } else {
                // Otherwise, add the current value to the total.
                total += currentValue;
            }

            // Update the previous value for the next iteration.
            previousValue = currentValue;
        }

        return total;
    }

}