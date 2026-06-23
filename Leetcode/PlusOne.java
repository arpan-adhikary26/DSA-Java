// LeetCode 66 - Plus One
//
// Given an integer array representing a large
// non-negative number, increment the number by one.
//
// Approach:
// 1. Traverse the array from right to left.
// 2. If current digit is less than 9,
//    increment it and return.
// 3. If digit is 9,
//    change it to 0 and continue.
// 4. If all digits are 9,
//    create a new array with one extra digit.
//
// Example:
// [1,2,3] -> [1,2,4]
// [1,2,9] -> [1,3,0]
// [9,9,9] -> [1,0,0,0]
//
// Time Complexity: O(n)
// Space Complexity: O(1)
// (O(n) only when a new array is created)

class Solution {
    public int[] plusOne(int[] digits) {

        for(int i = digits.length - 1; i >= 0; i--) {

            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }
}