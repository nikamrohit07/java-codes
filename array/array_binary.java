package array;
import java.util.Scanner;
public class array_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[]arr=new int[5];
		int i=0,n;
		System.out.println("enter number");
		n=sc.nextInt();
        while(n>0)
        {
        	arr[i]=n%2;
        	n=n/2;
        	i++;
        			
        }
        System.out.println(i);
        while(i>=0)
        {
        	System.out.println(arr[i]);
        	i=i-1;
        }

	}

}
