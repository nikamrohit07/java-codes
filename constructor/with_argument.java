package constructor;
class test1{
	int i,j;
	test1(int x,int y){
		i=x;
		j=y;
		System.out.println("constructor called");
	}
	void add() {
		System.out.println(i+j);
	}
}
public class with_argument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        test1 t1=new test1(30,40);
        t1.add();
	}

}
