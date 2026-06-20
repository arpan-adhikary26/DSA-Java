// Deletion At Beginning 

class Main {
    
    public static int deleteFromBeginning(int arr[], int size){
        
        System.out.println("Array before deletion:");
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        if(size==0){
            System.out.println("Empty Array");
        }
        
        for(int i=0; i<size-1; i++){
            arr[i] = arr[i+1];
        }
        return size-1;
    }
    
    public static void PrintArray(int arr[], int size){
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
       int arr[] = {12,21,36,24,42};
       int size = 5;
       
       size = deleteFromBeginning(arr,size);
       PrintArray(arr,size);
    }
}

// Deletion At Position

class Main {
    
    public static int deleteFromPosition(int arr[], int size, int pos){
        
        System.out.println("Array before deletion:");
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        if(size==0){
            System.out.println("Empty Array");
        }
        
        if(pos<0 || pos>=size){
            System.out.println("Invalid Position");
        }
        
        for(int i=pos; i<size-1; i++){
            arr[i] = arr[i+1];
        }
        return size-1;
    }
    
    public static void PrintArray(int arr[], int size){
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
       int arr[] = {12,21,36,24,42};
       int size = 5;
       int pos = 2;
       
       size = deleteFromPosition(arr,size,pos);
       PrintArray(arr,size);
    }
}

// Deletion At End

class Main {
    
    public static int deleteAtEnd(int arr[], int size){
        
        System.out.println("Array before deletion:");
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        if(size==0){
            System.out.println("Empty Array");
        }
        
        return size-1;
    }
    
    public static void PrintArray(int arr[], int size){
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
       int arr[] = {12,21,36,24,42};
       int size = 5;
       
       size = deleteAtEnd(arr,size);
       PrintArray(arr,size);
    }
}