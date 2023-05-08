package Course1;

public class FirstClass {
	//public este access modifier || strig este data dtype || nume e variabila
	public String name="Oana";				// creeaza o locatie de memorie de tip string, accepta doar text//variabila de instanta - pot fi accesate doar prin obiectul clasei
	public int age;
	public static void main(String[] args) {
		FirstClass obj = new FirstClass();
		System.out.println(obj.name);
		String prenume = "Ion"; //variabila locala
		// TODO Auto-generated method stub
		System.out.println("Mada autom");
		System.out.println(prenume);
	}

}
