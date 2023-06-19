package Course11;

import java.util.*;

public class FindDuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> numeDuplicat = new HashSet<>();
		
		String[] names = {"Ion","Maria","Oana","Ion","Oana","Ion","Bogdan","Ion","Maria","Oana"};
		
		for(int i=0; i< names.length;i++) {
			for(int j = names.length -1; j>i; j--) {
				
				if(names[i].equals(names[j])) {
					// System.out.println("nume duplicat: " +names[i]);
					numeDuplicat.add(names[i]);
				}
				
			}
		}
		
		System.out.println("---------------");
		
		for(String element : numeDuplicat) {
			System.out.println("nume duplicat: " + element);			// duplicatele nu sunt adaugate in set
		}

	}

}
