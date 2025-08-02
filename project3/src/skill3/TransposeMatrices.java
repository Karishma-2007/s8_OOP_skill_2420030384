package skill3;
import java.util.Scanner;

public class TransposeMatrices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of rows
        System.out.println("Enter the number of rows in the matrix:");
        int rows = sc.nextInt();

        // Input the number of columns
        System.out.println("Enter the number of columns in the matrix:");
        int cols = sc.nextInt();

        // Declare the original matrix
        int[][] matrix = new int[rows][cols];

        // Declare the transpose matrix (with dimensions swapped)
        int[][] transpose = new int[cols][rows];

        // Input matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Transpose logic: swap rows and columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Display the transpose matrix
        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }

        sc.close(); // Close the scanner
    }
}
