package Course6;

import java.util.Scanner;

public class SwitchExample {
	/*
	 * Intreb utilizatrorul un calificativ
	 * In functie de calificativ printez:
	 * A-> Felicitari!
	 * B-> Destul de bine!
	 * C-> Suficient!
	 * D-> Insuficient!
	 * Daca introduce alt calificativ printez nota invalida
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Te rog introdu un calificativ: ");
		Scanner scan  =  new Scanner(System.in);
		String calificativ = scan.next();
		
		switch(calificativ.toUpperCase()) {
		
		case "A":
			System.out.println("Felicitari!");
			break;
		case "B":
			System.out.println("Destul de bine");
			break;
		case "C":
			System.out.println("Suficient!");
			break;
		case "D":
			System.out.println("Insuficient!");
			break;
		default:
			System.out.println("nota invalida");
			break;
			
		}
		
		

	}

}
