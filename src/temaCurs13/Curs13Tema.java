package temaCurs13;
import java.lang.*;

public class Curs13Tema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		countOccurence("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam consectetur odio ac quam commodo, eu eleifend felis imperdiet. Integer bibendum nunc quis sem faucibus, vitae laoreet mi dignissim. Praesent eget ligula nec lorem varius malesuada. Nulla neque lacus, euismod quis erat nec, convallis vestibulum augue. Nullam et aliquet justo. Aliquam erat volutpat. Nulla elementum urna in dolor viverra, in efficitur lectus mattis.");
		System.out.println("---------------------");
		countSentences("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam consectetur odio ac quam commodo, eu eleifend felis imperdiet. Integer bibendum nunc quis sem faucibus, vitae laoreet mi dignissim. Praesent eget ligula nec lorem varius malesuada. Nulla neque lacus, euismod quis erat nec, convallis vestibulum augue. Nullam et aliquet justo. Aliquam erat volutpat. Nulla elementum urna in dolor viverra, in efficitur lectus mattis.");
		System.out.println("---------------------");
		deleteCharA("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam consectetur odio ac quam commodo, eu eleifend felis imperdiet. Integer bibendum nunc quis sem faucibus, vitae laoreet mi dignissim. Praesent eget ligula nec lorem varius malesuada. Nulla neque lacus, euismod quis erat nec, convallis vestibulum augue. Nullam et aliquet justo. Aliquam erat volutpat. Nulla elementum urna in dolor viverra, in efficitur lectus mattis.");
		System.out.println("---------------------");
		replaceCharO("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam consectetur odio ac quam commodo, eu eleifend felis imperdiet. Integer bibendum nunc quis sem faucibus, vitae laoreet mi dignissim. Praesent eget ligula nec lorem varius malesuada. Nulla neque lacus, euismod quis erat nec, convallis vestibulum augue. Nullam et aliquet justo. Aliquam erat volutpat. Nulla elementum urna in dolor viverra, in efficitur lectus mattis.");
		
		
	}
	
	public static void countOccurence (String text) {
		String[] sb = new String[text.length()];
 		String searchedWord = "Nulla";
 		int count = 0;
		sb = text.split(" ");		//creeaza un array de stringuri din cuvintele despartite de spatiu
		for(String s : sb) {
			if(searchedWord.equals(s)){
				count++;		
			}
		}
		System.out.println("Occurence for 'Nulla' is: " + count);				
	}
	
	public static void countSentences (String text) {
		String[] sb = new String[text.length()];
		int count = 0;
		sb = text.split("\\.");
		for(String s : sb) {
				System.out.println(s);	
				count++;
			}
		System.out.println(count);
		}
	
	public static void deleteCharA(String text) {
		StringBuilder sb = new StringBuilder(text);		
		for(int i = 0; i < sb.length(); i++) {
			if(sb.charAt(i)=='a') {
				sb.deleteCharAt(i);
				i++;
			}
		}
		System.out.println(sb);	
	}
	
	public static void replaceCharO(String text) {
		StringBuilder sb = new StringBuilder(text);		
		for(int i = 0; i < sb.length(); i++) {
			if(sb.charAt(i)=='o') {
				sb.deleteCharAt(i);
				sb.insert(i, "#");
				i++;
			}
		}
		System.out.println(sb);	
	}
}

//de inteles cand trebuie facute string buildere in loc de string normal
