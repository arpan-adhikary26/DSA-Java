// Program: Selection Sort

// Selection Sort repeatedly finds the minimum element
// from the unsorted part of the array
// and places it at the correct position.

// Example:
// Input  : [5, 4, 1, 3, 2]
// Output : [1, 2, 3, 4, 5]

// Steps:
// 1. Start from index 0
// 2. Find minimum element in remaining unsorted array
// 3. Swap minimum element with current index
// 4. Repeat for all positions

package Sorting;

public class SelectionSort {

    public static void selectionSort(int arr[]) {

        int n = arr.length;

        // outer loop for passes
        for(int i = 0; i < n - 1; i++) {

            int minPos = i;

            // finding minimum element
            for(int j = i + 1; j < n; j++) {

                if(arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }

            // swapping minimum element
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int arr[]) {

        System.out.print("Sorted Array: ");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {5,4,1,3,2};

        selectionSort(arr);

        printArray(arr);
    }
}