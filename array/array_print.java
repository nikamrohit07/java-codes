package array;
import java.util.Scanner;
public class array_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc=new Scanner(System.in);
		int[]arr=new int[5];
		System.out.println("enter an array");
		for(i=0;i<5;i++) {
		arr[i]=sc.nextInt();
		}
		System.out.println("your array ");
		for(i=0;i<5;i++) {
			System.out.println(arr[i]);
		
		
		}

	}

}
