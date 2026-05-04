// Program: Maximum Subarray Sum using Kadane’s Algorithm

// Problem:
// Find the maximum sum of a contiguous subarray in the given array.

// Example:
// Input  : [-2, -3, 4, -1, -2, 1, 5, -3]
// Output : 7  (subarray: [4, -1, -2, 1, 5])

package Arrays;

import java.util.*;
public class MaxSubarraySumKadane{
    
    public static void kadane(int arr[]){
        int max = Integer.MIN_VALUE;
        int curr =0;
        
        for(int i=0; i<arr.length; i++){
            curr+= arr[i];
            
            max = Math.max(max, curr);
            
            if(curr<0){
                curr=0;
            }
            
        }
        System.out.println("Maximum Sum : "+ max);
    }
    
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        kadane(arr);
    }
}