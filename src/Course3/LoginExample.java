package Course3;
import java.util.Scanner;
/*Facem un program care citeste de la tastatura un user si o parola si le verifica daca sunt la fel ca urmatoarele:
 * string "TestUser" -> username
 * int 1234 -> parola
 * Daca sunt la fel printeaza "Login successful"
 * daca nu sunt la fel printeaza: "username or password is incorrect"
 */
public class LoginExample {
	public String username;
	public int password;
	
	public void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the username: ");
		username = scan.next();
		System.out.println("Please enter the password: ");
		password = scan.nextInt();
		scan.close();
	}
	//pentru String folosim intotdeauna operatorul equals pentru comparare
	// && --> and operator
	// || -> or operator
	public void checkCredentials() {
		if (username.equals("TestUser") && password == 1234) {
			System.out.println("Login is successful!");
		}
		else 
		{System.out.println("Username or password is incorrect!");
	}
}
}
