package String_handling;

public class Strings_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// length 
		String S1="HELLO WORLD";
		int x=S1.length();
		System.out.println(x);
		
		int H=0;
		//charAt
		char ch = S1.charAt(H);
		System.out.println(ch);
		
		//to charAT
		char arr[]=S1.toCharArray();
		for (int i=0;i<S1.length();i++);
		{
			
		}for (char c:arr) {
			System.out.println(c);
		}
		//get bytes
		byte [] arr1=S1.getBytes();
		for(byte b:arr1) {
			System.out.println(b);
		}
		//indexof    
		
		int y=S1.indexOf('1');
		System.out.println(y);
		
		y=-1;
		while (true) {
			y=S1.indexOf('1',y+1);
			System.out.println(y);
			if (x==-1) {
				break;
				
			}
		}
		//lastindex of
		x=S1.lastIndexOf('1');
		System.out.println(x);
		String = new String("hello");
		String S2=new String ("hello");
		if (S1==S2) {
			System.out.println("equals");
		}
		else
		{
			System.out.println("not equals");
		}
		
		
	}

}
