package conditional_statement;
import java.util.Scanner;

public class switch_dayname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter day number");
		a=sc.nextInt();
		switch(a) {
		case 1:
			System.out.println("sunday");
		break;
		case 2:
			System.out.println("monday");
		break;
		case 3:
			System.out.println("tuesday");
		break;
		case 4:
			System.out.println("wednesday");
		break;
		case 5:
			System.out.println("thrusday");
		break;
		case 6:
			System.out.println("friday");
		break;
		case 7:
			System.out.println("staturday");
		break;
		default:
			System.out.println("wrong choice");
	}
	}
}
