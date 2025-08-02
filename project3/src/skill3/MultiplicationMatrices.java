package skill3;
import java.util.Scanner;

public class MultiplicationMatrices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the number of rows for Matrix A:");
        int rowsA = sc.nextInt();

        System.out.println("Enter the number of columns for Matrix A:");
        int colsA = sc.nextInt();

        
        System.out.println("Enter the number of rows for Matrix B:");
        int rowsB = sc.nextInt();

        System.out.println("Enter the number of columns for Matrix B:");
        int colsB = sc.nextInt();

        
        if (colsA != rowsB) {
            System.out.println("Matrix multiplication is not possible!");
            System.out.println("Number of columns of Matrix A must equal number of rows of Matrix B.");
            return;
        }

        
        int[][] matrixA = new int[rowsA][colsA];
        int[][] matrixB = new int[rowsB][colsB];
        int[][] result = new int[rowsA][colsB];

        
        System.out.println("Enter the elements of Matrix A:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }

        
        System.out.println("Enter the elements of Matrix B:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                result[i][j] = 0; 
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        
        System.out.println("Resultant Matrix after Multiplication:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println(); 
        }

        sc.close(); 
    }
}
