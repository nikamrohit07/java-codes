package conditional_statement;
import java.util.Scanner;
public class ei_max_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int a,b,c,max;
     System.out.println("enter 3 number");
     a=sc.nextInt();
     b=sc.nextInt();
     c=sc.nextInt();
     if(a>b && a>c) {
    	 System.out.println("a is maximum");
     }
     else if(b>a && b>c) {
    	 System.out.println("b is maximum");
     }
     else {
    	 System.out.println("c is maximum");
     }
	}

}
