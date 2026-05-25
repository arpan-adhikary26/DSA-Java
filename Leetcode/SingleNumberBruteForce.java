// LeetCode 136 - Single Number

// Given a non-empty array of integers nums,
// every element appears twice except for one.
// Find that single element.

// Example:
// Input  : [4,1,2,1,2]
// Output : 4

// Logic (Brute Force):
// 1. Pick one element
// 2. Count how many times it appears in array
// 3. If frequency becomes 1,
//    return that element

// Time Complexity:
// O(n²)

// Space Complexity:
// O(1)

class Solution {
    public int singleNumber(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int count=0;
            for(int j=0; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1){
                return nums[i];
            }
        }
        return -1;
    }
}