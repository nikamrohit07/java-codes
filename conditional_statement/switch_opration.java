package conditional_statement;
import java.util.Scanner;
public class switch_opration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		String choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter +,-,*,/");
		choice=sc.next();
		System.out.println("enter a two number");
	    a=sc.nextInt();
	    b=sc.nextInt();
	    switch(choice) {
	    case "+":
	    	c=a+b;
	    	System.out.println(c);
	    	break;
	    case "-":
	    	c=a-b;
	    	System.out.println(c);
	    	break;
	    case "*":
	    	c=a*b;
	    	System.out.println(c);
	    	break;
	    case "/":
	    	c=a/b;
	    	System.out.println(c);
	    	break;
	   default:
	    	System.out.println("wrong number");
	    
	    	
	    }
	    
	    	


	}

}
