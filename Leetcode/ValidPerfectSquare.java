// LeetCode 367 - Valid Perfect Square
//
// Given a positive integer num,
// return true if num is a perfect square,
// otherwise return false.
//
// Approach:
// 1. Use Binary Search on the range [1, num].
// 2. Find mid and calculate mid * mid.
// 3. If square equals num, return true.
// 4. If square is smaller, search right half.
// 5. If square is larger, search left half.
// 6. If no match is found, return false.
//
// Example:
// Input: 16
// Output: true
//
// Input: 14
// Output: false
//
// Time Complexity: O(log n)
// Space Complexity: O(1)
//
// Concepts Used:
// ✓ Binary Search
// ✓ Overflow Handling using long
// ✓ Search Space Reduction

class Solution {
    public boolean isPerfectSquare(int num) {

        int start = 1;
        int end = num;

        while(start <= end) {

            int mid = start + (end - start) / 2;

            long square = (long) mid * mid;

            if(square == num) {
                return true;
            }
            else if(square < num) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return false;
    }
}