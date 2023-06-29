package curs14.package2;

import curs14.package1.ProtectedAccessModifier;

public class OtherClassProtectedModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProtectedAccessModifier obj = new ProtectedAccessModifier();
		obj.printMesaj();		//nu exista relatia de mostenire deci nu poate rula metoda protected

	}

}
