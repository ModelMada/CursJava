package TemaCourse6;

import java.util.Scanner;

public class Curs6Exercitiu1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan  =  new Scanner(System.in);
		System.out.println("Te rog introdu vechimea: ");
		int vechime = scan.nextInt();

		
		switch(vechime) {
		case 1:
			System.out.println("Bonusul este 100!");
			break;
		case 2:
			System.out.println("Bonusul este 200!");
			break;
		case 3:
			System.out.println("Te rog introdu valoarea vanzarilor efectuate: ");
			int valoareVanzari = scan.nextInt();
			System.out.println("Te rog introdu luna in care s-au efectuat vanzarile: ");
			int luna = scan.nextInt();
			
			if(valoareVanzari<=5000) {
				System.out.println("Bonusul este 600!");
			}
				else {
					if(valoareVanzari<=10000) {
						switch(luna) {
						case 1:
						case 2:
						case 3:
						case 4:
						case 5:
						case 6:
							System.out.println("Bonusul este 800!");
							break;
						case 7:
						case 8:
						case 9:
						case 10:
						case 11:
							System.out.println("Bonusul este 1000!");
							break;
						case 12:
							System.out.println("Bonusul este 900! In decembrie se vand singure!");	
						break;
						default:
							System.out.println("introduce o luna valida");
						}
					}
					else {
						System.out.println("Bonusul este 1000!");
					}
				}
			}
	}
}
