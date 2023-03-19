package Basics_java;
import java.util.Scanner;

public class subtraction 
{
public static void main(String[] args) {
	int a,b,c;
    System.out.println("enter two number");
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    c=a-b;
    System.out.println("subtraction of number is "+c);    
}
}
