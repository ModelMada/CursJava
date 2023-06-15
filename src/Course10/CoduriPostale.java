package Course10;
import java.util.*;

/*
 * 
 * Facem un program care returneaza un oras pe baza unui cod postal;
 * Avem nevoie de o clasa care sa contina inca de la initializare o serie de coduri postale -----> facem un obiect de tip CoduriPostale prin constructor
 * si orasele asociate lor (6 coduri)
 * Avem nevoie de o functionalitate care sa ne permita sa cautam pe baza unui cod si sa returneze orasul
 * Daca codul nu exista, vreau sa arunc CodPostalException
 * Daca codul exista, vreau sa printez orasul
 * Daca codul nu exista, vreau sa intreb din nou pana primesc un cod valid
 * 
 * 
 */

public class CoduriPostale {
	
	Map<Integer,String> cp; 
	
	public CoduriPostale() {				//constructor 
		cp = new HashMap<>();
		cp.put(404, "Cluj");
		cp.put(250, "Iasi");
		cp.put(621, "Pitesti");
		cp.put(541, "Buzau");
		cp.put(100, "Ploiesti");
		cp.put(894, "Constanta");
	}
	
	

}
