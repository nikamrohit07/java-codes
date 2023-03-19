package conditional_statement;

import java.util.Scanner;

public class ie_even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        int n;
	        System.out.println("enter a number");
	        n=sc.nextInt();
	        
	        if(n%2==0) {
	        	System.out.println("number is even number");
	        }
	        else {
	        	System.out.println("number is odd number");
	        }


	}

}
