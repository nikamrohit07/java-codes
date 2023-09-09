package exception_handling;

import java.util.Scanner;

public class try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		System.out.println("enter a two number");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		try {
			z=x/y;
			System.out.println("div is "+z);
		}catch(ArithmeticException e) {
			System.out.println("can not divide by 2");
		}
		System.out.println("end");
		

	}

}
