package Course3;
/* facem un program care intreaba utilziatorul trei nr
 * verificam care ditre cele 3 nr este cel mai mare si printam corespunzator
 * daca doua nr sunt egale si sunt cele mai mari printam "some numbers are equal"
 * Ex: First number is the greatest!
 */

import java.util.Scanner;

public class GreatestOfThreenr {

	int number1, number2, number3;
	
	public void askThenumbers() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		number1 = scan.nextInt();
		System.out.println("Please enter the second number: ");
		number2 = scan.nextInt();
		System.out.println("Please enter the third number: ");
		number3 = scan.nextInt();
		scan.close();
	}
	
	public void compareThenumbers() {
		if(number1 > number2 && number1 > number3) {
			System.out.println("First number is the greatest!");
		}else if(number2 > number1 && number2 > number3){
			System.out.println("Second number is the greatest!");
		} else if(number3 > number1 && number3 > number2){
			System.out.println("Third number is the greatest!"); 
			}
		else {
			System.out.println("Some numbers are equal!");
		}
	}
}
