package Course7;

public class Square extends Shape{

	public Square(String nume, String culoare) {
		super(nume, culoare); ///referinta catre obiectul di clasa parinte
		// TODO Auto-generated constructor stub
	}
	
	String nume = "patrat";
	String culoare = "galben";
	
	
	public void printDetails() {
		
		System.out.println("numele este: "+ super.nume + " si culoarea este "+ super.culoare);
	}
	
	
	

}
