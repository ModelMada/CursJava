package temaCurs11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Curs11ExercitiuSortareArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] textArray = {"Alba", "Iasi", "Bacau", "Constanta"};
		Integer[] intArray = {100, 500, 300, 400, 200};
		
		System.out.println("------------textArray----------------");	
		printDetails(textArray);
		for(String text : textArray) {
			System.out.println(text);
		}
		
		System.out.println("------------intArray----------------");	
		printDetails(intArray);
		for(int no : intArray) {
			System.out.println(no);
		}
			
		
	//	Character[] charArray = {"a", "b", "c", "d"};
		
		System.out.println("------------ARRAY1----------------");	
		System.out.println("Array inainte de sortare: ");
		for(String text : textArray) {
			System.out.println(text);
		}
		
		System.out.println("-------------------");
		System.out.println("Array dupa de sortare: ");
		Arrays.sort(textArray);
		for(String text : textArray) {
			System.out.println(text);
		}
		
		System.out.println("------------ARRAY2----------------");
		System.out.println("Array inainte de sortare: ");
		for(int no : intArray) {
			System.out.println(no);
		}
		
		System.out.println("-------------------");
		System.out.println("Array dupa de sortare: ");
		Arrays.sort(intArray);
		for(int no : intArray) {
			System.out.println(no);
		}
				
	}
	
	public static <T extends Comparable<? super T>> void printDetails(T[] obj) {						//referinta catre parametrul Generic Example, parametru generic
		for(int i=0; i < obj.length -1; i++) {
			int min = i;
			for(int j=i+1; j<obj.length; j++) {
				if(obj[j].compareTo(obj[min])<0) {
					min = j;
				}
			}
			T temp = obj[i];
			obj[i]=obj[min];
			obj[min] = temp;
		}	
		
	}

}
