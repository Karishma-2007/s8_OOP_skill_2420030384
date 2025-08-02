package skill3;
import java.util.Scanner;
public class SumAndAvg {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     System.out.println("enter the size of your array:");
     int n=sc.nextInt();
     int[] arr=new int[n];
     System.out.println("enter the elements of your array:");
     for(int i=0;i<n;i++) {
    	 arr[i]=sc.nextInt();
     }
     int sum=0;
     int avg=0;
     for(int i=0;i<n;i++) {
    	 sum+=arr[i];
     }
     avg=sum/n;

     System.out.println("the sum of the array is = "+ sum);
     System.out.println("the average of the array is = "+ avg);
	}

}
