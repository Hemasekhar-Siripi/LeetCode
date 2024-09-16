class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> triangle = new ArrayList<>();

        // First base case: if numRows is 0, return an empty list
        if (numRows == 0) {
            return triangle;
        }

        // Add the first row (always [1])
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        // Generate each row from the second row onwards
        for (int row = 1; row < numRows; row++) {
            List<Integer> newRow = new ArrayList<>();
            List<Integer> prevRow = triangle.get(row - 1);

            // First element of every row is 1
            newRow.add(1);

            // Each element in the middle is the sum of the two above it
            for (int j = 1; j < row; j++) {
                newRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            // Last element of every row is 1
            newRow.add(1);

            // Add the row to the triangle
            triangle.add(newRow);
        }

        return triangle;
    
    }
}