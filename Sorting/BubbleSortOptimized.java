package Sorting;

class Main {
    
    public static void bubbleSort(int arr[], int n){
        
        for(int turns=0; turns<n-1; turns++){
            boolean swapped = false;

            for(int j=0; j<n-turns-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    
    public static void printArr(int arr[], int n){
        System.out.print("Sorted Array: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6};
        int n = arr.length;
        bubbleSort(arr, n);
        printArr(arr,n);
    }
}