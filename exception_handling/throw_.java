package exception_handling;
import java.util.Scanner;
public class throw_ 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter a numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		try {
			if(b==0) {
				ArithmeticException ex;
				ex=new ArithmeticException();
			throw ex;
				
			
			}}catch(ArithmeticException e)
		{
			System.out.println("can not divide by zero!!");
		}

}
	}
