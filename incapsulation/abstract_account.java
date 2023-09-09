package incapsulation;
 abstract class Account{
		void getCastinfo() {
			System.out.println("Get cast information");

		}
	 void calcutateIntrest() {
			// TODO Auto-generated method stub
			
		}
	abstract void calculateIntrest();
 }
 abstract class saving extends Account{
	 @Override
	 void calcutateIntrest() {
		 System.out.println("calculate intrest of saving");
		 
	 }
 }
 class loan extends saving {
	 @Override
	 void calculateIntrest() {
		 System.out.println("calcutation intrest of loan");
	 }
 }
public class abstract_account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//saving ob1=new saving();
		
		loan ob2=new loan ();
		ob2.getCastinfo();
		ob2.calculateIntrest();
		ob2.getCastinfo();
		ob2.calculateIntrest();

	}

}
