// Program: Print all unique pairs in array
// This program prints all possible unique pairs (i, j) from a given array such that i < j (no repetition, no self-pairing).
// Example: Input  : [2, 4, 6, 8, 10]
/* Output: (2,4) (2,6) (2,8)
           (4,6) (4,8) (4,10)
           (6,8) (6,10)
           (8,10)
 
*/
package Arrays;

public class UniquePairs{

    public static void pairs(int arr[]) {
        for(int i=0; i<arr.length; i++){
            int current=i;
            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+ arr[current] + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        pairs(arr);
    }
}
