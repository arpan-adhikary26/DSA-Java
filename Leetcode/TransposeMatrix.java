// LeetCode 867 - Transpose Matrix

// Given a 2D integer matrix,
// return the transpose of the matrix.

// Transpose means converting rows into columns
// and columns into rows.

// Example:
//
// Input:
// [
//  [1,2,3],
//  [4,5,6]
// ]
//
// Output:
// [
//  [1,4],
//  [2,5],
//  [3,6]
// ]

class Solution {

    public int[][] transpose(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        // Creating transpose matrix
        int transpose[][] = new int[col][row];

        // Transposing matrix
        for(int i = 0; i < row; i++) {

            for(int j = 0; j < col; j++) {

                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }
}