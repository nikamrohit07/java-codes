package conditional_statement;
import java.util.Scanner;
public class swich_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1,2 or3");
		x=sc.nextInt();
		switch(x) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
			
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("wrong number");
		}
				

	}

}
