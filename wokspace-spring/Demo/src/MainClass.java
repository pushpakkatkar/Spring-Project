
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address addr = new Address("Pune", "411045");
		Person obj = new Person("Priya", addr);
		System.out.println("name = "+obj.getName());
		System.out.println("City = "+obj.getAddress().getCity());
		System.out.println("pinCode = "+obj.getAddress().getPinCode());
	}
}
