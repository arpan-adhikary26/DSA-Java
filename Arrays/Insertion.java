package Arrays;
import java.util.*;

class Main {

    public static int insertAtEnd(int arr[], int size, int x) {

        if(size >= arr.length){
            System.out.println("Insertion not possible, Not enough space");
            return size;
        }

        arr[size] = x;
        return size + 1;
    }
    
    public static int insertionAtBeggining(int arr[], int size, int x){
        if(size>=arr.length){
            System.out.println("Array is full!");
            return size;
        }
        //shifting elements
        for(int i=size-1; i>=0; i--){
            arr[i+1]=arr[i];
        }
        arr[0]=x;
        return size+1;
    }
    
    public static int insertionAtPosition(int arr[], int size, int x, int pos){
        
        if(size >= arr.length){
        System.out.println("Array is full!");
        return size;
    }
        if(pos<0 || pos>size){
            System.out.println("Invalid position");
            return size;
        }
        
        for(int i=size-1; i>=pos; i--){
            arr[i+1]=arr[i];
        }
        arr[pos]=x;
        return size+1;
        
    }

    public static void printArray(int arr[], int size) {
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        int size = 4;

        // Input
        System.out.println("Enter initial elements:");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        // Before insertion
        System.out.println("Array before insertion:");
        printArray(arr, size);
        
        //Position
        System.out.println("Enter Position To Insert:");
        int pos = sc.nextInt();

        // Insert
        System.out.println("Enter element to insert:");
        int x = sc.nextInt();

        // size = insertAtEnd(arr, size, x);
        // size = insertionAtBeggining(arr, size, x);
         size = insertionAtPosition(arr,size,x,pos);
        

        // After insertion
        System.out.println("Array after insertion:");
        printArray(arr, size);

        sc.close();
    }
}