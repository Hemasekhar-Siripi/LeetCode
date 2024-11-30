public class Solution {
    public String convert(String s, int numRows) {
        // Special cases where no zigzag transformation is needed
        if (numRows <= 1 || s.length() <= numRows) {
            return s;
        }

        // Create a StringBuilder for each row
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        // Variables to track current row and direction of traversal
        int currentRow = 0;
        boolean goingDown = false;

        // Traverse the string and assign each character to the appropriate row
        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);
            // Change direction at the first or last row
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }
            // Move to the next row based on direction
            currentRow += goingDown ? 1 : -1;
        }

        // Combine all rows into a single string
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Example usage
        Solution converter = new Solution();
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(converter.convert(s, numRows)); // Output: "PAHNAPLSIIGYIR"
    }
}
