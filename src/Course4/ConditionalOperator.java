package Course4;
import java.util.Scanner;

/*
 * Program care citeste de la tastatura 2 numere si verifica urmatoarele
 * - daca fiecare numar este pozitiv 
 * - daca ambele nr sunt pozitive
 * - care dintre cele doua este cel mai mic (verificam daca sut egale)
 * 
 * Printam:
 * Ex: num 1 este pozitiv
 * num2 este pozitiv
 * numerele sunt pozitive
 * 
 * 
 * implementare cu if-else
 * implementare cu ternary (conditional) operator
 */

public class ConditionalOperator {
	
	public static void main(String[] args) {
		int num1, num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu primul numar: ");
		num1 = scan.nextInt();
		System.out.println("Te rog introdu al doilea numar: ");
		num2 = scan.nextInt();
		
		if (num1>0) {
			System.out.println("num1 este pozitiv");
		} else {
			System.out.println("num2 este negativ");
		}
		
	//	String result = (num1>0)?"num1 este pozitiv":"num2 este negativ";
		
		if (num2>0) {
			System.out.println("num2 este pozitiv");
		} else {
			System.out.println("num2 este negativ");
		}
		
		if(num1>0 && num2>0) {
			System.out.println("Ambele sunt pozitive");
		} else {
			System.out.println("Cel putin un nr este negativ");
		}
		
		if(num1>num2) {
			System.out.println("num1 este mai mare!");
		}else if (num2>num1) {
			System.out.println("num2 este mai mare!");				
		}else {System.out.println("sunt egale!");
	}
		
		System.out.println("--------------------------------------------");
		
		//result = conditie ? expresie1(true):expresie2(false)
		
		String result = (num1>0)?"num1 este pozitiv":"num1 este negativ";
		System.out.println(result);
		result = (num2>0)?"num2 este pozitiv":"num2 este negativ";
		System.out.println(result);
		result = (num1>0&&num2>0)?"nr sunt pozitive":"cel putin un nr e negativ";
		System.out.println(result);
		
		result = (num1>num2)?"num1 este mai mare":(num2>num1)?"num2 este mai mare":"Sunt egale";
		System.out.println(result);
		
		
		

}
}
