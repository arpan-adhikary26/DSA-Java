// LeetCode 238 - Product of Array Except Self

// Given an integer array nums,
// return an array answer such that:
//
// answer[i] is equal to the product of all
// the elements of nums except nums[i].

// Division operation is NOT allowed.

// Example:
// Input:  [1,2,3,4]
// Output: [24,12,8,6]

// Approach:
// 1. Store prefix products in the answer array.
// 2. Traverse from right to left while maintaining
//    a suffix product.
// 3. Multiply prefix and suffix products to get
//    the final answer for each index.

// Prefix Product:
// Product of all elements to the left of current index.

// Suffix Product:
// Product of all elements to the right of current index.


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];

        // prefix product
        ans[0] = 1;
        for(int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // suffix product
        int suffix = 1;
        for(int i = n - 1; i >= 0; i--) {
            ans[i] = ans[i] * suffix;
            suffix = suffix * nums[i];
        }

        return ans;
    }
}