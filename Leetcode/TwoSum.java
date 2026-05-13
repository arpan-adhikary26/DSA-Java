// Given an array of integers nums and an integer target,
// return indices of the two numbers such that they add up to target.

// Example:
/*
Input: nums = [2,7,11,15], target = 9
Output: [0,1]

Explanation:
Because nums[0] + nums[1] == 9,
we return [0,1].
*/

package Leetcode;

public class TwoSum {

    // Function to find indices whose sum equals target
    public static int[] twoSum(int[] nums, int target){

        // checking every pair
        for(int i = 0; i < nums.length; i++){

            for(int j = i + 1; j < nums.length; j++){

                // if pair sum equals target
                if(nums[i] + nums[j] == target){

                    // return indices
                    return new int[]{i, j};
                }
            }
        }

        // return empty array if no solution found
        return new int[]{};
    }

    public static void main(String[] args) {

        int nums[] = {2,7,11,15};
        int target = 9;

        int result[] = twoSum(nums, target);

        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}