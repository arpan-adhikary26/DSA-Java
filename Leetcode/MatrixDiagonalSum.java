// LeetCode 1572 - Matrix Diagonal Sum

// Given a square matrix mat,
// return the sum of the matrix diagonals.

// Only count the middle element once
// if the matrix size is odd.

// Example:
// Input:
// [
//  [1,2,3],
//  [4,5,6],
//  [7,8,9]
// ]

// Output:
// 25

// Explanation:
// Primary diagonal  : 1 + 5 + 9 = 15
// Secondary diagonal: 3 + 5 + 7 = 15

// Since 5 is counted twice,
// subtract it once.

// Final Answer:
// 15 + 15 - 5 = 25

// Logic:
// 1. Traverse matrix using single loop
// 2. Add primary diagonal element -> mat[i][i]
// 3. Add secondary diagonal element -> mat[i][n-i-1]
// 4. If matrix size is odd,
//    subtract middle element once

// Time Complexity:
// O(n)

// Space Complexity:
// O(1)

class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for(int i=0; i<n; i++){
                sum+=mat[i][i];
                sum+= mat[i][n-i-1];
            }
            if(n%2 !=0){
                sum = sum-mat[n/2][n/2];
            }
        return sum;
        }
    }