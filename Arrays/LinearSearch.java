package Arrays;

import java.util.*;

public class LinearSearch{

    //method to perform linear search
    public static int linearSearch(int arr[], int key){
    for(int i=0; i<arr.length; i++){
        if(arr[i]==key){
            return i; //element found
        }
    }
    return -1; //element not found
}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Taking array size
        System.out.println("Enter Array Size");
        int n = sc.nextInt();

        int arr[] = new int[n];

        //Taking array input
        System.out.println("Enter elements:");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        //Taking key input
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        //Calling linear search method
        int index = linearSearch(arr, key);

        //Result

        if(index != -1){
            System.out.println("Element found at index: " + index);
        }else{
            System.out.println("Element not found.");
        }
        sc.close();
    }   
}