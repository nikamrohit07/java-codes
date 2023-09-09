package exception_handling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class multiple_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int x,y,z;
		System.out.println("enter a two numbers");
		try {
			x=sc.nextInt();
			y=sc.nextInt();
			z=x/y;
			System.out.println("div is "+z);
			}
		catch(ArithmeticException e) {
			System.out.println("can not divide by zero!!");
		}catch(InputMismatchException e){
			System.out.println("please enter Integer value");
			
		}
		System.out.println("end");
	}

}
