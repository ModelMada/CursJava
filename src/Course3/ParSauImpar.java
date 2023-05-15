package Course3;

import java.util.Scanner;

public class ParSauImpar {
	int number;
	public void askTheUser() {
		
		Scanner scan = new Scanner(System.in);   ///iau din consola, scriu de la tastatura
		System.out.println("Please enter a number: ");
		number = scan.nextInt(); //daca aveam int number era variabila locala, paote fi folosita doar aici
		scan.close();
	}

	//= operator de atribuire x=8 lui x ii atribui valoarea 8
	// == operator de comparatie x==8 verific daca x are valaorea 8
	
	public void checkIfOddOrEven() {
		
		if(number%2==0) {
			System.out.println(number + " este par");
		}
			
		else {
			System.out.println(number + " este impar");
	}
	
	}
}
