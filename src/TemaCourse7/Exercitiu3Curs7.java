package TemaCourse7;
import java.util.Scanner;

public class Exercitiu3Curs7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduceti numerele");
		int [] numbers = new int[10];
		int index = 0;
		
		/*
		while(index<10) {
			int z= scan.nextInt();
			numbers[index]=z;
			if(numbers[index]%2==0) {
				System.out.println("-----------"+numbers[index]+"------------");
			}
			index ++;
		}
		*/
		
		for(int i=0;i<10;i++) {
			int x = scan.nextInt();
			numbers[index]=x;
			if(numbers[index]%2==0) {
				System.out.println("-----------"+numbers[index]+"------------");
			}
		}
		
	}
}
		
	
