
public class Person {

	String name;
	Address address;
	
	public Person(String str,Address addr)
	{
		//name = "xyz";
		//address = new Address("pune", "411040");
		this.name = str;
		this.address = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
