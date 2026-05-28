// LeetCode 74 - Search a 2D Matrix

// You are given an m x n integer matrix with properties:
// 1. Each row is sorted in ascending order.
// 2. First element of each row is greater than
//    the last element of previous row.

// Given a target integer,
// return true if target exists in matrix,
// otherwise return false.

// Example:
// Input:
// [
//  [1,3,5,7],
//  [10,11,16,20],
//  [23,30,34,60]
// ]

// target = 3

// Output:
// true

class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {

        int row = matrix.length;
        int col = matrix[0].length;

        int start = 0;
        int end = row * col - 1;

        while(start <= end) {

            int mid = start + (end - start) / 2;

            // converting 1D index to 2D
            int midElement = matrix[mid / col][mid % col];

            if(midElement == target) {
                return true;
            }

            else if(midElement < target) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }

        return false;
    }
}