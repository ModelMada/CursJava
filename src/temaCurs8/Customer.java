package temaCurs8;

public class Customer {
	
	private String name;
	private String address;
	private String mail;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public Customer(String name, String address, String mail) {
		this.name = name;
		this.address = address;
		this.mail = mail;
	}

}
