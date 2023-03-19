package conditional_statement;
import java.util.Scanner;

public class ei_armstrong_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b ,c,d,e,m;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 3 digit number");
		a=sc.nextInt();
		b=a/100;
		c=a%100;
		d=c/10;
		e=c%10;
		m=b*b*b+d*d*d+e*e*e;
	if (m==a) {
		System.out.println("it is armstorng number");
	}
	else {
		System.out.println("it is not armstrong number");
	}
	}

}
