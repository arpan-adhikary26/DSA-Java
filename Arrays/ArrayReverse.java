// Givem an array 'arr' , we have to reverse the elements of the same array without creating a new array;
// Input: [1,2,3,4,5]
// Output: [5,4,3,2,1]

package Arrays;

public class ArrayReverse{

    public static void reverseArray(int arr[]){
        int start=0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println("Reversed Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        reverseArray(arr);
    }
}