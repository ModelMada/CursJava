package Course11;

import java.util.*;

public class ArraysConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] numbers = {1,2,3,4,5,1,2,3,4,5,1,2,3,4,5};
		
		Set<Integer> setnUmbers = new HashSet<Integer>(Arrays.asList(numbers));			//elimin duplciatele din array fara sa parcurg arrayul
				
		for(Integer num : setnUmbers) {
			System.out.print(num);
					
				}
		
		List<Integer> listnUmbers = new ArrayList<Integer>(Arrays.asList(numbers));		//pastreaza duplciatele
		System.out.println("--------------");
		for(Integer num: listnUmbers) {
			System.out.print(num);
		}

	}

}
