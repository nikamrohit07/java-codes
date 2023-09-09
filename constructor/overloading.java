package constructor;
class test3{
int i,j;
test3(int x,int y){
	i=x;
	j=y;
	System.out.println("constructor with argument called");
}
test3(){
	i=10;
	j=20;
	System.out.println("constructor without argument called");
}
void add() {
	System.out.println(i+j);
}
public class overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  test3 t1=new test3(30,40);
	        t1.add();

	}

}
}
