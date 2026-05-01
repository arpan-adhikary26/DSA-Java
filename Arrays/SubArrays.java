// Program: Print all sub arrays for a given array.
// A subarray is a continuous part of array

package Arrays;

public class SubArrays{

    public static void printSubArray(int arr[]){
        int counter=0;

        for(int i=0; i<arr.length; i++){

            for(int j=i; j<arr.length; j++){

                for(int k=i; k<=j; k++){
                     
                    System.out.print(arr[k] + " ");
            }   counter++;
                System.out.println();
                
            }
            
        }
        System.out.println("Total SubArray: " + counter);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        printSubArray(arr);
    }
}