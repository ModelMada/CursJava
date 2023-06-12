package Curs9;

public interface Angajat {

	void setName(String name);
	public String getName();
	
	public void setEmail(String email);
	public String getEmail();
	
	public void setDepartment(String departament);
	public String getDepartament();
	
	
	// public void testCeva();
	
	default void printDepartament() {
		System.out.println("QA");
	}
	
}
