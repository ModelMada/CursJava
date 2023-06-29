package curs14.package1;

public class SubClassProtectedModifier extends ProtectedAccessModifier {		//nu fac un obiect al clasei parinte, vrem sa vedem daca variabila este dispoibila in clasa copil

	/*
	 * Subclasa in acelasi pachet
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClassProtectedModifier obj = new SubClassProtectedModifier();
		obj.printMesaj();
	}

}
