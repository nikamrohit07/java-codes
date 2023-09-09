package incapsulation;
 class M{
	 void show() {
		 System.out.println("In M");
		 
	 }
 }class N extends M{
	 void show() {
		 System.out.println("In N");
		 
	 }
 }
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N ob =new N();
		ob.show();

	}

}
