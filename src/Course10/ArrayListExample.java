package Course10;
import java.util.*;


public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		
		list.add("Oana");
		list.add("Ion");
		list.add("Maria");
		list.add("Gabriel");
		
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		
		for(String nume : list) {
			System.out.println(nume);
		}
			
		
		System.out.println("---------------");
		
		list.add("Carmen");
		for(String nume : list) {
			System.out.println(nume);
		}
		
		System.out.println("-----------------");
		list.add(0, "George");
		
		for(String nume : list) {
			System.out.println(list.indexOf(nume)+ " : "+ nume);
		}
		
		System.out.println("Element index 4: "+list.get(4));
		
		System.out.println("----------------------------");
		
		//add in list
		list.add(6,"Ioana");
		for(String nume : list) {
			System.out.println(list.indexOf(nume)+ " : "+ nume);
		}
		
		//remove from list
		System.out.println("--------------------------");
		list.remove(2);
		list.remove("Maria");
		for(String nume : list) {
			System.out.println(list.indexOf(nume)+ " : "+ nume);
		}
		
		
		//remove all from list
		list.clear();
		System.out.println(list.isEmpty());

	}

}
