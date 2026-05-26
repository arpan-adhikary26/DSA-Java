// LeetCode 54 - Spiral Matrix

// Given an m x n matrix,
// return all elements of the matrix in spiral order.

// Example:
// Input:
// [
//  [1,2,3],
//  [4,5,6],
//  [7,8,9]
// ]

// Output:
// [1,2,3,6,9,8,7,4,5]

// Logic:
// We use 4 boundaries:
// 1. startRow -> top boundary
// 2. endRow   -> bottom boundary
// 3. startCol -> left boundary
// 4. endCol   -> right boundary

// Traversal Order:
// 1. Top Row
// 2. Right Column
// 3. Bottom Row
// 4. Left Column

// After one complete layer,
// boundaries are shrunk towards inner matrix.

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while(startRow <= endRow && startCol <= endCol) {

            
            for(int j = startCol; j <= endCol; j++) {
                result.add(matrix[startRow][j]);
            }

            
            for(int i = startRow + 1; i <= endRow; i++) {
                result.add(matrix[i][endCol]);
            }

            
            for(int j = endCol - 1; j >= startCol; j--) {
                if(startRow == endRow) break;
                result.add(matrix[endRow][j]);
            }

           
            for(int i = endRow - 1; i >= startRow + 1; i--) {
                if(startCol == endCol) break;
                result.add(matrix[i][startCol]);
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

        return result;
    }
}