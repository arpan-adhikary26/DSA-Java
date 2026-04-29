// Binary Search is a searching algorithm used on Sorted Arrays.
// It works by dividing the array into halves.

// Step 1: Find mid
// Step 2: Set Start =0, End = arr.length-1
// Step 3: If mid == key , return index
// Step 4: If mid<key , start= mid+1, check right half
// Step 5: If mid>key , end= mid-1, check left half

package Arrays;

import java.util.*;

public class BinarySearch{

    public static int binarySearch(int arr[], int n, int key){
        int start=0, end =n-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(key>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Enter Array Size
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        //Declaring Array
        int arr[] = new int[n];

        //Entering elements of Array
        System.out.println("Enter elements of Array");
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
        }

        //Enter Key To Search
        System.out.println("Enter Key:");
        int key = sc.nextInt();

        int index = binarySearch(arr, n, key);

        if(index!=0){
            System.out.println("Element found at index: "+ index);
        }else{
            System.out.println("Element not found");
        }

        sc.close();
    }
}