/* Problem: LeetCode 35 — Search Insert Position

Given a sorted array of distinct integers nums
and a target value target,

return the index if the target is found.

If not, return the index where it would be inserted
in order.
*/ 

class Solution {

    public int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {

            int mid = start + (end - start) / 2;

            // target found
            if(nums[mid] == target) {
                return mid;
            }

            // search right half
            else if(nums[mid] < target) {
                start = mid + 1;
            }

            // search left half
            else {
                end = mid - 1;
            }
        }

        // insertion position
        return start;
    }
}