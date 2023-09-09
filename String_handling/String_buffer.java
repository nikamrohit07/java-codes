package String_handling;

public class String_buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer Sb=new StringBuffer("hello world");
		System.out.println(Sb.length());
		System.out.println(Sb.capacity());
		
		//append
		System.out.println(Sb);
		Sb.append("h");
		System.out.println(Sb);
		
		//delete
		Sb.delete(1,7);
		System.out.println(Sb);
		Sb.reverse();
		System.out.println(Sb);
		
		StringBuffer Sb1=new StringBuffer("I JAVA");
		Sb1.insert(2,"LIKE ");
		System.out.println(Sb1);
		
		//setCharAt
		System.out.println(Sb1);
		Sb1.setCharAt(0,'1');
		System.out.println(Sb1);
		
		String S1="mark";
		String S2="kate";
		String S3;
		if (S1.charAt(S1.length()-1==S2.toLowerCase().charAt(0))){
				S3=S1+S2.substring(1);
		}else {
			S3=S1+S2;
			
		}
		System.out.println(S3);
	}

}
