package Course5;

import java.util.Scanner;

public class DiceGame {
	
	/*
	 * Facem un joc de zaruri unde avem urmatoarele reguli:
	 * 1. daca userul da in total: 2, 6, 12 ->> pierde jocul
	 * 2. daca userul da in total: 7, 11 -->> castiga jocul
	 * 3. daca userul da in total: 3, 10 --->> repeta automat aruncarea
	 * 4. daca userul da oricare alta varianta decat cele de mai sus, il intrebam daca vrea sa mai dea o data
	 * raspunsul trebuie sa fie un boolean: true sau false
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean continuaJocul = true;
		
		while(continuaJocul) {
			int dice1 = (int) (Math.random()*6+1); ///math.random returneaza valori double, facem cast ca sa returneze int
			int dice2 = (int) (Math.random()*6+1);
			int total = dice1+dice2;
			System.out.println("Ai dat: " +total);
			if(total ==2 || total ==6 || total ==12) {
				System.out.println("Ai pierdut jocul!");
				break;								////continuaJocul = false
			} else if(total == 7 || total ==11) {
				System.out.println("Ai castigat jocul!");
				break;
			}else if(total == 3 || total==10) {
				System.out.println("Automat mai dai o data!");
				break;
			}else {
			System.out.println("Doresti sa mai dai o data?");
			Scanner scan = new Scanner(System.in);
			continuaJocul = scan.nextBoolean();
			scan.close();
			}

		}
		System.out.println("Game over!");

	}

}
