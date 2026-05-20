// Problem - Remove Dublicates - Leetcode 26

class Solution {

    public int removeDuplicates(int[] nums) {

        if(nums.length == 0) {
            return 0;
        }

        int j = 1;

        for(int i = 1; i < nums.length; i++) {

            // unique element found
            if(nums[i] != nums[i - 1]) {

                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}