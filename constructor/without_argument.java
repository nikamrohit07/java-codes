package constructor;
class test2{
	int i,j;
	test2(){
		i=10;
		j=20;
		System.out.println("constructor called");
	}
	void add() {
		System.out.println(i+j);
	}
}
public class without_argument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 test2 t1=new test2();
	        t1.add();
	}

}
