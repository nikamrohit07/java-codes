package _class;
class Account
{
	int id;
	String name;
	float balance;
   void createAccount(int a,String s,float c)
{
	   id=a;
	   name=s;
	   balance=c;
}
   void deposite(int amt)
           {
	       balance+=amt;
           }
   void withdraw(int amt)
   {
   balance-=amt;
   }
   void print()
   {
	   System.out.println(id);
	   System.out.println(name);
	   System.out.println(balance);
   }
   }
public class class_object_account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account t1=new Account();
		t1.createAccount(1,"abc",2000);
		
		Account t2=new Account();
		t2.createAccount(2,"abc",1000);
		t1.print();
		t2.print();

	}

}
