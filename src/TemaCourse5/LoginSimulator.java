package TemaCourse5;
import java.util.Scanner;


public class LoginSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String username = "";
		int password = 0;
		String username1 = "TestUser";
		int password1 = 1234;
		int incercare=0;
		
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
	}

