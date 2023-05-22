package Course5;
import java.util.Scanner;

public class WageCalculator {
	
	/*
	 * facem un program care calculeaza salariul pe o saptamana
	 * intrebam utilizatorul cate ore a lucrat
	 * calculam doar daca a lucrat maxim 40 ore sau minim o ora
	 * daca introduce un nr invalid de ore il rugam sa introduca din nou
	 * 
	 * salariul = nrDeOreLucrate *20
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduceti numarul de ore: ");
		Scanner scan = new Scanner(System.in);
		
		int nrOreLucrate = scan.nextInt();
		
		while(nrOreLucrate<1 ||nrOreLucrate>40) {
			System.out.println("nr ore invalid, te rog introdu un nr intre 1 si 40");
			System.out.println("Te rog introduce nr de ore lucrate: ");
			nrOreLucrate = scan.nextInt();			
		}
		System.out.println("Salariul tau este: "+ nrOreLucrate*20);
		scan.close();
	
	}

}
