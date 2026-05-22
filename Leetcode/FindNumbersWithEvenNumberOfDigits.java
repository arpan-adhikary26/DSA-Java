// LeetCode 1295 - Find Numbers with Even Number of Digits

// Given an array nums of integers,
// return how many of them contain an even number of digits.

// Example:
// Input  : [12,345,2,6,7896]
// Output : 2

class Solution {

    public int findNumbers(int[] nums) {

        int count = 0;

        // traverse array
        for(int i = 0; i < nums.length; i++) {

            int digits = 0;
            int num = nums[i];

            // count digits
            while(num > 0) {
                digits++;
                num /= 10;
            }

            // check even number of digits
            if(digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}