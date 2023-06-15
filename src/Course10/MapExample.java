package Course10;
import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> map = new HashMap<>(); 			//hashmap este copilul clasei Map, nu am definit dimensiunea cum as face la array, cheie si strig 
		//check size of map -->> return type int
		System.out.println(map.size());
		//check if map is Empty or not ---> return boolean
		System.out.println(map.isEmpty());
		//add objects to map
		map.put("T", "Tester");
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		map.put("D", "Developer");   // D este cheie; este ca la variabile, avem obiect si valoare, obiectul este cheia, valoarea este dupa
		map.put("P", "ProductOwer");  //M este cheie
		map.put("M", "Manager");
		
		System.out.println(map);
		
		//get value from map
		System.out.println(map.get("M"));
		
		
		System.out.println("------------------------");
		//get all keys
		for(String key : map.keySet()) {
			System.out.println(key);
		}
		
		//get all values
		for( String value :  map.values()) {
			System.out.println(value);
		}
		
		//remove
		System.out.println("Before update: "+ map);
		map.remove("M");
		map.put("P", "Product Manager");			// a suprascris pe cheia existenta
		map.put("PM", "Product Manager");			//valorile duplicat sunt permise
		//update key
		map.replace("T", "Automation");
		System.out.println("After update: "+ map);
		System.out.println("------------------------");
		
		
		//check if specified key is map
		System.out.println(map.containsKey("M"));
		System.out.println(map.containsKey("X"));
		System.out.println("-------------------------");
		
		
		//check if specified value is in map
		System.out.println(map.containsValue("Automation"));
		System.out.println(map.containsValue("Tester"));

	}

}
