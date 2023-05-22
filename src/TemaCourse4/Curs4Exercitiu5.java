package TemaCourse4;
import java.util.Scanner;

public class Curs4Exercitiu5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		calculeazaTablaInmultirii();

	}
	
	public static void calculeazaTablaInmultirii() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduceti numarul pentru care vom afisa tabla inmultirii: ");
		int numar = scan.nextInt();
		for(int i=1; i<=10; i++) {
			System.out.println("Rezultatul inmultirii lui "+ numar + " cu "+ i + " este "+ numar * i);
		}
		scan.close();
	}

}
