// Program: Bubble Sort

// Bubble Sort repeatedly compares adjacent elements
// and swaps them if they are in the wrong order.

// After each pass, the largest unsorted element
// moves to its correct position at the end.

// Steps:
// 1. Traverse array
// 2. Compare adjacent elements
// 3. Swap if left element is greater
// 4. Repeat for all passes

// Time Complexity:
// Worst Case  : O(n^2)
// Best Case   : O(n^2)

// Space Complexity:
// O(1)

package Sorting;

public class BubbleSort{

    public static void bubbleSort(int arr[]){
        int n = arr.length;

        // outer loop for passes
        for(int turn=0; turn<n-1; turn++){
            // Inner loop for comparison
            for(int j=0; j<n-1-turn; j++){
                //Swap of elements are in wrong order
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void printArray(int arr[]) {
        int n = arr.length;
            for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        bubbleSort(arr);
        System.out.println("Sorted Array");
        printArray(arr);
    }
}