// We need to find the largest element in the array
// Step 1: Assume first element is largest
// Step 2: Traverse array from index 1
// Step 3: Compare each element with the current largest
// Step 4: If larger element found -> Update largest
// Step 5: After loop ends, largest contains the maximum value

package Arrays;
import java.util.*;

public class LargestInArray{

    public static void largest_in_array(int arr[], int n) {
        int max = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i]>max){
                max = arr[i]; //largest updated
            }
        }
        System.out.println("Largest Element is: "+ max);
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

        //Calling largest_in_array method
        largest_in_array(arr,n);
        
        sc.close();
    }
}