package incapsulation;

class test2 {

	void add(int x, int y) {
		System.out.println("Int called");
		System.out.println(x + y);
	}

	void add(float x, float y) {
		System.out.println("float called");
		System.out.println(x + y);
	}

	void add(String x, String y) {
		System.out.println("String called");
		System.out.println(x + y);

	}
}

public class overloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method
		test2 r1 = new test2();
		//test2 r2 = new test2();

		r1.add(1.2f, 2.3f);
		r1.add("abc", "xyz");
	}

}
