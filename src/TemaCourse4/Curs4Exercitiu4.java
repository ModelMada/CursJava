package TemaCourse4;
import java.util.Scanner;

public class Curs4Exercitiu4 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	addNumbers();	

	}
	
	public static void addNumbers() {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		for(int i=1; i<=10; i++) {
			int nr;
			System.out.println("Please enter number "+ i+": ");
			nr=scan.nextInt();
			sum +=nr;
		}
		System.out.println("The sum of the numbers is: "+ sum);
		scan.close();
	}

}
