package Loop_problems;
import java.util.Scanner;
public class while_natural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//natural no addition
		System.out.println("Enter the number you want:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int i=1;
		int sum=0;
		
		while(i<=a) {
			sum=sum+i;
			i=i+1;
		}
		System.out.println("addition is "+sum);
	}

}
