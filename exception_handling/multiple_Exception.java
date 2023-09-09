package exception_handling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class multiple_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System .in);
		System.out.println("enter a numbers");
		int x,y,z;
		try {
			x=sc.nextInt();
			y=sc.nextInt();
			z=x/y;
		}catch (ArithmeticException|InputMismatchException e) {
			if (e instanceof ArithmeticException) {
				System.out.println("can not divide by zero!!");
			}else if (e instanceof InputMismatchException) {
				System.out.println("ente integer value");
			}
		}System.out.println("end");

	}

}
