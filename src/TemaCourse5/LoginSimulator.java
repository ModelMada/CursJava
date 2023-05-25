package TemaCourse5;
import java.util.Scanner;


public class LoginSimulator {
//	static String username2 = "";
//	static int password2 = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String username = "";
		int password = 0;
		String username1 = "TestUser";
		int password1 = 1234;
		int incercare=0;
		
//		askTheUser();
//		if(username1.equals(username2)&&password1==password2) {
//			System.out.println("Login successful!");
//			break;
		
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Introduceti credentialele: ");
			username = scan.next();
			password = scan.nextInt();
			
			if(username1.equals(username)&&password1==password) {
				System.out.println("Login successful!");
				break;
			}else {
				System.out.println("Login error!");
				incercare ++;
			} 
		}while(incercare < 3);
			
			scan.close();
			
			if(incercare ==3) {
				System.out.println("Maximum attempts reached. User blocked!");
			}
			
	
		}
	
//	public static void askTheUser() {
	//	String username2 = "";
	//	int password2 = 0;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Introduceti credentialele: ");
//		username2 = scan.next();
//		password2 = scan.nextInt();
//		scan.close();
		
	}
	}

