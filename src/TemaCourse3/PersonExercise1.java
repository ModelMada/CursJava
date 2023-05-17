package TemaCourse3;

import java.util.Scanner;

public class PersonExercise1 {
	int pers1;
	
	public void askTheAge() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Varsta persoanei este: ");
		pers1 = scan.nextInt();
		scan.close();
	}
	
	public void compareTheAge(){
		askTheAge();
		if (pers1<18) {
			System.out.println("Esti minor");
		} else
			if(pers1>=18 && pers1 <=65) {
				System.out.println("Esti adult");
			}
			else
			{System.out.println("Esti batran");
		
	}

}
}
