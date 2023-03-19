package conditional_statement;
import java.util.Scanner;
public class ei_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ener a number");
		a=sc.nextFloat();
		if(a>0) {
			System.out.println("number is positive");
		}
		else if(a<0) {
			System.out.println("number is negative");
		}
		else {
			System.out.println("number is zero");
		}

	}

}
