package Course3;

public class StaticVsnoStatic {
	// TODO Auto-generated method stub
	//variabila statica --- nu sunt asociate niciodata cu instanta// java incarca in memorie nume si departament apoi ii atribuie valori - la final va avea ultima valoare atribuita, indiferent daca instanta care il cheama are alte atribuiri
	public static String nume;
	public static String departament = "QA";
	//variabila non statica (variabila de instanta)
	public String prenume = "ion";
	
	public static void main(String[] args) {
	/*	System.out.println(nume);
		StaticVsnoStatic obj = new StaticVsnoStatic();
		System.out.println(obj.prenume);
		*/
		
		StaticVsnoStatic person = new StaticVsnoStatic();
		person.nume = "Mada";
		System.out.println(person.nume);
		System.out.println(person.departament);
		System.out.println("-----------------");
		
		
		StaticVsnoStatic person2 = new StaticVsnoStatic();
		person2.nume = "Mario";
		System.out.println(person2.nume);
		System.out.println(person2.departament);
		System.out.println("-----------------");
		
		StaticVsnoStatic person3 = new StaticVsnoStatic();
		person3.nume = "Trei";
		departament = "DEV";
		System.out.println(person3.nume);
		System.out.println(person3.departament);
		System.out.println("-----------------");
		
		System.out.println(person.nume + person.departament); //variabile statice
		System.out.println(person2.nume + person2.departament); //variabile statice
		System.out.println(person3.nume + person3.departament); //variabile statice
	}

}
