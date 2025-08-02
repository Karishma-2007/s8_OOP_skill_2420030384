package skill3;
import java.util.Scanner;
public class BigAndSmallArray {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		 System.out.println("enter the size of your array:");
		 int n=sc.nextInt();
		 int[] arr=new int[n];
		 System.out.println("enter the elements of your array:");
		 for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		 }
		 int min =arr[0];
		 int max =arr[0];
		 for(int i=1;i<n;i++) {
			 if(arr[i]<min) {
				 min=arr[i];
			 }
			 if(arr[i]>max) {
				 max=arr[i];
			 }
		 }
		 System.out.println("the minimum element of array is :"+ min);
		 System.out.println("the maximum element of array is :"+ max);
sc.close();
	}
}
