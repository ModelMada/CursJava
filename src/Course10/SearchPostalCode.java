package Course10;
import java.util.*;

public class SearchPostalCode {

	public static void main(String[] args) throws CodPostalException {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);		
		CoduriPostale codPostal = new CoduriPostale();
		
		do {
			System.out.println("Introdu un cod postal: ");
			int cod = scan.nextInt();
			
			try {
				if(codPostal.cp.containsKey(cod)) {
				System.out.println(codPostal.cp.get(cod));
				break;
			} else {
				throw new CodPostalException("Codul postal nu exista!");  ///nu se mai executa nimic, intrerupe executia si ma scoate din do while
			}
			
			}catch(CodPostalException e) {		//cand exceptia e prinsa, intra pe catch, nu mai intrerupe executia programului si continua cu do while
				e.printStackTrace();
			}
		}while(true);
		
		scan.close();
		
	}

}
