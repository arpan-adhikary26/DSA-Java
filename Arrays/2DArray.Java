import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matrix[][] = new int[3][3]; //Array Declartion 

        System.out.println("Enter elements to enter");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j]=sc.nextInt();  //Initialization
            }
        }
        System.out.println("Resultant matrix:");

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " "); //Traversing
            }
        System.out.println();
        }
    }
}