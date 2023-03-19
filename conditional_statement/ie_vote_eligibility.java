package conditional_statement;
import java.util.Scanner;
public class ie_vote_eligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int age;
        age=sc.nextInt();
        System.out.println("enter your age");
        if(age>=18) {
        	System.out.println("you are eligible to vote");
        }
        else {
        	System.out.println("you are not eligible to vote");
        }
        
	}

}
