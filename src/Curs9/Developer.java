package Curs9;

public class Developer implements Angajat{
	
	String name;
	String email;
	String departament;

	@Override
	public void setName(String name) {
		this.name=name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public void setDepartment(String departament) {
		// TODO Auto-generated method stub
		this.departament=departament;
	}

	@Override
	public String getDepartament() {
		// TODO Auto-generated method stub
		return departament;
	}

}
