package String_handling;

public class String_funtions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1="ABCD";
		//create string object by char arr
         System.out.println(S1);
         char arr []= {'A','B','C','D'};
         String S2= new String (arr);
         System.out.println(S2);
         //create String by bytes
         byte  arr1 []= {97,98,99,100};
         String S3= new String (arr1);
         System.out.println(S3);
         
	}

}
