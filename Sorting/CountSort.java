// Counting Sort is a non-comparison sorting algorithm used for sorting integers within a limited range.
/* Working Steps:
   1. Find largest element
   2. Create count array
   3. Store frequency of elements
   4. Traverse count array
   5. Rebuild sorted array
*/

package Sorting;

import java.util.*;

public class CountSort{

    public static void countingSort(int arr[]){

        // Finding Largest Element
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                largest = Math.max(largest,arr[i]);
            }
        }
        // Creating count array
        int count[] = new int[largest+1];

        // Store frequencies
        for(int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Sorting
        int j = 0;

        for(int i = 0; i < count.length; i++) {

            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int arr[]){
        System.out.print("Sorted Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        countingSort(arr);
        printArr(arr);
    }
}