package Course10;
import java.util.*;


public class ArrayListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>(Arrays.asList("verde","alb","galben","Rosu","negru","mov"));
		
		System.out.println(list.size());
		list.add("roz");
		System.out.println(list.size());
		
		System.out.println(list.contains("gri"));
		System.out.println(list.contains("roz"));
		
		System.out.println("-------------------------------");
		
		//update
		System.out.println("before update: "+ list);
		list.set(3, "red");
		System.out.println("after update: "+ list);
		
		//workig with range
		System.out.println(list.subList(1, 3)); // indexul 3 nu se ia in considerare
		boolean isThere = list.subList(1, 4).contains("galben");
		System.out.println(isThere);
		list.subList(1, 4).clear();
		System.out.println("After update: "+ list);
	}

}
