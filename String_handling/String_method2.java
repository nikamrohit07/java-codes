
package String_handling;

public class String_method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1 ="HELLO WORLD";
		//SubString
		String s2=S1.substring(0,3);
		System.out.println(s2);
		
		//concat
		String S3="hello ";
		String S4="world";
		String S5=S3+S4;
		System.out.println(S5);
		
		//replace
		String S6="hello world";
		String S7=S6.replace('h','H');
		System.out.println(S7);
		
		//trim
		String S8="hello";
		String S9=" hello ";
		if (S8==S9.trim()) {
			System.out.println("equals");
			
		}else {
			System.out.println("not equals");
		}
		//split
		String S10="this is demo String";
		String []arr=S10.split(" ");
		for (String n:arr) {
			System.out.println(n);
		}
	

	}

}
