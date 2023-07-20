package temaCurs10;
import java.util.*;

public class CautaElevCatalog {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner scan = new Scanner(System.in);
			CatalogElevi elev = new CatalogElevi();
					
				System.out.println("Cum te numesti? ");
				String nume = scan.next();
				System.out.println("Ce nota ai luat?");
				int nota = scan.nextInt();
				
				if(elev.catalog.containsKey(nume)) {
					if(nota > elev.catalog.get(nume)) {
						elev.catalog.put(nume, nota);
						System.out.println(elev.catalog.get(nume));
	//					System.out.println(elev.catalog);
						}else 
							{System.out.println("Nu ai nevoie de alta nota!");							//Daca elevul se regaseste si nota este mai mica decat nota existenta in catalog, printam “Nu ai nevoie de alta nota”
	}
					
				}
				else
				{elev.catalog.put(nume,nota);
				System.out.println("Nu aveai nota, ti-am trecut acum!");								//Daca elevul nu se regaseste in catalogul existent il adaugam cu tot cu nota si printam “Nu aveai nota, ti-am trecut acum!
	
				}
				
			scan.close();
			System.out.println("-----------------------------");
			System.out.println("Catalogul clasei: ");
			System.out.println(elev.catalog);
			
		}
	
	}
