package conditional_statement;

import java.util.Scanner;

public class ie_max_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc=new Scanner(System.in);
        int a,b;
      a=sc.nextInt();
      b=sc.nextInt();
      System.out.println("enter two numbers");
        if(a>b) {
        	System.out.println("max number is a");
        }
        else {
        	System.out.println("max number is b");
        }


	}

}
