// Program: Insertion Sort

// Insertion Sort builds the sorted array one element at a time.

// Logic:
// 1. Assume first element is sorted
// 2. Pick current element
// 3. Shift larger elements to the right
// 4. Insert current element at correct position

// Example:
// Input  : [5,4,1,3,2]
// Output : [1,2,3,4,5]

// Time Complexity:
// Best Case    : O(n)
// Average Case : O(n²)
// Worst Case   : O(n²)

// Space Complexity:
// O(1)

package Sorting;

public class InsertionSort {

    // Function for Insertion Sort
    public static void insertionSort(int arr[]) {

        for(int i = 1; i < arr.length; i++) {

            int curr = arr[i];   // Current element
            int prev = i - 1;

            // Finding correct position for current element
            while(prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // Insertion
            arr[prev + 1] = curr;
        }
    }

    // Function to print array
    public static void printArr(int arr[]) {

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = {5, 4, 1, 3, 2};

        insertionSort(arr);

        System.out.print("Sorted Array: ");
        printArr(arr);
    }
}