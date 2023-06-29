package curs14.package1;

class DefaultAccessModifier {			//nu pun access modifier la clasa, se considera a fi DEFAULT; restrictiile vor fi in alte pachete si nu va functiona deloc nici macar in relatia de mostenire

	/*
	 * 
	 * Default inseamna ca nu speficicam niciun access modifier
	 * Scopul lui este limitat la pachetul in care se afla
	 * 
	 * Acceasi clasa: yes
	 * Sub-clasa acelasi pachet: yes
	 * Alta clasa in acelasi pachet: yes
	 * 
	 * Sub-clasa in alt pachet: no
	 * Alta clasa in alt pachet: no
	 * 
	 */
	
	String mesaj = "Default modifier";
	void printMesaj() {
		
		System.out.println(mesaj);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultAccessModifier obj = new DefaultAccessModifier();
		obj.printMesaj();
	}

}
