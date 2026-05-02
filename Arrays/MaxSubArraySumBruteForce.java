// Problem: Find the maximum sum of any contiguous subarray in the given array.
// Example:
// Input  : [1, -2, 6, -1, 3]
// Output : 8  (subarray: [6, -1, 3])

package Arrays;
import java.util.*;

public class MaxSubArraySumBruteForce{

    public static void MaxSubArraySum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                curSum=0;
                for(int k=i; k<=j; k++){
                    curSum+=arr[k];
                    if(curSum>maxSum){
                        maxSum=curSum;
                    }
                }
            }
        }
        System.out.print("Maximum Sub Array Sum Is: " + maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        MaxSubArraySum(arr);
    }
}