package TemaCourse3;
import java.util.Scanner;

public class PunctajExamen {
	
	int punctaj;
	
	public void addScore() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduceti punctajul: ");
		punctaj = scan.nextInt();
		scan.close();
		
	}

	public void compareScore() {
		addScore();
		if(punctaj > 0 && punctaj <65) {
			System.out.println("Ai picat. Mai incearca!");}
			else {
				if (punctaj >=66) {
					System.out.println("Felicitari, ai trecut!");
				}
				else
					System.out.println("Valoare invalida");
			}
		}
	}
