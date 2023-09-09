package incapsulation;
class C{
	void add(int x,int y) {
		System.out.println("C");
		System.out.println(x+y);
	}
	
}
	class D extends C{
		void add( double x,double y) {
			System.out.println("In D");
			System.out.println(x+y);
		} 
		
	}


public class overloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D ob1=new D();
		ob1.add(100,200);
		ob1.add(1.2,2.2);

	}

}
