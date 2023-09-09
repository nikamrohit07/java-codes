package incapsulation;
class A{
	int i;
	A(){
		i=10;
		System.out.println("Constructor without Argument");
	}
	A(int X){
		System.out.println("Constructor with argumengt");
	}
}
class B extends A{
	B(){
		super(100);
		i=20;
		System.out.println("In B");
	}
	void add() {
		System.out.println(i+super.i);
	}
}


public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B ob= new B();
		ob.add();
	}

}
