package Course11;

public class GenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printDetails("masina");
		printDetails(100);
		printDetails('c');
		printDetails(true);

	}
	
	//in interiorul metodei trebuie sa permit toate tipurile de data types, nu pot da o funtionalitate specifica unui data type in interiorul metodei daca am datatype generic
	public static <B> void printDetails(B obj) {						//referinta catre parametrul Generic Example, parametru generic
		//foloseste doua data types diferite ; inlocuieste ambele metode de mai jos, folosim data type generic ca si parametru
		System.out.println("Obiect : "+ obj);
		System.out.println("Data type: "+ obj.getClass().getName());
		
	}
/*	
	public static void printDetails(String text) {
		
		System.out.println("Obiect : "+ text);
		System.out.println("Data type: "+ text.getClass().getName());
		
	}
	
	public static void printDetails(Integer number) {					//supraincarcam metoda
		System.out.println("Obiect : "+ number);
		System.out.println("Data type: "+ number.getClass().getName());
	}
*/
	
	
}
