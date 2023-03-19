package conditional_statement;
import java.util.Scanner;
public class switch_compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a number");
		x=sc.nextInt();
		switch(x%2) {
		case 0:
		System.out.println("number is even");
		break;
		case 1:
			System.out.println("number is odd");
			break;
		
		
		}
		

	}

}
