package conditional_statement;
import java.util.Scanner;
public class ei_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      float m1,m2,m3,m4,m5,p;
      Scanner sc =new Scanner(System.in);
      System.out.println("enter marks of 5 subjects");
      m1=sc.nextFloat();
      m2=sc.nextFloat();
      m3=sc.nextFloat();
      m4=sc.nextFloat();
      m5=sc.nextFloat();
      p=(m1+m2+m3+m4+m5)/5;
      if(p>=90) {
    	  System.out.println("Grade A");
      }
      else if(p>=80){
    	  System.out.println("Grade B");
      }
      else if(p>=70) {
    	  System.out.println("Grade C");
      }
      else if (p>=60) {
    	  System.out.println("Grade D");
    	  
      }
      else if (p>=50) {
    	  System.out.println("Grade E ");
      }
      else {
    	  System.out.println("Grade F");
      }
	}

}
