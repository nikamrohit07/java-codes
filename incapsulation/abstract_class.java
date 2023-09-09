package incapsulation;
import java.io.*;
abstract class a1{
	void show() {
		System.out.println("In A");
	}
	abstract void add(int x,int y);
	
}
 class a2 extends a1{
	 @Override
	 void add (int x,int y) {
		 System.out.println(x+y);
	 }
 }
public class abstract_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a2 ob=new a2();
		ob.show();
		ob.add(100,200);

	}

}
