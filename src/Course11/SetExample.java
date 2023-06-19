package Course11;

import java.util.*;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = new HashSet<>();
		
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		
		set.add("mov");
		set.add("alb");
		set.add("rosu");
		set.add("galben");
		set.add("alb");
		set.add("galben");
		
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		
		System.out.println("------------------");
		
		for(String element : set) {
			System.out.println(element);			// duplicatele nu sunt adaugate in set
		}
		
		System.out.println(set.contains("mov"));
		System.out.println(set.contains("roz"));
		
		System.out.println("-----------------------");
		
		set.remove("galben");
		
		System.out.println(set.size());
		
		for(String element : set) {
			System.out.println(element);			// duplicatele nu sunt adaugate in set
		}
		
		System.out.println("--------------");
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());			///acelasi lucru cu for each, fo eachh apeleaza in spate un iterator
			
		}
		
		set.clear();
		System.out.println(set.size());

	}

}
