package conditional_statement;

import java.util.Scanner;

public class ie_lowercase_uppcase {

	public static void main(String[] args) {
		// TODO Auto-generated method sub
		System.out.println("enter any charcter");
		Scanner sc=new Scanner(System.in);
		char A=sc.next().charAt(0);
		if((int)(A)>=65&&(int)(A)<=90) {
			System.out.println("character is upper case");
		}
		else {
			System.out.println("character is lower case ");
		}

	}

}
