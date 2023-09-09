package _class;
class employee{
	int id;
	String name;
	float salary;
	void insert(int a,String n,float s) {
		id=a;
		name=n;
		salary=s;
	}
	 void print()
	   {
		   System.out.println(id);
		   System.out.println(name);
		   System.out.println(salary);
	   }
	
}
public class employee_details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       employee s1=new employee();
       s1.insert(1,"rohit",20000);
       s1.print();
	}

}
