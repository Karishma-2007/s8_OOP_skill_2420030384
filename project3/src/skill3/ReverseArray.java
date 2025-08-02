package skill3;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of your array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of your array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The reversed array is:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " "); // Print on the same line
        }

         sc.close();
    }
}

	