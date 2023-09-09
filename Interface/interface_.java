package Interface;
interface A{
	void add(int x, int y);
	void sub (int x,int y);
	
}

class demo implements A {
	@Override
	public void add(int x, int y) {
		System.out.println(x+y);
	}


	@Override
	public void sub(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println(x-y);
		
	}
}
public class interface_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo sc =new demo();
		sc.add(100,20);
		sc.sub(20, 10);
		sc.sub(90,10);
		

	}

}
