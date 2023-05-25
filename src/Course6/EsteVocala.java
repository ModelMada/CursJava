package Course6;
import java.util.Scanner;

public class EsteVocala {
	
	/*
	 * Verific daca o litera este consoana sau vocala
	 * Folosesc un switch
	 * citesc litera de la tastatura
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Te rpg introdu o litera: ");
		Scanner scan = new Scanner(System.in);
		char litera = scan.next().charAt(0); //aduc doar caracterul de pe pozitia 0
		
		//aeiouAEIOU
		//if(litera == 'a' ||litera == 'e' || litera == 'i')
		
		switch(litera) {
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
		case 'A' :
		case 'E' :
		case 'I' :
		case 'O' :
		case 'U' :
			System.out.println("Este vocala!");
			break;
		default:			//i loc de if
			System.out.println("Este consoana!");
		}

	}

}
