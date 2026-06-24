// LeetCode 747 - Largest Number At Least Twice of Others
//
// Given an integer array nums,
// return the index of the largest number
// if it is at least twice as large as every
// other number in the array.
//
// Otherwise return -1.
//
// Approach:
// 1. Find the largest number and its index.
// 2. Simultaneously track the second largest number.
// 3. After traversal, check:
//
//    largest >= 2 * secondLargest
//
// 4. If true, return the index of largest.
// 5. Otherwise return -1.
//
// Example:
// Input: [3,6,1,0]
// Output: 1
//
// largest = 6
// secondLargest = 3
//
// 6 >= 2 * 3
// 6 >= 6
//
// Return 1
//
// Time Complexity: O(n)
// Space Complexity: O(1)
//

class Solution {
    public int dominantIndex(int[] nums) {

        int largest = -1;
        int secondLargest = -1;
        int largestIndex = -1;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
                largestIndex = i;
            }
            else if(nums[i] > secondLargest) {
                secondLargest = nums[i];
            }
        }

        if(largest >= 2 * secondLargest) {
            return largestIndex;
        }

        return -1;
    }
}