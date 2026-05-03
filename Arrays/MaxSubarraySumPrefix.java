// Problem: Maximum sub array sum using prefix sum approach.

package Arrays;
import java.util.*;

public class MaxSubarraySumPrefix{
    public static void maxSubArrayPrefixSum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int prefixSum[] = new int[arr.length];
        prefixSum[0]=arr[0];

        //Build prefix array
        for(int i=1; i<prefixSum.length; i++){
            prefixSum[i]=prefixSum[i-1]+arr[i];
        }
        
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                currSum = i==0 ? prefixSum[j] : prefixSum[j] - prefixSum[i-1];
                if(currSum>maxSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Maximum Sub Array Sum Is: " + maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        maxSubArrayPrefixSum(arr);
    }
}