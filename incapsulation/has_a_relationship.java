package incapsulation;
class Address{
	private String flatnum;
	private String city;
	private String street;
	public String getflatnum() {
		return flatnum;
	}public void setflatnum(String flatnum) {
	this.flatnum =flatnum;
	
	}
	public String getFlatnum() {
		return flatnum;
	}
	public void setFlatnum(String flatnum) {
		this.flatnum = flatnum;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
}


public class has_a_relationship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address ad=new Address();
		ad.setFlatnum("1");
		ad.setStreet("abc");
		ad.setCity("Aurangabad");
		System.out.println(ad.getFlatnum());
		System.out.println(ad.getStreet());
		System.out.println(ad.getCity());

	}

}
