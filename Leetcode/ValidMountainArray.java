// LeetCode 941 - Valid Mountain Array
//
// Given an integer array, return true if it
// is a valid mountain array.
//
// A mountain array must:
// 1. Contain at least 3 elements.
// 2. Strictly increase to a single peak.
// 3. Strictly decrease after the peak.
// 4. The peak cannot be the first or last element.
//
// Approach:
// 1. Start from the beginning.
// 2. Move upward while elements are increasing.
// 3. Ensure the peak is neither the first
//    nor the last element.
// 4. Move downward while elements are decreasing.
// 5. If the traversal reaches the last element,
//    the array is a valid mountain.
//
// Example:
// Input: [0,3,2,1]
// Output: true




class Solution {
    public boolean validMountainArray(int[] arr) {

        int n = arr.length;

        if(n < 3) {
            return false;
        }

        int i = 0;

        // climb up
        while(i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        // peak should not be first or last
        if(i == 0 || i == n - 1) {
            return false;
        }

        // climb down
        while(i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == n - 1;
    }
}