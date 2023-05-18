package Course4;
import java.util.Scanner;

public class LetterSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Facem un program care citeste un text de la tastatura
		 * in text cautam litera a sau A
		 * daca o gasim, printam ca am gasit litera si de cate ori
		 * daca nu o gasim, printam ca litera a nu exista in text
		 * 
		 */
		
		System.out.println("Introduceti textul: ");
		Scanner scan = new Scanner(System.in);
		String text = scan.next();
		
		System.out.println(text.length());
		
		//masina
		//012345
		int y = 0;
		
		for (int i =0;i<text.length();i++) {
			if(text.charAt(i) =='a' || text.charAt(i) == 'A') {
				y++;
			}
		}
		// System.out.println("Am gasit litera a de "+ y + "ori!");
		String result = y ==0 ? "nu exista in text!":"Am gasit litera de"+ y +" ori" ;
		System.out.println(result);
	}

}
