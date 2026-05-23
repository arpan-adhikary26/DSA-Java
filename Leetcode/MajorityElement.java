// LeetCode 169 - Majority Element

// Given an array nums of size n,
// return the majority element.

// The majority element is the element
// that appears more than n/2 times.

// Example:
// Input  : [2,2,1,1,1,2,2]
// Output : 2

// Logic (Brute Force):
// 1. Pick one element
// 2. Count its frequency in array
// 3. If frequency > n/2, return that element

// Time Complexity:
// O(n²)

// Space Complexity:
// O(1)

class Solution {

    public int majorityElement(int[] nums) {

        int n = nums.length;

        // checking frequency of every element
        for(int i = 0; i < n; i++) {

            int count = 0;

            for(int j = 0; j < n; j++) {

                // frequency count
                if(nums[i] == nums[j]) {
                    count++;
                }
            }

            // majority element found
            if(count > n / 2) {
                return nums[i];
            }
        }

        return -1;
    }
}