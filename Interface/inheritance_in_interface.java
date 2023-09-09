package Interface;
interface P{
	void add(int x,int y);
	
}
interface B extends P{
	void sub(int x,int y);
}
class Demo implements B{

	@Override
	public void add(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println(x+y);
		
	}

	@Override
	public void sub(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println(x-y);
		
	}
	
	
	
}
public class inheritance_in_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo sc=new Demo();
		sc.add(100,20);
		sc.sub(20,10);

	}

}
