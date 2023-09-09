package incapsulation;
class t1{
	void read() {
		System.out.println("Read from HDD");
	}
}
class t2 extends t1{
	void read (){
		System.out.println("Read from USB");
	}
}
class t3 extends t2{
	void read() {
		System.out.println("Read from network");
	}
}
   public class Runtime_polymorphisam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		t1 ob1=new t1();
		t2 ob2=new t2();
		t3 ob3=new t3();
		t1 r;
		r=ob1;
		r.read();
		r=ob2;
		r.read();
		r=ob3;
		r.read();

	}

}