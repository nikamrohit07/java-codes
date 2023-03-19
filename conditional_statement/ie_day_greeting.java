package conditional_statement;

import java.util.Scanner;

public class ie_day_greeting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float time;
		System.out.println("enter time");
		time = sc.nextFloat();
		
		if (time < 0.0 && time < 12.00) {
			System.out.println("Good morning");
		} else if (time == 12.00) {
			System.out.println("12 noon");
		} else if (time > 12.00 && time < 16.00) {
			System.out.println("good afternoon");
		} else if (time > 16.00 && time <= 24.00) {
			System.out.println("Good evening");
		}

	}

}

