// LeetCode 643 - Maximum Average Subarray I
//
// Find the contiguous subarray of length k
// that has the maximum average value.
//
// Approach:
// 1. Calculate the sum of the first k elements.
// 2. Store it as the current maximum sum.
// 3. Use Sliding Window:
//    - Remove the leftmost element.
//    - Add the next element.
// 4. Update maximum sum if needed.
// 5. Return maxSum / k.
//
// Example:
// nums = [1,12,-5,-6,50,3]
// k = 4
//
// Window 1: [1,12,-5,-6] = 2
// Window 2: [12,-5,-6,50] = 51
// Window 3: [-5,-6,50,3] = 42
//
// Maximum Sum = 51
// Average = 51 / 4 = 12.75
//
// Time Complexity: O(n)
// Space Complexity: O(1)


public class MaximumAverageSubarrayI {

    public static double findMaxAverage(int[] nums, int k) {

        int windowSum = 0;

        for(int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        for(int i = k; i < nums.length; i++) {

            windowSum = windowSum - nums[i - k] + nums[i];

            maxSum = Math.max(maxSum, windowSum);
        }

        return (double) maxSum / k;
    }

    public static void main(String[] args) {

        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;

        System.out.println(findMaxAverage(nums, k));
    }
}