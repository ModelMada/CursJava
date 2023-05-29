package Course7;

import java.util.Random;

public class RandomnUmbers {
	
	/*
	 * facem un program care genereaza 6 numere random intre 0 si 9
	 * numerele le tinem intr-un array
	 * nu tinem numere duplicate
	 * printam arrayul
	 * 
	 * o metoda care genereaza numerele si le pune in array (are return type array)
	 * o metoda care nu permite duplicate
	 * o metoda care printeaza arrayul
	 * 
	 * constantele se scriu cu CAPS, valaorea ei nu se schimba pe durata rularii
	 * 
	 */

	public final int LENGTH = 6;
	public final int MAX_NUMBERS = 9;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RandomnUmbers obj = new RandomnUmbers();
	//	obj.generateNumbers();
		obj.afisareArray(obj.generateNumbers());
		}
	
	public int[] generateNumbers() {
		Random random = new Random();
		int[] numbers = new int[LENGTH];
		int index = 0;		
		while(index<LENGTH) {
			numbers[index] = random.nextInt(9);
			//verific array la feicare nr generat daca a fost adaugat sau nu
			//daca a fost adaugat nu il adaug
			//daca nu a fost adaugat il adaug
			int randomnr = 0;

			while(checkDuplicate(randomnr, numbers)) {
				randomnr = random.nextInt(9);
			}
			
			numbers[index] = randomnr;		
			index++;
		}
		
		return numbers;
	}
	
	public void afisareArray(int[] array) {
		for(int nr : array) {
			System.out.print(nr + " | ");
		}
		
	}
	
	public boolean checkDuplicate(int element, int[] array) {
		
		for(int nr: array) {
			if(element == nr) {
				return true;
			}
		}
		return false;
	}
	
	

}
