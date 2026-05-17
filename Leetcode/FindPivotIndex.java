// Problem: Find Pivot Index - Leetcode 724

class Solution {

    public int pivotIndex(int[] nums) {

        int totalSum = 0;
        int leftSum = 0;

        // calculating total sum
        for(int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }

        // checking pivot index
        for(int i = 0; i < nums.length; i++) {

            int rightSum = totalSum - leftSum - nums[i];

            // pivot condition
            if(leftSum == rightSum) {
                return i;
            }

            // update left sum
            leftSum += nums[i];
        }

        // no pivot index found
        return -1;
    }
}