package TemaCourse4;
import java.util.Scanner;


public class Curs4Exercitiu3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduceti punctajul obtinut: ");
		int punctaj = scan.nextInt();
		
		String nota = (punctaj >= 90)?nota = "FB":(punctaj>=80&&punctaj<90)?nota = "B":"S";
		String rezultat = (nota.equals("FB"))?"Ai primit: FoarteBine!":(nota.equals("B")?"Ai primit: Bine":"Ai primit: Suficient!");
		System.out.println(rezultat);
		
		scan.close();
	}

}
