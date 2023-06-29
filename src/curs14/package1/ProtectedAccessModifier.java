package curs14.package1;

public class ProtectedAccessModifier {
	
	
	/*
	 * Protected
	 * Scopul lui este in acelasi pachet si sub-clase din pachete diferite
	 * Clasele nu pot fi declarate ca protected
	 * 
	 * Accesibilitate:
	 * Aceeasi clasa: yes
	 * Alta clasa in acelasi pachet: yes
	 * Sub-clasa/clasa copil in acelasi pachet: yes
	 * Sub-clasa in alt pachet: yes
	 * Alta clasa in alt pachet: no
	 */


	protected String mesaj = "Protected access!";
	
	protected void printMesaj() {
		
		System.out.println(mesaj);
		
	}
	
	public static void main(String[] args) {
		
		ProtectedAccessModifier obj = new ProtectedAccessModifier();			///asa cream obiect cand variabila este definita in afara metodei, la nivel de clasa
		obj.printMesaj();

	}

}
