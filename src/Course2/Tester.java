package Course2;
//UpperCamelCase - ClasaTest
//lowerCamelCase - numeleMetodeiMele

//numele_metodei+mele --snake_case pt python
public class Tester {
	//variabile de instanta
	private String nume;
	public int ratePerHour;
	//constructor - nu are return type, are numele clasei identic
	//constructor default - stie Java sa il puna
	public Tester() {
	}
	//constructor cu parametri
	public Tester(String nume, int ratePerHour) {
		setNume(nume);
		this.ratePerHour=ratePerHour;	
	}
	
	
	//metode
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}

}
