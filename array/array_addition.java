package array;
import java.util.Scanner;
public class array_addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr=new int[5];
		int i,sum=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter an array item");
		for(i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<5;i++) {
			sum=sum+arr[i];
		}
		System.out.println("addition of array "+sum);
		

	}

}
