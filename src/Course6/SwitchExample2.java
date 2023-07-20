package Course6;
import java.util.Scanner;
public class SwitchExample2 {
	
	/*
	 * Facem un program care verificad aca un student este eligibil pentru bursa
	 * Conditiile sunt
	 * sa fie anul 3
	 * sa aiba un punctaj de 80 pentru burrsa 1
	 * sa aiba un punctaj de 50 pentru bursa 2 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int an;
		int punctaj;
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu ce an esti:");
		an = scan.nextInt();
		// System.out.println("Te rog introdu punctajul: ");
		// punctaj = scan.nextInt();
		
		switch(an) {
		case 3:
			System.out.println("Te rog introdu punctajul: ");
			punctaj = scan.nextInt();
			switch(punctaj) {
			case 80:
				System.out.println("Esti eligibil pt bursa1! ");
				break;
			case 50:
				System.out.println("Esti eligibil pt bursa2! ");
				break;
			default:
				System.out.println("nu esti eligibil!");
			}
			break;		
		default: 
			System.out.println("nu esti eligibil");
	}
	}
}
