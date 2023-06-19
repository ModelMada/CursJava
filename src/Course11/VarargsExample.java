package Course11;
import java.util.*;

public class VarargsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printCeva("unu","doi");
		printCeva("unu","doi","trei","patru");
		
		String[] array = {"text","text1"};
		System.out.println(array);
		System.out.println(Arrays.toString(array));	//metoda de printare array
	}
	
	// in Selenium vom folosi javaScriptExecutor -> facem inject de java script direct in DOM
	// executeScript("script JS", element)
	// executeScript("script JS", element, element2, element3,...)
	
	
	public static void printCeva(String...text) {
		
		//System.out.println(text);
		
		for(String element : text) {
			System.out.println(element);
		}
	}
	
	public static void printAltceva(int numar, boolean flag, String...values) {				//varargs trebuie sa fie ultimul declarat, se permite o singura declaratie de varargs
		
		for(String element : values) {
			System.out.println(element);
		}
	}

}
