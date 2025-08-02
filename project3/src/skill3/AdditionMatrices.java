package skill3;
import java.util.Scanner;
public class AdditionMatrices {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your row:");
		int rows = sc.nextInt();
		System.out.println("Enter your columns:");
        int cols=sc.nextInt();
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sumMatrix = new int[rows][cols];
        
		System.out.println("Enter the values of the matrix 1 :");
        for(int i=0;i<rows;i++) {
        	for(int j=0;j<cols;j++) {
        		matrix1[i][j]=sc.nextInt();
        	}
        }
        System.out.println("Enter the values of the matrix 2 :");
        for(int i=0;i<rows;i++) {
        	for(int j=0;j<cols;j++) {
        		matrix2[i][j]=sc.nextInt();
        	}
        }
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				sumMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
				
			}
		}
		System.out.println("Resultant Matrix after Addition:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.println(sumMatrix[i][j] +" ");
			}
		}

	}

}
