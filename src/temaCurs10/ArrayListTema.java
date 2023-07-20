package temaCurs10;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		List<String> list3 = new ArrayList<>();
		
		list1.add("Product1");
		list1.add("Product2");
		list1.add("Product3");
		list1.add("Product4");
		list1.add("Product5");
		
		list2.add("Product1");
		list2.add("Product2");
		list2.add("Product6");
		list2.add("Product4");
		list2.add("Product8");
		
		for(String element1 : list1) {
			if(list2.contains(element1)){					//list3.add(list2.contains(element1)) ? "Yes" : "no"
				list3.add("yes");			
			}
			else
			{list3.add("no");
		}
		}
	
		for(String element3 : list3) {
			System.out.println(element3);
		}
		System.out.println("-----------------");
		
		System.out.println(list3);

}
}

