package temaCurs11;

import java.io.IOException;
import java.util.Scanner;

import Course11.PropertiesFileProcessor;
import Course14.TransformToString;

public class TestLegumePropFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		LegumePropFileProcessor obj = new LegumePropFileProcessor();
		obj.writeVegetablePropFile();
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduceti o leguma: ");
		
		boolean flag = true;
		do {
		
		String leguma = scan.next();
		String caloriiLeguma = obj.readCalories(leguma);
		
		if(caloriiLeguma != null) {
			System.out.print("Leguma aleasa de tine are: " );
			obj.readCalories(leguma); 
			flag = false;
		}
	
		else {
			System.out.println("nu vindem aceasta leguma!");	
			flag = true;
		}
		
		}while(flag);
		
		//de clarificat de ce nu intra in bucla si de ce printeaza mereu si valoarea, nu doar cheia
	
}
}
