package Interface;
interface X{
	int A=10;
	static int Y=20;
	final static int Z=30;
	final int W=40;
}
public class variables_in_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(X.A);
		System.out.println(X.Y);
		System.out.println(X.Z);
		System.out.println(X.W);

	}

}
