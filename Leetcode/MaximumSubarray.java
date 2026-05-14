// Leetcode-53

class Solution {
    public int maxSubArray(int[] nums) {
        int n= nums.length;
        int currSum = 0;
        int Maxsum = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            currSum += nums[i];
            Maxsum = Math.max(Maxsum, currSum);
            if(currSum<0){
                currSum=0;
            }
        }
        return Maxsum;
    }
}